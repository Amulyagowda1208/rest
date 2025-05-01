package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Set;

public class popup {
    @Test
    public void launch()
    {
        System.setProperty("webdriver.chrome.driver","\\softwaredriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notification");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.id("PopUp")).click();
      Set<String> window_ids= driver.getWindowHandles();
      for(String e:window_ids)
      {
          driver.switchTo().window(e);
          String title= driver.getTitle();
          if(title=="Selenium")
          {
              driver.close();
          }
      }
      driver.quit();
    }
}
