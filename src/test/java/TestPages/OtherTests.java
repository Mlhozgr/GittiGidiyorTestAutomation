package TestPages;
import Pages.AddtoBasket;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import Pages.BasePage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.junit.Test;


public class OtherTests extends BaseTest {
    BasePage basePage;
    LoginPage loginPage;
    SearchPage searchPage;
    AddtoBasket addtoBasket;
    public static Logger logger = LogManager.getLogger(OtherTests.class);


    @Test
    public void LoginTest(){
        logger.info("Login testi başladı");
        loginPage = new LoginPage(driver);
        loginPage.check();
        logger.info("Anasayfada olduğumuz kontrol edildi");
        loginPage.hover();
        loginPage.login();
        logger.info("Login başarıyla sonuçlandı");
    }
    @Test
    public void SearchTest(){
        logger.info("Search testi başladı");
        searchPage = new SearchPage(driver);
        searchPage.search();
        logger.info("Bilgisayar kelimesi aratıldı");
        searchPage.nextPage();
        logger.info("İkinci sayfaya geçildi");
    }
    @Test
    public void BasketTest(){
        addtoBasket = new AddtoBasket(driver);
        logger.info("Basket testi başladı");
        addtoBasket.hoverBasket();

        addtoBasket.goBasket();
        logger.info("Sepete içine gidildi");
        addtoBasket.comparePrices();
        logger.info("Fiyat karşılastırılması yapıldı");
        addtoBasket.countProduct();
        logger.info("Ürün sayısı yükseltildi");
        addtoBasket.countDelete();
        logger.info("Sepet ürünleri silindi");

    }


}




