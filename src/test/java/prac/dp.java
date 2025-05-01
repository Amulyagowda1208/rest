package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dp {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/?m=1");

        driver.findElement(By.xpath("//p[text()=\"Date Picker 2: \"]")).click();



        String target_month = "Jun";
        String target_year = "2024";
        WebElement month_drop=driver.findElement(By.xpath("//select[@class=\"ui-prac.prac.datepicker-month\"]"));
        Select  month=new Select(month_drop);
        month.selectByVisibleText("Jun");

        WebElement year_drop=driver.findElement(By.xpath("//select[@class=\"ui-prac.prac.datepicker-year\"]"));
         Select year=new Select(year_drop);
         year.selectByVisibleText("2026");
         List<WebElement> all_dates=driver.findElements(By.xpath("//table[@class=\"ui-prac.prac.datepicker-calendar\"]/tbody/tr/td/a"));
         for (WebElement dates:all_dates)
         {
             if (dates.getText().contains("25"))
             {
                 dates.click();
             }
         }
    }
}
