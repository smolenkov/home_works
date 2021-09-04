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
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class aviv_Tests_HW_2 {

    private WebDriver driver;

    @BeforeTest
    public void profileSetup(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe" );
    }


    @BeforeMethod
    public void testSetup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://avic.ua/");
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

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @AfterTest
    public void quit(){
        driver.quit();
    }

}
