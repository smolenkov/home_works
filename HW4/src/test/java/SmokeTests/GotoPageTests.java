package SmokeTests;
//
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertNotNull;

public class GotoPageTests extends BaseTest{
    private static final String SEARCH_TEXT ="//h1[(@class='page-title' and text()='Apple Store')]";

    @Test
    void checkThanCatalogueOfAppleStoreIsOpened() {
        getHomePage().clickCatalogButton();
        getHomePage().implicitWait(10);
        getHomePage().clickAppleStoreButton();
        assertNotNull(driver.findElement(xpath(SEARCH_TEXT)));
    }
}
