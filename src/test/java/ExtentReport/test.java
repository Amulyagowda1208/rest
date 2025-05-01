package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class test {
    WebDriver driver;
    @BeforeClass
            public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setExperimentalOption("detach", true);
        driver = new ChromeDriver();
    }

    @Test
    void tc1() {

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("amulya@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("98451234");
    }
    @AfterClass
    void close()
    {
        driver.quit();
    }

}
