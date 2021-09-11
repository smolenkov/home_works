package SmokeTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class AddToCartTest extends BaseTest{
    private String EXPECTED_COUNT_OF_PRODUCT_IN_CART ="1";

    @Test void checkThanTheProductIsInCart(){
        getHomePage().clickCatalogButton();
        getHomePage().implicitWait(10);
        getHomePage().clickAppleStoreButton();
        getAppleStorePage().clickMacbookTextButton();
        getMacbookPage().waitForPageLoadComplete(30);
        getMacbookPage().clickBuyFirstMacbookButton();
        getMacbookPage().waitVisibilityOfElement(30, getMacbookPage().getAddToCartPopup());
        getMacbookPage().clickContinueShoppingButton();
        assertEquals(getHomePage().getTextFromCartsCount(), EXPECTED_COUNT_OF_PRODUCT_IN_CART);


    }
}
