package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTests {

    HomePage homePageObject;

    @Test
    public void userCanSearchForAText() throws InterruptedException {
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/"));
        homePageObject = new HomePage(driver);
        homePageObject.searchForAText("car accessories");
        Thread.sleep(1000);
    }

    @Test
    public void userCanClickOnTodayDealsLink() throws InterruptedException {
        homePageObject = new HomePage(driver);
        //Thread.sleep(1000);
        homePageObject.clickDontChangeLocationBtn();
        homePageObject.clickTodayDealsLink();
    }
}