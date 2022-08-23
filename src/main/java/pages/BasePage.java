package pages;

import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BasePage {
    static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
}
