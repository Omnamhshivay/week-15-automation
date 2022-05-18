package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLink();
    }

    @Then("^I should see the message Authentication$")
    public void iShouldSeeTheMessageAuthentication() {
        String expectedText = "AUTHENTICATION";
        String actualText = new HomePage().getAuthenticationText();
        Assert.assertEquals("Authentication", expectedText, actualText);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) {
        new SignInPage().enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new SignInPage().enterPassword(password);
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() {
        new SignInPage().clickOnSignInButton();
    }

    @Then("^I should get error message \"([^\"]*)\"$")
    public void iShouldGetErrorMessage(String errorMessage) {
        String expectedText = errorMessage;
        String actualText = new SignInPage().getEmailErrorMessage(errorMessage);
        Assert.assertEquals(expectedText, actualText);
    }

    @Then("^I should see sign out button$")
    public void iShouldSeeSignOutButton() {
        String expectedText = "Sign out";
        String actualText = new SignInPage().verifySignOutText();
        Assert.assertEquals(expectedText, actualText);
    }

    @And("^I click on sign out button$")
    public void iClickOnSignOutButton() {

        new SignInPage().clickOnSignOutLink();
    }

    @Then("^I should see sign in link$")
    public void iShouldSeeSignInLink() {
        String expectedText = "Sign in";
        String actualText = new HomePage().verifySignInText();
        Assert.assertEquals(expectedText, actualText);
    }
}
