package avic_HW_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.*;

public class aviv_Tests_HW_2 {

    private WebDriver driver;

    @BeforeTest
    public void profileSetup() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
    }


    @BeforeMethod
    public void testSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/");

    }

    @Test(priority = 1)
    public void checkThanMayGoToApplePageFromMainPage() {
        driver.get("https://avic.ua/");
        waitForElementLocateBy(driver, By.xpath("//div[contains(@class, 'open-cat')]//span[@class='sidebar-item']")).click();
        waitForElementLocateBy(driver, By.xpath("//div[(@class='menu-lvl first-level')]//a[contains(@href, 'apple-store')]")).click();
        assertTrue(driver.getCurrentUrl().contains("apple-store"));
    }


    @Test(priority = 2)// страница apple store загружена
    public void checkThanCatalogueOfAppleStoreIsOpened() {
        driver.get("https://avic.ua/apple-store");
        waitForElementLocateBy(driver, By.xpath("//h1[(@class='page-title' and text()='Apple Store')]"));
        assertNotNull(driver.findElement(xpath("//h1[(@class='page-title' and text()='Apple Store')]")));


    }

    @Test(priority = 3)//проверка количества карточек товаров на странице
    public void checkOfCountOfProductsOnThePage() {
        driver.get("https://avic.ua/apple-store");
        waitForElementLocateBy(driver, By.xpath("//div[(@class='brand-box__title')]//a[(@href= 'https://avic.ua/macbook')]")).click();
        List<WebElement> elementsList = driver.findElements(By.xpath("//div[contains(@class,'prod-cart')]//a[(@class= 'prod-cart__buy')]"));
        int actualElementsSize = elementsList.size();
        assertEquals(actualElementsSize, 12);
    }

    @Test(priority = 4)
    public void checkThanYouCanBuyMacbook() {
        driver.get("https://avic.ua/macbook");
        waitForElementLocateBy(driver, By.xpath("//div[contains(@class,'prod-cart')]//a[(@class= 'prod-cart__buy')][1]")).click();
        assertNotNull(driver.findElement(xpath("//div[(@class='ttl' and text()='Корзина')]")));

    }

    @Test(priority = 5)
    public void checkThanTheProductIsInCart(){
        driver.get("https://avic.ua/macbook");
        String CountOfProduct;
        waitForElementLocateBy(driver, By.xpath("//div[contains(@class,'prod-cart')]//a[(@class= 'prod-cart__buy')][1]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js_cart")));
        waitForElementLocateBy(driver, By.xpath("//div[(@class='btns-cart-holder')]//a[text()= ' Продолжить покупки']")).click();
        CountOfProduct = waitForElementLocateBy(driver, By.xpath("//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'js_cart_count')]")).getText();
        assertEquals(CountOfProduct, "1");
    }


    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }

    private static WebElement waitForElementLocateBy(WebDriver driver, By xpath) {
        return new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(xpath));
    }

}
  /*

    //div[contains(@class, 'open-cat')]//span[@class='sidebar-item']  - кнопка каталог товаров
    //div[(@class='menu-lvl first-level')]//a[contains(@href, 'apple-store')] - меню apple store
    https://avic.ua/apple-store - страница Apple Store

    <h1 class="page-title">Apple Store</h1> - заголовок страницы Apple Store


    //div[(@class='brand-box__title')]//a[(@href= 'https://avic.ua/macbook')] - текстовая ссылка на раздел с макбуками
    https://avic.ua/macbook - адрес страницы  с макбуками


    //div[contains(@class,'prod-cart')]//a[(@class= 'prod-cart__buy')][1] - поле "купить" первой из 12 карточек товара
    //div[(@class='btns-cart-holder')]//a[text()= ' Продолжить покупки'] - кнопка продолжить покупки
    //div[(@class='active-cart-item js_cart_count')] - счеткик товаров в корзине


*/
