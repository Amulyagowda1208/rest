package prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;

public class Alerts {
    @Test
    public void launch() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
////  driver.findElement(By.id("alertBtn")).click();
//        Thread.sleep(2000);
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//        alert.dismiss();
        driver.findElement(By.id("promptBtn")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(2000);

        alert.sendKeys("hi");
        Thread.sleep(2000);
        alert.accept();

    }
}
