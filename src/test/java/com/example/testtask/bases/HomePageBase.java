package com.example.testtask.bases;

import com.example.testtask.pages.HomePageHelper;
import com.example.testtask.pages.PickupPageHelper;
import com.example.testtask.pages.UsedPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageBase extends TestBase {

    protected HomePageHelper homePageHelper;
    protected UsedPageHelper usedPageHelper;
   // protected PickupPageHelper pickupPageHelper;

    @BeforeMethod
    public void initTest(){
        homePageHelper = PageFactory.initElements(driver, HomePageHelper.class);
        usedPageHelper = PageFactory.initElements(driver, UsedPageHelper.class);
       // pickupPageHelper = PageFactory.initElements(driver, PickupPageHelper.class);
    }
}
