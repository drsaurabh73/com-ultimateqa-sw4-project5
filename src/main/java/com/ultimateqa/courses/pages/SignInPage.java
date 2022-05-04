package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By signInLink = By.linkText("Sign In");
    By username  = By.id("user[email]");
    By password = By.name("user[password]");
    By signinButton = By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");
    By invalidMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public void clickonSignInLink() {
        clickOnElement(signInLink);
    }
   public void enterUserName(String userName) {
        sendTextToElement(username,"username");
   }
   public void enterPassWord(String Password) {
        sendTextToElement(password,"password");
   }
   public void clickOnSigInButton() {
        clickOnElement(signinButton);
   }
   public String getErrorMessage() {
        return getTextFromElement(invalidMessage);
   }

}
