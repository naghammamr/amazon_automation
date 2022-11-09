package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageBase.PageBase;

public class HomePage extends PageBase {

    // constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchField;

    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    @FindBy(xpath = "//a[@class='nav-a  '][contains(.,'Deals')]")
    WebElement TodayDealsLink;

    @FindBy(xpath = "//span[contains(.,\"Don't Change\")]//input[@class='a-button-input']")
    WebElement dontChangeLocationBtn;

    public void searchForAText(String searchTxt)
    {
        searchField.sendKeys(searchTxt);
        searchButton.click();
    }

    public void clickTodayDealsLink() {
        TodayDealsLink.click();
    }

    public void clickDontChangeLocationBtn(){
        dontChangeLocationBtn.click();
    }

}
