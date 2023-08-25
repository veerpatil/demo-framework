package com.testribe.demo.automation;

import com.testribe.demo.automation.Utlis.ScreenShotUtlis;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Lazy;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import java.io.IOException;


@SpringBootTest
public class TestTribeBaseTest extends AbstractTestNGSpringContextTests {


    Logger logger = LoggerFactory.getLogger(TestTribeBaseTest.class);

    @Lazy
    @Autowired
    ScreenShotUtlis utlis;

    @AfterMethod
    public void TakeScreenShot(ITestResult result) throws IOException {
        if(result.getStatus()!=1)
        {
            utlis.TakeScreenShot();
            logger.info("Taken Screenshot");
        }
    }

}
