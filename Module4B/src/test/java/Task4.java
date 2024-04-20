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
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("username");
        driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("password");
    }
}
