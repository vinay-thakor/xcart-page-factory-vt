package com.xcart.demo.testbase;

import com.xcart.demo.basepage.BasePage;
import com.xcart.demo.browserselector.BrowserSelector;
import com.xcart.demo.loadproperty.LoadProperty;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String browser = loadProperty.getProperty("browser");
    String baseUrl = loadProperty.getProperty("baseUrl");

    @BeforeMethod(groups = {"Regression","Smoke","Sanity"})
    public void openBrowser(){
        browserSelector.selectBrowser(browser);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

}
