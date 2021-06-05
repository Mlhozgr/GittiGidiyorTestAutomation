package TestPages;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
@BeforeAll
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Users/Monster/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("www.gittigidiyor.com");
        driver.manage().window().maximize();

    }

@AfterAll
public void tearDown(){
    driver.quit();
}
}