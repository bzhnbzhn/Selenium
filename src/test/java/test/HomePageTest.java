package test;

import org.junit.jupiter.api.Test;

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
        profileSetUp();
        getHomePage().findElement(SITE_LOGO);
        tearDown();
    }

    @Test
    public void checkThatHomePageContainsSingLink() {
        profileSetUp();
        getHomePage().findElement(SING_LINK);
        tearDown();
    }

    @Test
    public void checkThatHomePageContainsSingIcon() {
        profileSetUp();
        getHomePage().findElement(SING_ICON);
        tearDown();
    }

    @Test
    public void checkThatHomePageContainsNavigationMenu() {
        profileSetUp();
        getHomePage().findElement(NAVIGATION_MENU);
        tearDown();
    }

    @Test
    public void checkThatHomePageContainsBanner() {
        profileSetUp();
        getHomePage().findElement(BANNER);
        tearDown();
    }

    @Test
    public void checkThatHomePageContainsSearchField() {
        profileSetUp();
        getHomePage().findElement(SEARCH_FIELD);
        tearDown();
    }

    @Test
    public void checkThatHomePageContainsSearchButton() {
        profileSetUp();
        getHomePage().findElement(SEARCH_BUTTON);
        tearDown();
    }

}

