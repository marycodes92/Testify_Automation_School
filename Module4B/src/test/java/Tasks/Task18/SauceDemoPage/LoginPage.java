package Tasks.Task18.SauceDemoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy (xpath = "//input[@id='user-name']")
    private WebElement username;
    public WebElement getUsername(){
        return username;
    }

    @FindBy (xpath = "//input[@id='password']")
    private WebElement password;
    public WebElement getPassword(){
        return password;
    }

    @FindBy (xpath = "//input[@id='login-button']")
    private WebElement loginBtn;
    public WebElement getLoginBtn(){
        return loginBtn;
    }
}
