package prac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class datepicker {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        LocalDate date = LocalDate.now().plusDays(10);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("MM/dd/yyyy");
                String formatDate= date.format(formatter);
        System.out.println(formatDate);
    WebElement ele= driver.findElement(By.xpath("//prac.prac.input[@id=\"prac.prac.datepicker\"]"));
     ele.click();
     ele.sendKeys(formatDate);
     ele.sendKeys(Keys.ENTER);




//        //cleartrip
//        driver.get("https://www.cleartrip.com/flights");
//        driver.findElement(By.xpath("//div[@class=\"pb-1 px-1 flex flex-middle nmx-1\"]")).click();
//        WebElement ele=driver.findElement(By.xpath("//div[@data-testid=\"dateSelectOnward\"]"));
//        ele.click();
//        ele.sendKeys("16");
//        ele.sendKeys(Keys.ENTER);


    }
}