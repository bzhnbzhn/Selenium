package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsTests extends BaseTest {

    private static final String SEARCH_KEYWORD = "camileo";
    private static final String SEARCH_BOOK = "Don Camillo";

    @Test
    public void findProductByNameAndAddToTheCart() {
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        getSearchResultPage().addBookToCart(SEARCH_BOOK);
        Assert.assertTrue((getCartPage().getBookName()).contains(SEARCH_BOOK),"Book was not added to the cart");
    }

    @Test
    public void findProductByNameAndOpenPDP() {
        getHomePage().searchByKeyWord(SEARCH_KEYWORD);
        getSearchResultPage().openBookPDP(SEARCH_BOOK);
        Assert.assertTrue((getProductDetailPage().getBookName()).contains(SEARCH_BOOK),"Not correct product detail page was open");
    }
}

