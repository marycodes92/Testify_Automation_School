package Project;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

/**
 * -Without terminating the current window,
 * launch another window and
 * visit https://blazedemo.com/
 * Select Boston and Rome as departure and arrival destinations.
 * -Click on “Find Flights”
 * Select a flight
 * Copy the flight number and paste into the Zipcode field
 * Fill all other fields with valid inputs
 * Tick the‘RememberMe’checkbox and Purchase flight
 */
public class Project {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

//        Launching the blazedemo app
        driver.get("https://blazedemo.com/");

//        Select the department location
        WebElement departure = driver.findElement(By.cssSelector("select[name=fromPort]"));
        Select select = new Select(departure);
        select.selectByValue("Boston");

//      Select the destination location and searching for flight
        WebElement destination = driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]"));
        Select select1 = new Select(destination);
        select1.selectByIndex(1);

        driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
        Thread.sleep(3000);

//        Select flight
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();

//        Copying the flight number for use in the zipcode fields
        WebElement flight = driver.findElement(By.cssSelector("body:nth-child(2) div.container:nth-child(2) > p:nth-child(3)"));
        String flightNum = flight.getText().substring(15, 20);

//        Filling the flight form
        driver.findElement(By.id("inputName")).sendKeys("Mary Onuorah");
        driver.findElement(By.id("address")).sendKeys("1 Crescent, Lekki-Ajah");
        driver.findElement(By.id("city")).sendKeys("Lekki");
        driver.findElement(By.id("state")).sendKeys("Lagos");
        driver.findElement(By.id("zipCode")).sendKeys(flightNum);

        WebElement cardType = driver.findElement(By.id("cardType"));
        Select select2 = new Select(cardType);
        select2.selectByVisibleText("American Express");

        driver.findElement(By.cssSelector("input[id=creditCardNumber]")).sendKeys("5061041750168625927");
        driver.findElement(By.id("creditCardMonth")).sendKeys("12");
        driver.findElement(By.id("creditCardYear")).sendKeys("2030");
        driver.findElement(By.id("nameOnCard")).sendKeys("Mary Onuorah");

        driver.findElement(By.id("rememberMe")).click();
        driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();

        Thread.sleep(2000);

//        Validating that the payment was completed successfully
        WebElement successMessage = driver.findElement(By.cssSelector("body:nth-child(2) div.container:nth-child(2) div.container.hero-unit > h1:nth-child(1)"));
        String actualMessage = successMessage.getText();
        String expectedMessage = "Thank you for your purchase today!";

        successMessage.isDisplayed();
        Assert.assertEquals(expectedMessage, actualMessage);

        driver.quit();
    }
}
