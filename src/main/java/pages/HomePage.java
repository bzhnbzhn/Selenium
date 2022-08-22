package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage extends BasePage {

    private static final String SEARCH_INPUT = "//input[@type='text']";
    private static final String SEARCH_BUTTON = "//button[@aria-label='Search']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyWord(final String keyword) {
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath(SEARCH_INPUT)).sendKeys(keyword);
        driver.findElement(By.xpath(SEARCH_BUTTON)).click();
    }

    public void findElement(String element) {
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath(element)).isDisplayed();
    }
}
