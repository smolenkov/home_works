package SmokeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.AppleStorePage;
import pages.HomePage;
import pages.MacbookPage;
import pages.SearchPage;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {
    WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetup() {
        chromedriver().setup();
    }

    @BeforeMethod
    public void testSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }

    @AfterMethod
    public void tearDown() { driver.close();}

    public WebDriver getDriver() {return driver;}

    public HomePage getHomePage() {return new HomePage(getDriver());}

    public AppleStorePage getAppleStorePage() {return new AppleStorePage(getDriver());}

    public MacbookPage getMacbookPage() {return new MacbookPage(getDriver());}

    public SearchPage getSearchPage() {return new SearchPage(getDriver());}





}
