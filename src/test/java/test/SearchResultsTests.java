package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchResultsTests extends BaseTest {

    private static final String SEARCH_KEYWORD = "camileo";
    private static final String EXPECTED_QUERY = "searchTerm=CAMILEO";
    private static final String SEARCH_BOOK = "Don Camillo";

    @Test
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(EXPECTED_QUERY));
    }

    @Test
    public void findProductByNameAndAddToTheCart() {
        profileSetUp();
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        getSearchResultPage().addBookToCart(SEARCH_BOOK);
        tearDown();
    }

    @Test
    public void findProductByNameAndOpenPDP() {
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        getSearchResultPage().openBookPDP(SEARCH_BOOK);
    }
}

