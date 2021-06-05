package TestPages;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import Pages.BasePage;
import Pages.LoginPage;
import Pages.SearchPage;
import TestPages.BaseTest;
import org.junit.jupiter.api.Test;
private static Logger logger = LogManager.getLogger(OtherTests.class);



// import main.*;
public class OtherTests extends BaseTest {
    BasePage basePage;
    LoginPage loginPage;
    SearchPage searchPage;


    @Test
    public void LoginTest(){
        loginPage = new LoginPage(driver);
        LoginPage.hover();
        LoginPage.login();
    }
    @Test
    public void SearchTest(){
        searchPage = new SearchPage(driver);
        SearchPage.search();
        SearchPage.nextPage();
    }


}




