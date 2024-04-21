import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

    /**
     * Navigate to https://www.saucedemo.com/
     * Login using username and password.
     * Click on the login button,
     * click on the "add to cart" button of any product (Add only one item)
     * click the cart icon on the top right.
     * Click on checkout.  USE ONLY XPATH LOCATION STRATEGY
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
// Navigate to saucedemo and login
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//form/descendant::input[3]")).click();
        Thread.sleep(5000);

// Add an element to cart and checkout
        driver.findElement(By.xpath("//div[@class='inventory_list']/descendant::button[1]")).click();
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }
}
