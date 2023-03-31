package com.shop.tests;

import com.shop.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchItemTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition() {
        new HomePage(driver).acceptCookie();
    }
    @Test
    public void chooseItemTest() {
        new HomePage(driver).clickOnDepartmentType();
        
    }
}
