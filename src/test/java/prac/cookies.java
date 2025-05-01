package prac;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class cookies {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.youtube.com/watch?v=QUSQeVBmx9E");

       Cookie cookie=new Cookie("dataar","12345");
        Cookie cookie1=new Cookie("dataar1","1234567");
        driver.manage().addCookie(cookie);
        driver.manage().addCookie(cookie1);
        System.out.println(driver.manage().getCookies().size());
        driver.manage().deleteCookieNamed("dataar1");
//
        System.out.println(driver.manage().getCookies().size());
        driver.manage().deleteAllCookies();
        System.out.println(driver.manage().getCookies().size());
        driver.quit();
    }
}
