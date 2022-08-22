package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;



public class SearResultPage extends BasePage {
    private static final String SEARCH_RESULT_BOOK_NAMES_LIST = "//div[@class='tab search']/div[@class='book-item']";

    public SearResultPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getSearchResultBooksElements() {
        return driver.findElements(By.xpath(SEARCH_RESULT_BOOK_NAMES_LIST));
    }

    public WebElement addBookToCartByName(String bookName){
        return getSearchResultBooksElements()
                .stream()
                .map(WebElement::getText)
                .filter(name -> name.contains(bookName))
                .findFirst();
        // get needed Element
        // find [btn btn-sm btn-primary add-to-basket]
        //click
    }

    public void openBookPDP(String bookName){

    }
}
