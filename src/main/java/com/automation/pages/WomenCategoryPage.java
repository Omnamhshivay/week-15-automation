package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());
    public WomenCategoryPage(){
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement womenCategoryTab;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/span[1]")
    WebElement womenText;


    public void clickOnWomenTab(){
        log.info("Click on women tab "+ womenCategoryTab.getText());
        clickOnElement(womenCategoryTab);
    }
    public String verifyWomenText(){
        log.info("Get women "+ womenText.getText());
        return getTextFromElement(womenText);
    }



}
