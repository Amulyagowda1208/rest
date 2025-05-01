package prac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class prevcalendar {


    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver","\\softwaredriver\\chromedriver.exe");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notification");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        driver.findElement(By.id("prac.prac.datepicker")).click();

        String target_month="July";
        String target_year="2025";
        boolean future=false;
        while (true)
        {
            String cm=driver.findElement(By.xpath("//span[@class=\"ui-prac.prac.datepicker-month\"]")).getText();
            String cy=driver.findElement(By.xpath("//span[@class=\"ui-prac.prac.datepicker-year\"]")).getText();


            if(target_month.equals(cm)&&target_year.equals(cy))
            {
                break;
            }
            else
            {
                if(future)
                {
                    driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
                                    }
                else {

                driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
                }

            }

        }
    }
}