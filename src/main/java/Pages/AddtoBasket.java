package Pages;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddtoBasket  extends BasePage{
    public AddtoBasket(WebDriver driver){
        super(driver);
    }

    public AddtoBasket hoverBasket(){
        hoverElement(By.className("img-cont  "));
        click(By.id("690424111"));
        return hoverBasket();

    }
    public AddtoBasket goBasket(){
        hoverElement(By.className("header-cart-container robot-header-cart-container hidden"));
        click(By.className("gg-ui-btn-default padding-none"));
        return goBasket();
    }
    public AddtoBasket comparePrices(){
        Assert.assertEquals(findElement(By.className("new-price")).getText(), findElement(By.className("fiyat robotobold price-txt")).getText());
        return comparePrices();
    }
    public AddtoBasket countProduct(){
        click(By.className("amount"));
        click(By.xpath("//option[@value='2']"));
        return countProduct();
    }
    public AddtoBasket countDelete(){
        click(By.className("gg-icon gg-icon-bin-medium"));
        return countDelete();
    }
}
