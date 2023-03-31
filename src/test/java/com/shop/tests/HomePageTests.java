package com.shop.tests;


import com.shop.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    public HomePageTests(WebDriver driver) {

    }

    @Test
    public void openHomePage() {
        System.out.println("Opened home page");
    }

    @Test
    public void cookiesBtn() {
        new HomePage(driver).acceptCookie();
    }
}