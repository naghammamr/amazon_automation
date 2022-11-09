package tests;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;

public class CartTest extends BaseTests {

    CartPage cartPage;

    @Test
    public void TestCartItems()
    {
        cartPage = new CartPage(driver);
        String ActualCartTotal = cartPage.cartSubTotalTxt.getText();

        Assert.assertTrue(ActualCartTotal.contains("Subtotal (1 item)"),"Item Wasn't added successfully to the cart");
    }
}
