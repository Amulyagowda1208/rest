package prac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ss {
    public static void main(String args[]) throws IOException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("detach", true);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);
       WebElement ele= driver.findElement(By.xpath("//div[@class=\"date-posts\"]"));
      File src= ele.getScreenshotAs(OutputType.FILE);
      File dest=new File("C:\\Users\\DELL\\Pictures\\Screenshots\\ss4.png");
      Files.copy(src.toPath(), dest.toPath());

//        Date d=new Date();
//        SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy-HH-mm-prac.ss");
//        String timestamp=formatter.format(d);
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File src=ts.getScreenshotAs(OutputType.FILE);
//        File dest=new File("C:\\Users\\DELL\\Pictures\\Screenshots\\prac.ss"+timestamp+".png");
//      Files.copy(src.toPath(), dest.toPath());
    }
}
