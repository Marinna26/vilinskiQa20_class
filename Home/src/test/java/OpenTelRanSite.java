import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenTelRanSite {
    WebDriver wd;
    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
    @Test
    public void testOpeningTelRanSite(){
        wd.get("https://www.tel-ran.com/");
        System.out.println("site https://www.tel-ran.com/ opened");

        //wd.getCurrentUrl();
        String url = wd.getCurrentUrl();
        Assert.assertEquals(url,"https://www.tel-ran.com/");
    }
    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
