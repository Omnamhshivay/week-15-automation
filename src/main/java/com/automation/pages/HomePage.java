package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signInLink;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authenticationText;



    public void clickOnSignInLink(){
        log.info("Clicking on sign in link "+signInLink.getText());
        clickOnElement(signInLink);
    }
    public String getAuthenticationText(){
        log.info("Authentication text"+authenticationText.getText());
        return getTextFromElement(authenticationText);
    }
    public String verifySignInText(){
        log.info("Sign in text"+signInLink.getText());
        return getTextFromElement(signInLink);

    }
}
