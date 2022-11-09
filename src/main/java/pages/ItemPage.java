package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends PageBase {

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-cart-button")
    WebElement addToCartBtn;

    public void addItemToCart() {
        addToCartBtn.click();
    }
}
