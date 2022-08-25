package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    private static final String BOOK_NAME = "h1";

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public String getBookName() {
        return driver.findElement(By.tagName(BOOK_NAME)).getText();
    }


}
