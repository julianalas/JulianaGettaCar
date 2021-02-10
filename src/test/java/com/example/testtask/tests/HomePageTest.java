package com.example.testtask.tests;

import com.example.testtask.bases.HomePageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends HomePageBase {

    @Test(priority = 2, groups = {"UI"})
    public void sloganValidationTest() {
        String text = "Super EASY";
        Assert.assertTrue(homePageHelper.isSloganContainsText(text));
    }

    @Test(priority = 1, groups = {"functional"})
    public void startChooseYourCarTest(){
        homePageHelper.clickOnButtonChooseYourCar();
        String text = "Filter";
        Assert.assertTrue(usedPageHelper.isTitleFilterContainsText(text));
    }





}
