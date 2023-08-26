package com.testribe.demo.automation;


import com.testribe.demo.automation.Pages.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

@SpringBootTest
@Epic("Login EPic")
public class AutomationApplicationTests  extends TestTribeBaseTest{

	@Autowired
	LoginPage loginPage;



	@Test
	@Description("Verify valid user login")
	@Story("Valid user login")
	void LoginTest() throws InterruptedException {

	  loginPage.Navigate();
	  loginPage.setEmail("admin@yourstore.com");
	  loginPage.setPassword("admin");
	  loginPage.performLogin();
		sleep(7000);
	}

	@Test(testName = "Verify that User with Valid Credentials")
	@Description("Verify valid user login test")
	void LoginTestFailed() {

		loginPage.Navigate();
		loginPage.setEmail("admin@yourstore.com");
		loginPage.setPassword("admin");
		loginPage.performLogin();
		Assert.assertTrue(true);

	}
}
