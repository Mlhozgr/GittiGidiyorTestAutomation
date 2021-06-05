package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver){
        super(driver);
    }

    public SearchPage search(){
        findElement(By.className("sc-4995aq-0 sc-14oyvky-0 gHqOYK"));
        sendKeys(By.className("sc-4995aq-0 sc-14oyvky-0 gHqOYK"),"bilgisayar");
        return search();
    }
    public SearchPage nextPage(){
        findElement(By.xpath("//a[@href='/arama/?k=bilgisayar&sf=2']")).click();
        //kontrolü nasıl olacak?
        return nextPage();
    }


}
