package Tasks.Task2;

//Create three different classes and launch any three websites of your choice from each of them

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSauceDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver(); //laucnhes the browser

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com"); //navigate to the url
        driver.close();
    }
}
