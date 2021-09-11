package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class HomePage extends BasePage{


    @FindBy(xpath = "//div[contains(@class, 'open-cat')]//span[@class='sidebar-item']")
    private WebElement catalogButton;
    private static final String APPLE_STORE_BUTTON ="//div[(@class='menu-lvl first-level')]//a[contains(@href, 'apple-store')]";
    private static final String COUNT_OF_PRODUCT_IN_CART = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'js_cart_count')]";
    private static final String SEARCH_INPUT = "//input[@id='input_search']";
    private static final String SEARCH_BUTTON = "//button[@class='button-reset search-btn']";


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickAppleStoreButton(){
        driver.findElement(By.xpath(APPLE_STORE_BUTTON)).click();
    }

    public void clickCatalogButton(){ catalogButton.click(); }

    public String getTextFromCartsCount(){return driver.findElement(By.xpath(COUNT_OF_PRODUCT_IN_CART)).getText();}


    public void searchByKeyword(final String keyword) {
        driver.findElement(xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(xpath(SEARCH_BUTTON)).click();
    }

}
