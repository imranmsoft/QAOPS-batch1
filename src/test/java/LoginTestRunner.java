import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTestRunner extends  Setup{   // we need to extend setup class
@Test  // add anotation to make it run able
public  void doUserLogin() throws InterruptedException {

    Login login=new Login(driver);//driver as constructor hisabe initilization

    //give the url to open in browser
    driver.get("https://www.saucedemo.com/");
    login.doLogin("standard_user", "secret_sauce");

}


}
