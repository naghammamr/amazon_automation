package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchResultsTest extends BaseTests {

    SearchResultsPage searchResultsPage;

    @Test
    public void userCanClickOnItem() throws InterruptedException
    {
        searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.clickItemLink();
    }
}
