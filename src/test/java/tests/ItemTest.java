package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.CartAddedItemPage;
import pages.ItemPage;

public class ItemTest extends BaseTests {

    ItemPage itemPage;
    CartAddedItemPage addedItemPage;

    @Test
    public void userCanAddItemToCart() {
        itemPage = new ItemPage(driver);
        itemPage.addItemToCart();
    }

    @Test
    public void userCanGoToCart() {
        addedItemPage = new CartAddedItemPage(driver);
        addedItemPage.GoToCart();
    }
}
