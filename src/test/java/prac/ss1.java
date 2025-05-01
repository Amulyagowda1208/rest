package prac;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ss1 {
    @Test
    public void ts() throws IOException {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.flipkart.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy-HH-mm-prac.ss");
        String timestamp = formatter.format(new Date());
        File dest = new File("C:\\Users\\DELL\\Pictures\\Screenshots" + timestamp + ".jpeg");
        Files.copy(src.toPath(), dest.toPath());
    }
}