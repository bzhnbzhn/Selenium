package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearResultPage extends BasePage {
    private static final String SEARCH_RESULT_BOOK_NAMES_LIST = "//div[@class='tab search']/div[@class='book-item']";
    private static final String OPEN_CART_PAGE_BUTTON = "continue-to-basket";

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public SearResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultBooksElements() {
        return driver.findElements(By.xpath(SEARCH_RESULT_BOOK_NAMES_LIST));
    }

    public WebElement findBook(String bookName) {
        return getSearchResultBooksElements()
                .stream()
                .filter(name -> name.getText().contains(bookName))
                .findFirst()
                .get();
    }

    public void addBookToCart(String bookName) {
        WebElement book = findBook(bookName);
        book.findElement(By.className("item-actions")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.className(OPEN_CART_PAGE_BUTTON)));
        driver.findElement(By.className(OPEN_CART_PAGE_BUTTON)).click();
    }

    public void openBookPDP(String bookName) {
        WebElement book = findBook(bookName);
        book.click();
    }
}