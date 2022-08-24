package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    private static final String ADDED_BOOK_NAME_TO_CART = "item-info h1";

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public String getBookName() {
        return driver.findElement(By.className(ADDED_BOOK_NAME_TO_CART)).getText();
    }


}
