package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task10 {
    /**
     * Navigate to https://jqueryui.com/
     * click on the dialog menu from the left pane
     * click on the close icon to close the dialogue box in the middle
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://jqueryui.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
        Thread.sleep(3000);

        WebElement iframe = driver.findElement(By.cssSelector("iframe[class=demo-frame]"));
        driver.switchTo().frame(iframe);

        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/button[1]/span[1]")).click();

        driver.quit();
    }
}
