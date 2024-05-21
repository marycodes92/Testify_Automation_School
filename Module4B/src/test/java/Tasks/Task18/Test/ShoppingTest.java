package Tasks.Task18.Test;

import Tasks.Task18.SauceDemoPage.CartPage;
import Tasks.Task18.SauceDemoPage.CheckoutPage;
import Tasks.Task18.SauceDemoPage.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ShoppingTest {
    WebDriver driver = null;
    LoginPage login;
    CartPage add;
    CheckoutPage checkout;
    @BeforeTest
    public void setDriver(){
        System.setProperty("webdriver.chrome.driver", "/Users/maryonuorah/Desktop/Testify Academy/Tasks/Testify_Automation_School/Module4B/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://saucedemo.com/");
        login = new LoginPage(driver);

        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLoginBtn().click();
    }

    @Test
    public void addToCart() throws InterruptedException {
//        Created an object of the CartPage class and collected the names of products to add to cart
        add = new CartPage(driver);
        String productOne = add.getProduct1().getText();
        String productTwo = add.getProduct2().getText();

//        Added items to cart
        add.addItemOneToCart().click();
        add.addItemTwoToCart().click();
        add.getCart().click();
        Thread.sleep(3000);

//        collected the names of items in cart
        String itemOne = add.getItemOne().getText();
        String itemTwo = add.getItemTwo().getText();

//      Validate that items in cart are the same items added from the products page
        Assert.assertEquals(itemOne, productOne);
        Assert.assertEquals(itemTwo, productTwo);

        add.getCheckoutBtn().click();
        Thread.sleep(2000);

//      Created an object of CheckoutPage class and Entered checkout information
        checkout = new CheckoutPage(driver);
        checkout.getFirstName().sendKeys("Mary");
        checkout.getLastName().sendKeys("Onuorah");
        checkout.getPostalCode().sendKeys("34156783");
        checkout.getContinueBtn().click();
        Thread.sleep(2000);

//      Validate that items in checkout confirmation page are the same items added from the products page
        String itemOneInCart = checkout.getItemOneInCart().getText();
        String itemTwoInCart = checkout.getItemTwoInCart().getText();
        Assert.assertEquals(itemOneInCart, productOne);
        Assert.assertEquals(itemTwoInCart, productTwo);

        checkout.getFinishBtn().click();
//  validate that order has been placed successfully
        String message = checkout.getSuccessMessage().getText();
        checkout.getSuccessMessage().isDisplayed();
        Assert.assertEquals(message, "Thank you for your order!");
    }
}
