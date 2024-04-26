package Tasks;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task11 {
    /**
     * Go to google.
     * search for "testify ltd"
     * Click on the search that result with www.testifyltd.com
     * sroll down the testify website and click on the linkedIn icon.
     * Get the description text on the userpage.(image; https://i.imgur.com/PmrWDXa.png )
     */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com/");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("textarea[name=q]")).sendKeys("testify ltd", Keys.ENTER);
        Thread.sleep(5000);

//        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div[1]/div/div/span/a/h3")).click();
        Thread.sleep(3000);

        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 1000)");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/div[1]/div[1]/a[4]/span[1]")).click();

        Thread.sleep(3000);
        String text = driver.findElement(By.cssSelector("p[class=org-top-card-summary__tagline]")).getText();
        System.out.println(text);

        driver.quit();
    }
}
