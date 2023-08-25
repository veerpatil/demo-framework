package com.testribe.demo.automation.BrowserContext;

import com.microsoft.playwright.Page;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;


public abstract class PlayWrightBrowserContext  {


    @Autowired
    public Page page;

    @PostConstruct
    public Page init()
    {
        return page;
    }
}
