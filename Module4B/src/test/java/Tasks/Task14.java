package Tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task14 {
    /**
     * Navigate to https://www.toolsqa.com/
     * close the dialogue box that pops up after a few seconds
     * Click on the tutorial button on the top left corner of the page
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        driver.get("https://www.toolsqa.com/");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='accept-cookie-policy']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
