package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="sc-subtotal-label-activecart")
    public WebElement cartSubTotalTxt;

}
