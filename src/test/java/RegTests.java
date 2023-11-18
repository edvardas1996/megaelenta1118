import org.example.Helper;
import org.example.Models.Registration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegTests {
    public static WebDriver driver;

    @Test
    public void regPositiveTest(){
        Registration ad = new Registration("Edvarsadasd1","gengura@live.com","Moremore123","Moremore123");
        ad.fillReg();
        Assert.assertEquals("","");
    }

    @Test
    public void regPositiveTest2(){
        Registration ad = new Registration("Edvarsadasd12","gengudwra@live.com","Moremore123","Moremore123");
        ad.fillReg();
        Assert.assertEquals("","");
    }


    @BeforeClass
    public void beforeClass(){
        Helper.driverInit();
        driver = Helper.driver;
        acceptCookies();
    }

    public void acceptCookies(){
        driver.get("https://elenta.lt");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]")).click();
    }

    @AfterClass
    public void afterClass(){
        //  driver.quit();
    }
}
