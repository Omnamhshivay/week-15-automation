package com.automation.pages;

import com.automation.utility.Utility;
import jdk.nashorn.internal.ir.IfNode;
import org.apache.commons.logging.Log;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "email_create")
    WebElement createEmail;
    @CacheLookup
    @FindBy(id = "SubmitCreate")
    WebElement createAnAccountButton;
    @CacheLookup
    @FindBy(id = "customer_firstname")
    WebElement CustomerFirstname;
    @CacheLookup
    @FindBy(id = "customer_lastname")
    WebElement CustomerLastname;
    @CacheLookup
    @FindBy(id = "passwd")
    WebElement passwordCreate;
    @CacheLookup
    @FindBy(id = "firstname")
    WebElement firstname;
    @CacheLookup
    @FindBy(id = "lastname")
    WebElement lastname;
    @CacheLookup
    @FindBy(id = "address1")
    WebElement addressLine;
    @CacheLookup
    @FindBy(id = "city")
    WebElement cityName;
    @CacheLookup
    @FindBy(id = "id_state")
    WebElement stateList;
    @CacheLookup
    @FindBy(id = "postcode")
    WebElement zipcodeLine;
    @CacheLookup
    @FindBy(id = "phone_mobile")
    WebElement mobileNumberLine;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement registerButton;

    public void enterEmailToCreateAccount(String email) {
        log.info("Enter email to create account" + createEmail.getText());
        sendTextToElement(createEmail, email);
    }

    public void clickOnCreateAnAccountButton() {
        log.info("Click on create account button" + createAnAccountButton.getText());
        clickOnElement(createAnAccountButton);
    }

    public void enterCustomerFirstName(String customerfirstName) {
        log.info("Enter first name " + CustomerFirstname);
        sendTextToElement(CustomerLastname, customerfirstName);
    }

    public void enterCustomerLastName(String customerLastName) {
        log.info("Enter last name " + CustomerLastname.getText());
        sendTextToElement(CustomerLastname, customerLastName);
    }

    public void enterPassword(String password) {
        log.info("Enter password" + passwordCreate.getText());
        sendTextToElement(passwordCreate, password);
    }

    public void enterFirstName(String firstName) {
        log.info("Enter first name" + firstname.getText());
        sendTextToElement(firstname, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("Enter last name" + lastname.getText());
        sendTextToElement(lastname, lastName);
    }

    public void enterAddressLine(String address) {
        log.info("Enter address" + addressLine.getText());
        sendTextToElement(addressLine, address);
    }

    public void enterCity(String city) {
        log.info("Enter city" + cityName.getText());
        sendTextToElement(cityName, city);
    }

    public void selectStateFromDropDown(String state) {
        log.info("Select state" + stateList.getText());
        selectByVisibleTextFromDropDown(stateList, state);

    }

    public void enterZipCode(String zipcode) {
        log.info("Enter zipcode" + zipcodeLine.getText());
        sendTextToElement(zipcodeLine, zipcode);
    }

    public void enterMobileNumber(String mobile) {
        log.info("Enter mobile number" + mobileNumberLine.getText());
        sendTextToElement(mobileNumberLine, mobile);
    }

    public void clickOnRegisterButton() {
        log.info("Click on register button " + registerButton.getText());
        clickOnElement(registerButton);
    }

}
