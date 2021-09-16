package SmokeTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class SmokeTest extends BaseTest {

    private String EXPECTED_COUNT_OF_PRODUCT_IN_CART = "1";
    private final String SEARCH_KEYWORD = "epam";
    private final String EXPECTED_SEARCH_QUERY = "epam";
    private static final long WAITING_TIME = 60;
    private static final int EXPECTED_SEARCH_COUNT = 1;
    Integer minPrice, nextPrice;


    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().waitForPageLoadComplete(WAITING_TIME);
        assertTrue(getHomePage().isSearchFieldVisible());
        assertTrue(getHomePage().isSearchButtonVisible());
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getHomePage().waitVisibilityOfElement(WAITING_TIME, getHomePage().getSearchButton());
        getHomePage().clickSearchButton();
        getSearchPage().waitForPageLoadComplete(WAITING_TIME);
        getSearchPage().waitForUrlContains(WAITING_TIME, EXPECTED_SEARCH_QUERY);
        assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_SEARCH_QUERY));
        assertTrue(getSearchPage().getSearchResultsCount() >= EXPECTED_SEARCH_COUNT);
        getSearchPage().waitForPageLoadComplete(WAITING_TIME);
        getSearchPage().clickBuyButton();
        getSearchPage().waitVisibilityOfElement(WAITING_TIME, getSearchPage().getAddToCartPopup());
        assertTrue(getSearchPage().isAddToCartPopupVisible());
        getSearchPage().waitVisibilityOfElement(WAITING_TIME, getSearchPage().getComeBackButton());
        getSearchPage().clickComeBackButton();
        assertEquals(getSearchPage().getTextFromCartsCount(), EXPECTED_COUNT_OF_PRODUCT_IN_CART);


//    @Test
//    public void checkThanTheProductIsInCart(){
//        getHomePage().clickCatalogButton();
//        getHomePage().implicitWait(10);
//        getHomePage().clickAppleStoreButton();
//        getAppleStorePage().clickMacbookTextButton();
//        getMacbookPage().waitForPageLoadComplete(30);
//        getMacbookPage().clickBuyFirstMacbookButton();
//        getMacbookPage().waitVisibilityOfElement(30, getMacbookPage().getAddToCartPopup());
//        getMacbookPage().clickContinueShoppingButton();
//        assertEquals(getHomePage().getTextFromCartsCount(), EXPECTED_COUNT_OF_PRODUCT_IN_CART);
//
//
//    }
    }
}
