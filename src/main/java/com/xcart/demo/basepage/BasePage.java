package com.xcart.demo.basepage;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage  {
    public static WebDriver driver;
    //constructor
    public BasePage(){
        // log4j
        PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/com/xcart/demo/resources/properties/log4j.properties");
        // page factory
        PageFactory.initElements(driver,this);
    }
}
