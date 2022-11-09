package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageBase.PageBase;

public class SearchResultsPage extends PageBase {

    public SearchResultsPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-index=2]//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
    WebElement itemLink;

    public void clickItemLink() {
        itemLink.click();
    }

}
