import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci_Zadatak_Utorak {
    public static void main(String[] args) {

        final String WEB_ADDRESS = "https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_2?dchild=1&keywords=selenium+test&qid=1631829742&sr=8-2";

        WebDriver driver = start();
        driver.navigate().to(WEB_ADDRESS);
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        driver.manage().deleteAllCookies();
        driver.navigate().refresh();

        WebElement emptyCart = driver.findElement(By.id("sc-empty-cart"));

        Assert.assertTrue(emptyCart.isDisplayed());

    }

    public static WebDriver start() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        return driver;
    }

    public static void powerOff(WebDriver driver) throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
