package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTests {

    HomePage homePageObject;

    @Test
    public void userCanSearchForAText() {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/"));
        homePageObject = new HomePage(driver);
        homePageObject.searchForAText("car accessories");
    }

    @Test
    public void userCanClickOnTodayDealsLink() {
        homePageObject = new HomePage(driver);
        homePageObject.clickDontChangeLocationBtn();
        homePageObject.clickTodayDealsLink();
    }
}