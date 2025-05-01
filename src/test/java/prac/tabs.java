package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;

public class tabs {
    @Test
    public void launch() throws IOException {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

//        driver.get("http://www.deadlinkcity.com/");
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.get("https://www.facebook.com/");
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.get("https://www.flipkart.com/");
//        Set<String> windowHandlesid= driver.getWindowHandles();
//        System.out.println(windowHandlesid);
//        for (String handle : windowHandlesid) {
//            driver.switchTo().window(handle);
//           if (driver.getTitle().contains("Facebook – log in or sign up")) {
///            driver.close();
//            }


      //code 2
        driver.get("https://testautomationpractice.blogspot.com/");
       driver.findElement(By.linkText("Blogger")).click();
       Set<String> windowids=driver.getWindowHandles();
       for (String ele :windowids)
       {

           driver.switchTo().window(ele);
           if (driver.getTitle().contains("Blogger.com - Create a unique and beautiful blog easily."))
           {
               driver.close();
           }
       }


        }
    }
