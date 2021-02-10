package com.example.testtask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsedPageHelper extends PageBase{

    public UsedPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".catalog_title__2lnfW")
    WebElement titleFilter;

    @FindBy(xpath = "//h5[contains(text(),'Body type')]")
    WebElement buttonBodyType;

    @FindBy(xpath = "//a[contains(text(),'Pickup')]")
    WebElement buttonPickup;

    @FindBy(xpath = "//h1[contains(text(),'Used Pickup')]")
    WebElement titleUsedPickup;

    public boolean isTitleFilterContainsText(String text) {
//        System.out.println("!!! Text="+text);
//        System.out.println("!!! titleFilter.getText()="+titleFilter.getText());
        return titleFilter.getText().contains(text);
    }

    public void clickOnButtonBodyType(){
        waitUntilElementInVisible(buttonBodyType, 10);
        buttonBodyType.click();
    }

    public void clickOnButtonPickup(){
        waitUntilElementInVisible(buttonPickup, 10);
        buttonPickup.click();
    }

    public boolean isTitleUsedPickupContainsText(String text) {
        return titleUsedPickup.getText().contains(text);
    }





}
