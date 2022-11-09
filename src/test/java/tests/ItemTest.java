package tests;

import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.CartAddedItemPage;
import pages.ItemPage;

import java.time.Duration;

public class ItemTest extends BaseTests {

    ItemPage itemPage;
    CartAddedItemPage addedItemPage;

    @Test
    public void userCanAddItemToCart() {
        itemPage = new ItemPage(driver);
        itemPage.addItemToCart();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
    }

    @Test
    public void userCanGoToCart()
    {
        addedItemPage = new CartAddedItemPage(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
        addedItemPage.GoToCart();
    }
}
