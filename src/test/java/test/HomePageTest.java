package test;


import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    private static final String SITE_LOGO = "//img[@alt='Bookdepository.com']";
    private static final String SING_LINK = "//a[@href='/account/login/to/account']";
    private static final String SING_ICON = "icon-user";
    private static final String NAVIGATION_MENU = "secondary-header";
    private static final String BANNER = "//img[@alt='Image of Best Books of 2022 so far']";
    private static final String SEARCH_BUTTON = "//input[@type='text']";
    private static final String SEARCH_FIELD = "//button[@aria-label='Search']";


    @Test
    public void checkThatHomePageContainsLogo() {
        getHomePage().findElementByXpath(SITE_LOGO);
    }

    @Test
    public void checkThatHomePageContainsSingLink() {
        getHomePage().findElementByXpath(SING_LINK);
    }

    @Test
    public void checkThatHomePageContainsSingIcon() {
        getHomePage().findElementByClassName(SING_ICON);
    }

    @Test
    public void checkThatHomePageContainsNavigationMenu() {
        getHomePage().findElementByClassName(NAVIGATION_MENU);
    }

    @Test
    public void checkThatHomePageContainsBanner() {
        getHomePage().findElementByXpath(BANNER);
    }

    @Test
    public void checkThatHomePageContainsSearchField() {
        getHomePage().findElementByXpath(SEARCH_FIELD);
    }

    @Test
    public void checkThatHomePageContainsSearchButton() {
        getHomePage().findElementByXpath(SEARCH_BUTTON);
    }
}