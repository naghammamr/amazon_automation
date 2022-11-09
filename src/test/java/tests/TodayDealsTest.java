package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.TodayDealPage;

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

        Thread.sleep(3000);
        todayDealPage.navigateToNextPage();//2
        Thread.sleep(3000);
        todayDealPage.navigateToNextPage();//3
        Thread.sleep(3000);
        todayDealPage.navigateToNextPage();//4
    }

    @Test
    public void userCanClickItemLink() {

        todayDealPage = new TodayDealPage(driver);
        todayDealPage.clickItemLink();
    }

}
