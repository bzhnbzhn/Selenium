package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import pages.CartPage;
import pages.HomePage;
import pages.ProductDetailPage;
import pages.SearResultPage;


public class BaseTest {

    private WebDriver driver;

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomePage() {
        return new HomePage(getDriver());
    }

    public SearResultPage getSearchResultPage(){
        return new SearResultPage(getDriver());
    }

    public CartPage getCartPage(){
        return new CartPage(getDriver());
    }

    public ProductDetailPage getProductDetailPage(){
        return new ProductDetailPage(getDriver());
    }
}
