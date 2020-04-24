package com.xcart.demo.TestSuite;

import com.xcart.demo.pages.HomePage;
import com.xcart.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase  extends TestBase {

    HomePage homePage;

    @BeforeMethod(groups = {"Regeression","Smoke","sanity"})
    public void setUp(){
        homePage = new HomePage();
    }

    @Test(priority = 0,groups = {"Regression","Smoke"})
    public void verifyUserShouldClikingOnSignInBtnSuccessfully(){
        homePage.clickOnSignInSignUpBtn();
    }


}
