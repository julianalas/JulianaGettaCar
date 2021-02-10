package com.example.testtask.tests;

import com.example.testtask.bases.UsedPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsedPageTest extends UsedPageBase {

    @Test(priority = 1, groups = {"functional"})
    public  void selectBodyTypeTest(){
        usedPageHelper.clickOnButtonBodyType();
        usedPageHelper.clickOnButtonPickup();
        String text = "Used Pickup";
        Assert.assertTrue(usedPageHelper.isTitleUsedPickupContainsText(text));
    }



}
