package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageBase.PageBase;

public class TodayDealPage extends PageBase {

    public TodayDealPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//label[contains(.,'Headphones')]//input")
    WebElement headphonesCheckBox;

    @FindBy(xpath = "//label[contains(.,'Grocery')]//input")
    WebElement groceryCheckBox;

    @FindBy(xpath = "//div[@class='a-row']//a[contains(.,'10%')]")
    WebElement dicount10PercentLink;

    @FindBy(xpath = "//li//a[contains(.,'Next')]")
    WebElement nextBtn;

    //  @FindBy(xpath = "//div[@data-deal-id='baacfb90']//a")
    @FindBy(xpath = "//div[@class='DealContent-module__truncate_sWbxETx42ZPStTc9jwySW']")
    WebElement itemLink;

    //////////////////////////
    public void setHeadphonesCheckBox() {
        headphonesCheckBox.click();
    }

    public void setGroceryCheckBox() {
        groceryCheckBox.click();
    }

    public void setDicount10PercentLink() {
        dicount10PercentLink.click();
    }

    public void navigateToNextPage() {
        nextBtn.click();
    }

    public void clickItemLink() {
        itemLink.click();
    }

}
