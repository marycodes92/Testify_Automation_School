package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task15 {
    /**
     * Structure your TestNG file to run Naviagte to google and search for testify.
     * close the browser
     * Navigate to https://www.mcdonalds.com/us/en-us.html .
     * print out the colour - code of the order now button.
     * All test should be done in one class and utilize your knowldge of tesNG annotation)
     */
    WebDriver driver = null;
    @BeforeTest
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void navigateToGoogle(){
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify", Keys.ENTER);
    }

    @Test
    public void navigateToMcDonalds(){
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        WebElement button = driver.findElement(By.xpath("//a[@id='button-ordernow']"));
        String color = button.getCssValue("background-color");
        System.out.println(color);
    }

    @AfterTest
    public void closeBrowser(){
        driver.close();
    }
}
