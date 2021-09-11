package SmokeTests;

import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;
import static org.testng.Assert.assertNotNull;

public class GotoPageTests extends BaseTest{

    @Test
    void checkThanCatalogueOfAppleStoreIsOpened() {
        getHomePage().clickCatalogButton();
        getHomePage().implicitWait(10);
        getHomePage().clickAppleStoreButton();
        assertNotNull(driver.findElement(xpath("//h1[(@class='page-title' and text()='Apple Store')]")));
    }
}
