package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.HomepagePage;
import pages.LoginPage;
import pages.PracticePage;
import pages.ProfilePage;

public class BaseTest {

    public static WebDriver driver;
    public HomepagePage homepagePage;
    public LoginPage loginPage;
    public PracticePage practicePage;
    public ProfilePage profilePage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homepagePage = new HomepagePage();
        loginPage = new LoginPage();
        practicePage = new PracticePage();
        profilePage = new ProfilePage();
    }

}
