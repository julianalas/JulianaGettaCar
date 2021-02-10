package com.example.testtask.bases;

import com.example.testtask.pages.PickupPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class PickupPageBase extends UsedPageBase{

    protected PickupPageHelper pickupPageHelper;

    @BeforeMethod
    public void initTest(){
        super.initTest();
        pickupPageHelper = PageFactory.initElements(driver, PickupPageHelper.class);
        usedPageHelper.clickOnButtonBodyType();
        usedPageHelper.clickOnButtonPickup();
    }
}
