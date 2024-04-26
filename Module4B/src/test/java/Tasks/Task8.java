package Tasks;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task8 {
    /**
     * Navigate to https://idorenyinankoh.github.io/loginPage/
     * check if the " create account" button is enabled"
     * fill all the fields
     * check if the "create account"is enabled
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(3000);

        boolean status = driver.findElement(By.id("create")).isEnabled();
        System.out.println("status " + status);
//        Assert.assertFalse("The create button is enabled", status);

        driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Mary");
        driver.findElement(By.id("lastName")).sendKeys("Onuorah");
        driver.findElement(By.id("email")).sendKeys("onuorah@gmail.com");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirmPass")).sendKeys("123456");
        driver.findElement(By.id("xpLevel")).sendKeys("hghdskhahugeb jhgkiaeh");

        Thread.sleep(5000);

        boolean currentStatus = driver.findElement(By.id("create")).isEnabled();
        System.out.println("currentStatus " + currentStatus);
//        Assert.assertTrue( "The create button is disabled", currentStatus);

        driver.quit();
    }
}
