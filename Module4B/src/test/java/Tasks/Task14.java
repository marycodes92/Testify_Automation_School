package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Task14 {
    /**
     * Navigate to https://www.toolsqa.com/
     * close the dialogue box that pops up after a few seconds
     * Click on the tutorial button on the top left corner of the page
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.toolsqa.com/");

        driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("element")));

        driver.quit();
    }
}
