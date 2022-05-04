package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.Homepage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends TestBase {

    Homepage homepage = new Homepage();
    SignInPage signInPage = new SignInPage();

@Test
    public void userShouldNavigateToLoginPageSuccessfully() {
    homepage.clickonSignInLink();
    homepage.verifyWelcomePage();
    String expectedMessage1 = "Welcome Back!";
    String actualMessage1 = homepage.verifyWelcomePage();

    Assert.assertEquals(actualMessage1,expectedMessage1,"Incorrect Password");

    }
@Test
    public  void verifyTheErrorMessage () {
    homepage.clickonSignInLink();
    signInPage.enterUserName("sampatel@gmail.com");
    signInPage.enterPassWord("123456");
    signInPage.clickOnSigInButton();
    String expectedMessage2 = "Invalid email or password.";
    String actualMessage2 = signInPage.getErrorMessage();


}


}
