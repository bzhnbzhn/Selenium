package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private static final String ADDED_BOOK_NAME_TO_CART = "//div[@class='basket-item']//div[@class='item-info']//h2";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getBookName() {
        return driver.findElement(By.xpath(ADDED_BOOK_NAME_TO_CART)).getText();
    }
}