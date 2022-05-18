package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id= "SubmitLogin")
    WebElement signInButton;
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ol[1]/li[1]")
    WebElement emailRequired;
    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Password is required.')]")
    WebElement passwordRequired;
    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Invalid email address.')]")
    WebElement invalidEmail;
    @CacheLookup
    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    WebElement authenticationFailed;
    @CacheLookup
    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signOutText;



    public void enterEmail(String email){
        log.info("Enter email"+ emailField.toString());
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        log.info("Enter password"+ passwordField.toString());
        sendTextToElement(passwordField,password);
    }
    public void clickOnSignInButton(){
        log.info("Click on sign in button"+ signInButton.toString());
        clickOnElement(signInButton);
    }
    public String getEmailErrorMessage(String errorMessage){
        log.info("Get error message"+ emailRequired);
        return  getTextFromElement(emailRequired);
    }
    public String getPasswordErrorMessage(String errorMessage){
        log.info("Get password error"+passwordRequired);
        return getTextFromElement(passwordRequired);
    }
    public String getInvalidEmailMessage(String errorMessage){
        log.info("Get invalid email error "+ invalidEmail.toString());
        return getTextFromElement(invalidEmail);
    }
    public String getAuthenticationFailed(String errorMessage){
        log.info("Authentication failed"+ authenticationFailed.toString());
        return getTextFromElement(authenticationFailed);
    }
    public String verifySignOutText(){
        log.info("Sign out text"+signOutText.getText());
        return getTextFromElement(signOutText);
    }
    public void clickOnSignOutLink(){
        log.info("Clicking on sign out"+signOutText.getText());
        clickOnElement(signOutText);
    }

}
