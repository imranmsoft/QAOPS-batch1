import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
    WebDriver driver;
    @FindBy(id = "login-button")
    WebElement Btnlogin;

    @FindBy(id="user-name")
    WebElement txtUser;

    @FindBy(id="password")
    WebElement txtPwd;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement cartLink;

    //implementing Page Factory by using Constructor "login"

    public Login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);


    }

    //method

    public void doLogin(String user,String password) throws InterruptedException {
        txtUser.sendKeys(user);
        txtPwd.sendKeys(password);
        Btnlogin.click();
       // return cartLink.getText();
    }
}

