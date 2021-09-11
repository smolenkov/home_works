package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    private static final String SEARCH_INPUT = "";
    private static final String SEARCH_BUTTON = "";
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void searchByKeywords(final String keyword){
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }
}
