package Tasks.Task18.SauceDemoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver wdriver;

    public CheckoutPage(WebDriver driver){
        wdriver = driver;
        PageFactory.initElements(wdriver, this);
    }

    @FindBy (xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public WebElement getFirstName(){
        return firstName;
    }

    @FindBy (xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public WebElement getLastName(){
        return lastName;
    }

    @FindBy (xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    public WebElement getPostalCode(){
        return postalCode;
    }

    @FindBy (xpath = "//input[@id='continue']")
    private WebElement continueBtn;
    public WebElement getContinueBtn(){
        return continueBtn;
    }

    @FindBy (xpath = "//a[@id='item_4_title_link']")
    private WebElement itemOne;
    public WebElement getItemOneInCart(){
        return itemOne;
    }

    @FindBy (xpath = "//a[@id='item_0_title_link']")
    private WebElement itemTwo;
    public WebElement getItemTwoInCart(){
        return itemTwo;
    }

    @FindBy (xpath = "//button[@id='finish']")
    private WebElement finishBtn;
    public WebElement getFinishBtn(){
        return finishBtn;
    }

    @FindBy (xpath = "//h2[contains(text(),'Thank you for your order!')]")
    private WebElement successMessage;
    public WebElement getSuccessMessage(){
        return successMessage;
    }
}
