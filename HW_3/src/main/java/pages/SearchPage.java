package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SearchPage extends BasePage{
    private static final String SEARCH_QUERY = "//div[@class='prod-cart__descr']";
//    private static final String SORTED_BUTTON = "(//div[label='Сортировать']//span[contains(@class, 'select2')])[1]";
    private static final String SORTED_BUTTON ="(//span[contains(@id, 'select2-sort')])[2]";
//    private static final String CHECK_BOX_SMARTPHONES ="//div[@class='filter__items checkbox']/div[2]";
    private static final String CHECK_BOX_SMARTPHONES = "//div/input[@type='checkbox' and @value='725']";
    private static final String CHECK_BOX_AVAILABLE ="//input[@type='checkbox' and @name='available']";
    private static final String SORTED_ASC = "//li[contains(@id, 'priceasc')]";
    private static final String MIN_PRICE ="(//div[@class='prod-cart__prise-new'])[1]";
    private static final String NEXT_PRICE ="(//div[@class='prod-cart__prise-new'])[2]";
    public SearchPage(WebDriver driver) { super(driver); }

    public List<WebElement> getSearchResultList(){
        return driver.findElements(By.xpath(SEARCH_QUERY));
    }

    public int getSearchResultsCount() {
        return getSearchResultList().size();
    }

    public String getMinPriceSamsungPhone() {return driver.findElement(By.xpath(MIN_PRICE)).getText();}

    public String getNextPriceSamsungPhone() {return driver.findElement(By.xpath(NEXT_PRICE)).getText();}


    public void clickCheckBoxSmartphones(){WebElement element = driver.findElement(By.xpath(CHECK_BOX_SMARTPHONES));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

    public void clickCheckBoxAvailable(){WebElement element = driver.findElement(By.xpath(CHECK_BOX_AVAILABLE));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

        public void clickToSortedButton(){WebElement element = driver.findElement(By.xpath(SORTED_BUTTON));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

    public void clickToSortedASC(){WebElement element = driver.findElement(By.xpath(SORTED_ASC));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

}
