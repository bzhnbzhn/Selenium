package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;


public class SearResultPage extends BasePage {
    private static final String SEARCH_RESULT_BOOK_NAMES_LIST = "//div[@class='tab search']/div[@class='book-item']";
    private static final String ADD_TO_CART_BUTTON = ".btn btn-sm btn-primary add-to-basket";
    private static final String BOOK_NAME = ".title";

    private WebElement book;

    public SearResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultBooksElements() {
        return driver.findElements(By.xpath(SEARCH_RESULT_BOOK_NAMES_LIST));
    }

    public WebElement findBook(String bookName) {
        List<WebElement> searchBooks = getSearchResultBooksElements()
                .stream()
                .filter(name -> name.getText().contains(bookName))
                .collect(Collectors.toList());
        return searchBooks.get(0);
    }

    public void addBookToCart(String bookName) {
        WebElement book = findBook(bookName);
        // get ADD_TO_CART_BUTTON in current book
        //click ADD_TO_CART_BUTTON
    }

    public void openBookPDP(String bookName) {
        WebElement book = findBook(bookName);
        // get BOOK_NAME in current book
        //click BOOK_NAME
    }
}
