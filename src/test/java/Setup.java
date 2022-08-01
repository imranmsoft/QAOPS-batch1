import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Setup {
    WebDriver driver;
    @BeforeTest   // anotation use
    public void setUp() throws IOException {

        // windows
        //System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
        //linux
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver_linux64/chromedriver");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--headed");

        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

    }
   @AfterTest  //sob kaj ses hole then use hobe
    public void logout(){
        driver.close();
    }
}

