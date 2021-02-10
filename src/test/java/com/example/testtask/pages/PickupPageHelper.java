package com.example.testtask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;

public class PickupPageHelper extends PageBase{
    public PickupPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(text(),'$35,737')]")
    WebElement priceOfFirstPickup;

    public boolean isPriceOfFirstPickupContainsText(String text) {
        System.out.println("!!! Text="+text);
        System.out.println("!!! priceOfFirstPickup.getText()="+priceOfFirstPickup.getText());
        return priceOfFirstPickup.getText().contains(text);
    }

//    public Number parse(String source) {
//        String source = priceOfFirstPickup.getText();
//    }
//
//    public void comparePriceOfFirstPickupWithGivenPrice(){
//
//        System.out.println(priceOfFirstPickup.getText());
//
//    }

}
