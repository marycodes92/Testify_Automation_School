package Tasks.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class FormsPage {

    WebDriver driver = null;
    @BeforeMethod
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void formsPage(){
        driver.get("https://demoqa.com");

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(1, 500)");

        driver.findElement(By.xpath("//h5[contains(text(),'Forms')]")).click();

        String element = driver.findElement(By.cssSelector("//span[contains(text(),'Practice Form')]")).getText();

        SoftAssert validate = new SoftAssert();
        validate.assertEquals(element, "Practice Form");

        driver.quit();
    }
}
