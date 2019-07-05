
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchWikiTest {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://www.wikipedia.org/");
        System.out.println("site https://www.wikipedia.org/ opened");

    }
    @Test
    public void inputTest() throws InterruptedException {


        wd.findElement(By.name("search")).sendKeys("QA");
        Thread.sleep(3000);
        wd.findElement(By.cssSelector(".sprite.svg-search-icon")).click();
        Thread.sleep(3000);
    }
    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}




