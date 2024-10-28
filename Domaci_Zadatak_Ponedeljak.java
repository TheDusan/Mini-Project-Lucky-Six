import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Domaci_Zadatak_Ponedeljak {

    public static void main(String[] args) throws InterruptedException {

        final String VALID_USERNAME = "standard_user";
        final String INVALID_USERNAME = "fdfdfdf";
        final String WEB_ADDRESS = "https://www.saucedemo.com/";
        final String VALID_PASSWORD = "secret_sauce";
        final String DESTINATION_URL = "https://www.saucedemo.com/inventory.html";
        final String ERROR_INFO_TEXT = "Epic sadface: Username is required";
        final String ERROR_INFO_TEXT_2 = "Epic sadface: Username and password do not match any user in this service";

        // logovanje sa validnim kredencijalima

        /*

        WebDriver driver = start();

        driver.navigate().to(WEB_ADDRESS);
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.clear();
        usernameField.sendKeys(VALID_USERNAME);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(VALID_PASSWORD);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        Assert.assertEquals(driver.getCurrentUrl(),DESTINATION_URL);

        powerOff(driver);
        */

        // provera ispisa teksta kada se ostave prazna polja za username i password



        /*
        WebDriver driver = start();
        driver.navigate().to(WEB_ADDRESS);

        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.clear();

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorinfo = driver.findElement(By.cssSelector(".error-message-container.error"));

        Assert.assertEquals(errorinfo.getText(), ERROR_INFO_TEXT);

        powerOff(driver);

         */

        // provera ispisa teksta sa neodgovarajucim username-om, ali odgovarajucim passwordom

        /*
        WebDriver driver = start();
        driver.navigate().to(WEB_ADDRESS);
        WebElement usernameField = driver.findElement(By.id("user-name"));
        usernameField.clear();
        usernameField.sendKeys(INVALID_USERNAME);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.clear();
        passwordField.sendKeys(VALID_PASSWORD);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorinfo = driver.findElement(By.cssSelector(".error-message-container.error"));

        Assert.assertEquals(errorinfo.getText(), ERROR_INFO_TEXT_2);

        powerOff(driver);

        */


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
