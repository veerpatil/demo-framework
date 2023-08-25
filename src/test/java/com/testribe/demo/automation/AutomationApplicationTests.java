package com.testribe.demo.automation;


import com.testribe.demo.automation.Pages.LoginPage;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest
@Epic("Login EPic")
public class AutomationApplicationTests  extends TestTribeBaseTest{

	@Autowired
	LoginPage loginPage;



	@Test
	@Description("Verify valid user login")
	void LoginTest() {

	  loginPage.Navigate();
	  loginPage.setEmail("admin@yourstore.com");
	  loginPage.setPassword("admin");
	  loginPage.performLogin();

	}

	@Test
	@Description("Verify valid user login")
	void LoginTestFailed() {

		loginPage.Navigate();
		loginPage.setEmail("admin@yourstore.com");
		loginPage.setPassword("admin");
		loginPage.performLogin();
		Assert.assertTrue(false);

	}
}
