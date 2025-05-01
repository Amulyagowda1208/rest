package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class customisedcalendar {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        driver.findElement(By.id("prac.prac.datepicker")).click();

//        System.out.println(current_month);


        String target_month = "June";
        String target_year = "2024";
        while (true) {
            String current_month = driver.findElement(By.xpath("//span[@class=\"ui-prac.prac.datepicker-month\"]")).getText();
            String current_year = driver.findElement(By.xpath("//span[@class=\"ui-prac.prac.datepicker-year\"]")).getText();
            boolean future_date=false;
            if (target_month.equals(current_month) && target_year.equals(current_year)) {
                break;
            }
            if(future_date)
            {
                driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
            }
            else {
                driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
            }


        }
        String target_date="9";
        List<WebElement> all_dates=driver.findElements(By.xpath("//table[@class=\"ui-prac.prac.datepicker-calendar\"]/tbody/tr/td/a"));

        for(WebElement date:all_dates)
        {
            if(date.getText().equals(target_date))
            {
                  date.click();
            }
        }

       driver.quit();
    }

}
