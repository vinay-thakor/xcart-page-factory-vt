package com.xcart.demo.pages;

import com.xcart.demo.basepage.BasePage;
import com.xcart.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//div/div[3]/button/span")
    WebElement _signInSignUpBtn;

    @FindBy(css = "span#ui-id-3")
    WebElement _signInTxt;

    //methods performing actions on elements
    public void clickOnSignInSignUpBtn() {
        Reporter.log("Clicking on SignIn and Sign Up button : " + _signInSignUpBtn.toString() + "<br>");
       clickOnElement (_signInSignUpBtn);
       log.info("Clicking on SignIn and Sign Up button : " + _signInSignUpBtn.toString());
    }


}
