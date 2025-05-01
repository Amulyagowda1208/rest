package prac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class shad {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notification");
        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://dev.automationtesting.in/shadow-dom");
//        WebElement host=driver.findElement(By.cssSelector("#shadow-root"));
//        SearchContext root=host.getShadowRoot();
//       WebElement host1=root.findElement(By.cssSelector("#inner-shadow-dom"));
//       SearchContext root1=host1.getShadowRoot();
//       WebElement ele=root1.findElement(By.cssSelector("#nested-shadow-root"));
//        System.out.println(ele.isDisplayed());
//       driver.get("https://www.udemy.com/");
      JavascriptExecutor js=(JavascriptExecutor) driver;
      js.executeScript("window.location='https://www.udemy.com/';");
      String title= (String) js.executeScript("return document.title");
      String url=(String) js.executeScript("return document.URL");
        System.out.println(title);
        System.out.println(url);
        js.executeScript("window.scrollBy(-100,0);");

        driver.quit();


    }
}