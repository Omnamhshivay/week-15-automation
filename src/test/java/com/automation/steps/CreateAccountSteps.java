package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.checkerframework.checker.units.qual.C;

public class CreateAccountSteps {
    @And("^I click on create account button$")
    public void iClickOnCreateAccountButton() {
        new CreateAccountPage().clickOnCreateAnAccountButton();
    }
    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName)  {
        new CreateAccountPage().enterFirstName(firstName);

    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName)  {
        new CreateAccountPage().enterLastName(lastName);

    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String address)  {
        new CreateAccountPage().enterAddressLine(address);

    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city)  {
        new CreateAccountPage().enterCity(city);
    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String state)  {
        new CreateAccountPage().selectStateFromDropDown(state);

    }

    @And("^I enter zipcode \"([^\"]*)\"$")
    public void iEnterZipcode(String zipcode)  {
        new CreateAccountPage().enterZipCode(zipcode);

    }

    @And("^I enter mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobile)  {
        new CreateAccountPage().enterMobileNumber(mobile);

    }

    @Then("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }

    @And("^I enter email to create account \"([^\"]*)\"$")
    public void iEnterEmailToCreateAccount(String email)  {
        new CreateAccountPage().enterEmailToCreateAccount(email);

    }

    @And("^I enter  customer first name \"([^\"]*)\"$")
    public void iEnterCustomerFirstName(String customerFirstName)  {
        new CreateAccountPage().enterCustomerFirstName(customerFirstName);
    }

    @And("^I enter customer last name \"([^\"]*)\"$")
    public void iEnterCustomerLastName(String customerLastName)  {
        new CreateAccountPage().enterCustomerLastName(customerLastName);

    }
}
