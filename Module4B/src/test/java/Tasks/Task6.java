package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {

    /**
     * Navigate to "https://www.saucedemo.com/"
     * Login using username and password.
     * Click on the login button,
     * click on the "add to cart" button of any product (Add only one item)
     * click the cart icon on the top right.
     * Click on checkout.  USE ONLY CSS LOCATION STRATEGY
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input[placeholder$='username'],[name='user-name']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[data-test^=pass]")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input#login-button")).click();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button.btn.btn_primary#add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.cssSelector("a.shopping_cart_link")).click();

        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button#checkout")).click();

        driver.close();
    }
}
