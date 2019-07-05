import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
    @BeforeMethod
    public void login() throws InterruptedException {
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
    @Test
    public void testBoardCreationFromHeader() throws InterruptedException {
        //clickOnPlusButtonOnHeader
        wd.findElement(By.xpath("//span[@name='add']")).click();
        //selectCreateBoardFromDropDown
        wd.findElement(By.cssSelector("[data-test-id=header-create-team-button]")).click();
        Thread.sleep(10000);
        //TypeBoardName
        wd.findElement(By.xpath("//input[@class='_1Am_PrV0YBkAmt']")).click();
        wd.findElement(By.xpath("//input[@class='_1Am_PrV0YBkAmt']")).clear();
        wd.findElement(By.xpath("//input[@class='_1Am_PrV0YBkAmt']")).sendKeys("qa20");
    }
}
