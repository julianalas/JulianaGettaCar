package com.example.testtask.tests;

import com.example.testtask.bases.PickupPageBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PickupPageTest extends PickupPageBase {

    @Test(priority = 1, groups = {"functional"})
    public  void comparePricesTest(){
        //pickupPageHelper.comparePriceOfFirstPickupWithGivenPrice();
        String text = "$35,737";
        Assert.assertTrue(pickupPageHelper.isPriceOfFirstPickupContainsText(text));
    }




}
