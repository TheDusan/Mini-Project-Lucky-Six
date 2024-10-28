package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.FormAuthenticationPage;
import pages.Homepage;

public class BaseTest {

    public WebDriver driver;
    public Homepage homepage;
    public FormAuthenticationPage formAuthenticationPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();


        homepage = new Homepage(driver);
        formAuthenticationPage = new FormAuthenticationPage(driver);

    }
}
