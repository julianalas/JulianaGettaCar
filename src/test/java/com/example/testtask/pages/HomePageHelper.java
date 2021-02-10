package com.example.testtask.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageHelper extends PageBase{

    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@id='root']/div[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
    WebElement slogan;

    @FindBy(xpath = "//a[contains(text(),'Choose your car')]")
    WebElement buttonChoose;

    public boolean isSloganContainsText(String text) {
        return slogan.getText().contains(text);
    }

    public void clickOnButtonChooseYourCar(){
        waitUntilElementInVisible(buttonChoose, 10);
        buttonChoose.click();
    }

}
