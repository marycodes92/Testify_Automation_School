package Tasks.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ElementsPage {

    WebDriver driver = null;
    @BeforeMethod
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void elementsPage(){
        driver.get("https://demoqa.com");

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(1, 500)");

        driver.findElement(By.xpath("//h5[contains(text(),'Elements')]")).click();

        WebElement elementList = driver.findElement(By.cssSelector(".collapse.element-list.show"));
        String element = driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-3:nth-child(1) div.left-pannel div.accordion div.element-group:nth-child(1) span.group-header div.header-wrapper > div.header-text")).getText();

        elementList.isDisplayed();
        Assert.assertEquals(element, "Elements");

        driver.quit();
    }
}
