package com.automation.steps;

import com.automation.pages.ProductPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ProductPageSteps {
    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String product) throws InterruptedException {
        new ProductPage().selectProduct(product);
    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String qty) {
        new ProductPage().selectQuantity(qty);
    }

    @And("^I select size\"([^\"]*)\"$")
    public void iSelectSize(String size) {
        new ProductPage().selectSize(size);
    }
    @And("^I select colour \"([^\"]*)\"$")
    public void iSelectColour(String colour) {
        new ProductPage().selectColour(colour);
    }

    @And("^I click to add cart button$")
    public void iClickToAddCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("^I should see the message \"([^\"]*)\"$")
    public void iShouldSeeTheMessage(String message) {
        String expectedMessage= "";
        String actualMessage =new ProductPage().verifyProductAddedSuccessfullyMessage(message);
        Assert.assertEquals("Product added successfully",expectedMessage,actualMessage);
    }
    @And("^I click on x button and close the popup$")
    public void iClickOnXButtonAndCloseThePopup() {
        new ProductPage().closePopUpMessage();
    }
}
