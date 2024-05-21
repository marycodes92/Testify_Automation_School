package Tasks.Task18.Test;

import Tasks.Task18.SauceDemoPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceDemoLoginTest {
    WebDriver driver = null;
    LoginPage login;

    @BeforeTest
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://saucedemo.com/");
        login = new LoginPage(driver);
    }

    @Test
    public void loginTest(){
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLoginBtn().click();

        driver.quit();
    }
}
