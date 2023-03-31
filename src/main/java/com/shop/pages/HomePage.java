package com.shop.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement cookiesBtn;
    public HomePage acceptCookie() {
        click(cookiesBtn);
        return new HomePage(driver);
    }

    @FindBy(css = ".list-item:nth-child(1) > .list-link > span")
    WebElement departmentItem;

    @FindBy(css = ".pro-active:nth-child(6) > a")
    WebElement subDepartmentItem;

    public HomePage clickOnDepartmentType() {
        click(departmentItem);
        click(subDepartmentItem);
        return new HomePage(driver);
    }
}
