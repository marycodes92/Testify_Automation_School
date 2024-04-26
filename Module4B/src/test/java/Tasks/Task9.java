package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task9 {
    /**
     * Navigate to saucedemo.com
     * Login with username and password
     * navigate back to login screen from the homepage
     * print out the Login button attribut "VALUE" to verify that you are back on the login screen
     * navigate forward to the homepage, print out a name of a product to verify that you are back on the homepage
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input[placeholder$='username'],[name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[data-test^=pass]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input#login-button")).click();
        Thread.sleep(5000);

        driver.navigate().back();

        Thread.sleep(3000);
        String attributeValue = driver.findElement(By.cssSelector("input#login-button")).getAttribute("name");
        System.out.println(attributeValue);

        Thread.sleep(3000);
        driver.navigate().forward();
        String product = driver.findElement(By.id("item_4_title_link")).getText();
        System.out.println(product);

        driver.quit();
    }
}
