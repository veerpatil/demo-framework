package com.testribe.demo.automation.Utlis;

import com.microsoft.playwright.Page;
import io.qameta.allure.Allure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
@Lazy
public class ScreenShotUtlis {

    @Autowired
    public Page page;

    public void TakeScreenShot() throws IOException {
        Path path = Paths.get("screenshot.png");
        page.screenshot(new Page.ScreenshotOptions().setPath(path).setFullPage(true));
        try( InputStream is = Files.newInputStream(path))
        {
            Allure.addAttachment("Faliled",is);

        }
    }
}
