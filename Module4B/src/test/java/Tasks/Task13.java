package Tasks;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    /**
     * Go to https://selenium08.blogspot.com/
     *  search for "Demo dropdown" form the search field.
     *  on the drop down page, select Nigeria from the country
     *  list and select january february and march from the moths
     *  list. (image; https://i.imgur.com/sIgQwwG.png)
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://selenium08.blogspot.com/");
        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        driver.findElement(By.cssSelector("input[name=q]")).sendKeys("Demo dropdown", Keys.ENTER);
        driver.findElement(By.xpath("//a[contains(text(),'Demo Dropdown List')]")).click();

        Thread.sleep(3000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 200)");

        Thread.sleep(2000);
        WebElement countries = driver.findElement(By.cssSelector("select[name=country]"));
        Select selectCountry = new Select(countries);
        selectCountry.selectByValue("NG");

//        Selecting multiple months by calling the select class
        WebElement months = driver.findElement(By.cssSelector("select[name=Month]"));
        Select selectMonth = new Select(months);
        selectMonth.selectByVisibleText("January");

//        Using the action class and holding down the Ctrl Key while selecting all the months
        Actions key = new Actions(driver);
        key.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER);
        selectMonth.selectByVisibleText("February");
        selectMonth.selectByVisibleText("March");

        Thread.sleep(3000);

        driver.quit();
    }
}
