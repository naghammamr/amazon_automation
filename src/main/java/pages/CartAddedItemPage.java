package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartAddedItemPage extends PageBase {

    public CartAddedItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@id='sw-gtc']//a")
    WebElement goToCartBtn;

    public void GoToCart()
    {
        goToCartBtn.click();
    }
}
