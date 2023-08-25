package com.testribe.demo.automation.BaseComponent;

import com.microsoft.playwright.Playwright;
import com.testribe.demo.automation.BrowserContext.PlayWrightBrowserContext;
import io.qameta.allure.Allure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Base extends PlayWrightBrowserContext {


    @Value("${url}")
    private String url;

    @Autowired
    public void Navigate()
    {
        page.navigate(url);
        Allure.step("Login to Application:" + url);

    }

}
