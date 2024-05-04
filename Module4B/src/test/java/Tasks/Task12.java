package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    /**
     * Navigate to https://jqueryui.com/
     * .click on the "resize" menu from the left pane
     * Drag the box to be bigger.(Resixe the box to be bigger)
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Resizable')]")).click();

        WebElement iframe = driver.findElement(By.cssSelector("iframe.demo-frame"));
        driver.switchTo().frame(iframe);

        WebElement resizeShape = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));

        Actions resize = new Actions(driver);
        Thread.sleep(1000);
        resize.dragAndDropBy(resizeShape, 280, 200).build().perform();
    }
}
