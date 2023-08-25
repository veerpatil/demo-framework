package com.testribe.demo.automation.Pages;

import com.testribe.demo.automation.BaseComponent.Base;
import io.qameta.allure.Allure;
import io.qameta.allure.model.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends Base {


    private static final Logger logger = LoggerFactory.getLogger(LoginPage.class);
    private static final String emailLocator = "#Email";

    private static final String passwordLocator="#Password";

    private static final String loginButton="button[type='submit']";


    public void setEmail(String email)
    {
        page.locator(emailLocator).clear();
        page.locator(emailLocator).type(email);
        Allure.step("Enter UserName",
                Status.PASSED);
        logger.info("UserName");
    }

    public void setPassword(String password) {
        page.locator(passwordLocator).clear();
        page.locator(passwordLocator).type(password);
        Allure.step("Enter Password", Status.PASSED);
        logger.info("UserName");
    }

    public void performLogin() {
        page.locator(loginButton).click();
        Allure.step("Click Element", Status.PASSED);
        logger.info("UserName");
    }

}
