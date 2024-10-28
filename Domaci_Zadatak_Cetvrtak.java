import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Domaci_Zadatak_Cetvrtak {

    private WebDriver driver;
    private final String url = "https://demoqa.com/books";

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @Test
    public void loginUsingCookies() throws InterruptedException {
        driver.navigate().to(url);
        Cookie cookie = new Cookie("expires", "2024-10-13T15%3A52%3A10.245Z");
        Cookie cookie1 = new Cookie("token", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6IlNhd3llciIsInBhc3N3b3JkIjoiT2NlYW5pYzgxNSEiLCJpYXQiOjE3MjgyMjk5MzB9.xIlZ7f9GK7rMn81H1MW6ZgLU7xGvZRftWgRdSfFYnQA");
        Cookie cookie2 = new Cookie("userID", "f94ec5be-bb8e-4276-a822-4afbff55dd14");
        Cookie cookie3 = new Cookie("userName", "sawyer");


        driver.manage().addCookie(cookie);
        driver.manage().addCookie(cookie1);
        driver.manage().addCookie(cookie2);
        driver.manage().addCookie(cookie3);

        driver.navigate().refresh();

        WebElement logoutButton = driver.findElement(By.id("submit"));
        Assert.assertTrue(logoutButton.isDisplayed());


    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
