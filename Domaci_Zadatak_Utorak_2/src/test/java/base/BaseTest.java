package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.Homepage;

import java.io.IOException;

public class BaseTest {

    public WebDriver driver;
    public Homepage homepage;
    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homepage = new Homepage(driver);
        excelReader = new ExcelReader("C:\\Users\\Dusan\\Desktop\\LoginTest.xlsx");
    }



}
