package tests;

import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.TodayDealPage;

import java.time.Duration;

public class TodayDealsTest extends BaseTests {

    TodayDealPage todayDealPage;

    @Test
    public void userCanFilterDeals() {
        todayDealPage = new TodayDealPage(driver);

        todayDealPage.setHeadphonesCheckBox();
        todayDealPage.setGroceryCheckBox();
        todayDealPage.setDicount10PercentLink();
    }

    @Test
    public void userCanNavigateToFourthPage() throws InterruptedException {
        todayDealPage = new TodayDealPage(driver);

        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(320));
        todayDealPage.navigateToNextPage();//2
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(320));
        todayDealPage.navigateToNextPage();//3
        //Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(320));
        todayDealPage.navigateToNextPage();//4

        //todayDealPage.navigateToFourthPage();
    }

    @Test
    public void userCanClickItemLink() {

        todayDealPage = new TodayDealPage(driver);
        todayDealPage.clickItemLink();
    }

}
