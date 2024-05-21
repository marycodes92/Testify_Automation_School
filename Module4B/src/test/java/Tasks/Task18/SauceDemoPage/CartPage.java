package Tasks.Task18.SauceDemoPage;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy (xpath = "//a[@id='item_4_title_link']")
    private WebElement product1;
    public WebElement getProduct1(){
        return product1;
    }

    @FindBy (xpath = "//a[@id='item_0_title_link']")
    private WebElement product2;
    public WebElement getProduct2(){
        return product2;
    }

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement backpack;
    public WebElement addItemOneToCart(){
        return backpack;
    }

    @FindBy (xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
    private WebElement bikeLight;
    public WebElement addItemTwoToCart(){
        return bikeLight;
    }

    @FindBy (xpath = "//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
    private WebElement cart;
    public WebElement getCart(){
        return cart;
    }

    @FindBy (xpath = "//a[@id='item_4_title_link']")
    private WebElement itemOne;
    public WebElement getItemOne(){
        return itemOne;
    }

    @FindBy (xpath = "//a[@id='item_0_title_link']")
    private WebElement itemTwo;
    public WebElement getItemTwo(){
        return itemTwo;
    }

    @FindBy (xpath = "//button[@id='checkout']")
    private WebElement checkoutBtn;
    public WebElement getCheckoutBtn(){
        return checkoutBtn;
    }
}
