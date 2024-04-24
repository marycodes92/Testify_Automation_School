import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task7 {

    /*
     * Navigate to https://worldweather.wmo.int/en/home.html.
     * Search for your city in the search field.
     * When the result loads, print the days and weather description
     * for each of the days shown in a readable and understandable manner.
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://worldweather.wmo.int/en/home.html");
        WebElement search = driver.findElement(By.xpath("//input[@id='q_search'or@class='top_searchbox']"));
        search.sendKeys("Lagos, Nigeria");

        driver.findElement(By.cssSelector("input[class=top_searchbox_submit],input[type=submit]")).click();

        try{
            Thread.sleep(5000);
        } catch (InterruptedException error){
            System.out.println(error);
        }

        List<WebElement> daysElement = driver.findElements(By.cssSelector("div.city_fc_date.fs0"));
        List<WebElement> descriptionElements = driver.findElements(By.cssSelector("div.city_fc_desc.fs0"));

        for(int i = 0; i <= daysElement.size(); i++){
            String day = daysElement.get(i).getText();
            String description = descriptionElements.get(i).getText();
            System.out.println(day + ": " + description);
        }
        driver.close();
    }
}
