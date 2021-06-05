package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver){
        super(driver);
    }

    public SearchPage search(){
        click(By.className("sc-4995aq-0 sc-14oyvky-0 gHqOYK"));
        sendKeys(By.className("sc-4995aq-0 sc-14oyvky-0 gHqOYK"),"bilgisayar");
        click(By.className("qjixn8-0 sc-1bydi5r-0 hKfdXF"));
        return search();
    }
    public SearchPage nextPage(){
        click(By.xpath("//a[@href='/arama/?k=bilgisayar&sf=2']"));
        assertionUrl("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        //kontrolü nasıl olacak?
        return nextPage();
    }


}
