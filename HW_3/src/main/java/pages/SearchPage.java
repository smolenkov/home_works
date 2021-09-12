package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.By.xpath;

public class SearchPage extends BasePage{

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List <WebElement> searchQuery;

    @FindBy(xpath = "(//span[contains(@id, 'select2-sort')])[2]")
    private WebElement sortedButton;

    @FindBy(xpath ="//li[contains(@id , 'select2-sort') and contains(@id , 'priceasc')]")
    private WebElement sortedASC;
//   //ul[@class='select2-results__options']/li[2]
//   //li[contains(@id , 'select2-sort') and contains(@id , 'priceasc')]
    @FindBy(xpath = "ul[@class='select2-results__options']/li[2]")
    private List <WebElement> sortedASCList;

    @FindBy(xpath = "//div/input[@type='checkbox' and @value='725']")
    private WebElement checkBoxSmartphone;

    @FindBy(xpath = "//input[@type='checkbox' and @name='available']")
    private WebElement checkBoxAvailable;


    @FindBy(xpath = "(//div[@class='prod-cart__prise-new'])[1]")
    private WebElement minPrice;

    @FindBy(xpath = "(//div[@class='prod-cart__prise-new'])[2]")
    private WebElement nextPrice;

    public SearchPage(WebDriver driver) { super(driver); }

    public List<WebElement> getSearchResultList(){ return searchQuery;}

    public int getSearchResultsCount() {
        return getSearchResultList().size();
    }

    public String getMinPriceSamsungPhone() {return minPrice.getText();}

    public String getNextPriceSamsungPhone() {return nextPrice.getText();}


    public void clickCheckBoxSmartphones(){WebElement element = checkBoxSmartphone;
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

    public void clickCheckBoxAvailable(){WebElement element = checkBoxAvailable;
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

//        public void clickToSortedButton(){WebElement element = sortedButton;
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

//            public void clickToSortedASC(){WebElement element = sortedASC;
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

//    public void clickToSortedASC (){
//        WebElement element = sortedASC;
//        (new WebDriverWait(driver, 10)).until(ExpectedConditions
//                .visibilityOfElementLocated(By.xpath("WebElement element = sortedASC;")));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}

    public void clickToSortedASC(){ sortedASC.click(); }

    public void clickToSortedButton () throws InterruptedException {
        int i=sortedASCList.size();
        while (i != 0)
        {sortedButton.click();
        i=sortedASCList.size(); }
        Thread.sleep(500);
        sortedButton.click();

    }

//        {WebElement element = sortedButton;
//            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);}}



}
