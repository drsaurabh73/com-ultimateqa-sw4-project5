package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class Homepage extends Utility {

    By signInLink = By.linkText("Sign In");
    By welcomeLink = By.xpath("//h1[contains(text(),'Welcome Back!')]");

    public void clickonSignInLink() {
        clickOnElement(signInLink);
    }
    public String verifyWelcomePage() {
        return getTextFromElement(welcomeLink);
    }

}
