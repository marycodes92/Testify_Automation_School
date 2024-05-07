package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Task16 {
    /**
     * Navigate to https://testifyltd.com/ .
     * Assert that the Our contact column at the footer of the
     * homepage has the following correct details, EMAIL: info@testifyltd.co.uk
     * LOCATION: Nigeria
     * PHONE: (+234)904-882-0971
     */

    WebDriver driver = null;
    @BeforeMethod
    public void navigate() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://testifyltd.com/");

        Thread.sleep(2000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 2000)");

        Thread.sleep(2000);
    }

    @Test
    public void verifyEmail(){
        String email = driver.findElement(By.xpath("//a[@id='']")).getText();
        Assert.assertEquals(email, "info@testifyltd.co.uk");
    }

    @Test
    public void verifyLocation(){
        String location = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]/strong[1]")).getText();
        SoftAssert verify = new SoftAssert();
        verify.assertEquals(location, "Nigeria");
        verify.assertAll();
    }

    @Test
    public void verifyPhoneNumber(){
        String phoneNumber = driver.findElement(By.xpath("//a[@id='']")).getText();
        Assert.assertEquals(phoneNumber, "(+234)904-882-0971");
    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
