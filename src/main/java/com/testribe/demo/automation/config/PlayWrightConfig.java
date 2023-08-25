package com.testribe.demo.automation.config;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlayWrightConfig {



    @Value("${headless}")
    Boolean mode;
    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public Page BasePage()
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(mode));
        return browser.newContext().newPage();

    }

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "firefox")
    public Page Firefox()
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(mode));
        return browser.newContext().newPage();

    }


    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "webkit")
    public Page WebKit()
    {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(mode));
        return browser.newContext().newPage();

    }
}
