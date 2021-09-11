package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class MacbookPage extends BasePage{

    private static final String CONTINUE_SHOPPING_BUTTON ="//div[(@class='btns-cart-holder')]//a[text()= ' Продолжить покупки']";
    private static final String FIRST_FIELD_BUY_MACBOOK = "//div[contains(@class,'prod-cart')]//a[(@class= 'prod-cart__buy')][1]";
    private static final String ALL_MACBOOK = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'js_cart_count')]";
    private static final String ADD_TO_CART_POPUP = "js_cart";

    public MacbookPage(WebDriver driver) { super(driver);}


    public void clickBuyFirstMacbookButton(){
        driver.findElement(By.xpath(FIRST_FIELD_BUY_MACBOOK)).click();
    }

    public void clickContinueShoppingButton() {driver.findElement(xpath(CONTINUE_SHOPPING_BUTTON)).click();}

    public By getAddToCartPopup() { return id(ADD_TO_CART_POPUP);}


}
