package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.http.util.Asserts;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ProductPage extends Utility {
    private static final Logger logs = LogManager.getLogger(ProductPage.class.getName());

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='product-name']")
    List<WebElement> productLists;
    @CacheLookup
    @FindBy(id = "quantity_wanted")
    WebElement quantitySelect;
    @CacheLookup
    @FindBy(id = "group_1")
    WebElement sizeSelect;
    @CacheLookup
    @FindBy(id = "color_8")
    WebElement colourWhite;
    @CacheLookup
    @FindBy(id = "color_13")
    WebElement colourOrange;
    @CacheLookup
    @FindBy(id = "color_14")
    WebElement colourBlue;
    @CacheLookup
    @FindBy(id = "color_15")
    WebElement colourGreen;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addToCartLink;
    @FindBy(xpath = "//div[@class='clearfix']/div[1]/h2")
    WebElement popUpMessageText;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement popUpCloseButtonLink;


    public void selectProduct(String product) throws InterruptedException {
        List<WebElement> names = productLists;
        for (WebElement name : names) {
            if (name.getText().equalsIgnoreCase(product)) {
                Thread.sleep(2000);
                name.click();
                logs.info("selecting product : " + product);
                break;
            }
        }
    }

    public void selectQuantity(String qty) {
        logs.info("Select quantity " + quantitySelect.getText());
        clearTextFromField(By.id("quantity_wanted"));
        sendTextToElement(quantitySelect, "2");
    }

    public void selectSize(String size) {
        logs.info("Select size " + sizeSelect.getText());
        selectByValueFromDropDown(sizeSelect, "2");
    }

    public void selectColour(String colour) {
        if (colour == "White") {
            driver.findElement(By.id("color_8")).click();
            logs.info("Select colour : " + colour);
        } else if (colour == "Orange") {
            driver.findElement(By.id("color_13")).click();
            logs.info("Select colour : " + colour);
        } else if (colour == "Green") {
            driver.findElement(By.id("color_15")).click();
            logs.info("Select colour : " + colour);
        } else if (colour == "Blue") {
            driver.findElement(By.id("color_14")).click();
            logs.info("Select colour : " + colour);
        } else {
            System.out.println("Please select a colour");
        }
    }

    public void clickOnAddToCartButton() {
        logs.info("Click on add to cart " + addToCartLink.getText());
        clickOnElement(addToCartLink);
    }

    public String verifyProductAddedSuccessfullyMessage(String message) {
        logs.info("product added successfully message : " + popUpMessageText.toString());
        return getTextFromElement(popUpMessageText);
    }

    public void closePopUpMessage() {
        clickOnElement(popUpCloseButtonLink);
        logs.info("Closing the popup message : " + popUpMessageText.toString());
    }
}

