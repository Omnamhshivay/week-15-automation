package com.automation.steps;

import com.automation.pages.WomenCategoryPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenSteps {
    @When("^I click on women category tab$")
    public void iClickOnWomenCategoryTab() {
        new WomenCategoryPage().clickOnWomenTab();
    }

    @Then("^I should see women text$")
    public void iShouldSeeWomenText() {
        String expectedText = "Women";
        String actualText = new WomenCategoryPage().verifyWomenText();
        Assert.assertEquals(expectedText, actualText);
    }
}
