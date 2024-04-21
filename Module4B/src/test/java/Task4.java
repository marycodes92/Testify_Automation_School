import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Navigate to http://demo.guru99.com/
 * Click on the security Project menu.
 * Input any text in the email and password field
 */
public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();
        driver.findElement(By.id("dismiss-button")).click();
        driver.findElement(By.xpath("//input[@name='uid'or@text='text']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@name='password'or@type='password']")).sendKeys("password");
    }
}
