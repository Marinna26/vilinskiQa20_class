import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TrelloLoginTest extends TestBase{
    @Test
    public void loginTest() throws InterruptedException {
        //click login button
        wd.findElement(By.cssSelector("[href='/login']")).click();
        //type email
        wd.findElement(By.id("user")).sendKeys("marinna2011@ukr.net");
        //type password
        wd.findElement(By.name("password")).sendKeys("");
        Thread.sleep(3000);
        //confirmLogin
        wd.findElement(By.id("login")).click();
        Thread.sleep(3000);
    }
}
