package com.example.testtask.bases;

import com.example.testtask.bases.HomePageBase;
import org.testng.annotations.BeforeMethod;

public class UsedPageBase extends HomePageBase {

    @BeforeMethod
    public void initTest(){
        super.initTest();
        homePageHelper.clickOnButtonChooseYourCar();
    }
}
