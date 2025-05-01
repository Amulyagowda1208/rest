package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;

public class input {
    @Test
    public void launch() throws IOException {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        //using select class
//        WebElement ele = driver.findElement(By.xpath("//select[@id=\"billing_country\"]"));
//        Select s = new Select(ele);
//        s.selectByVisibleText("American Samoa");


        //using xpath

//         driver.findElement(By.xpath("//span[@aria-label='Country']//span[@role='presentation']")).click();
//         List<WebElement> options1=driver.findElements(By.xpath("//span[@class=\"select2-results\"]//li"));
//         for(WebElement ele:options1)
//         {
//             if(ele.getText().contains("Andorra"))
//             {
//                 ele.click();
//                 break;
//             }
//         }


       // using prac.prac.input
        driver.findElement(By.xpath("//span[@aria-label='Country']//span[@role='presentation']")).click();
        WebElement ele=driver.findElement(By.xpath(
                "//prac.prac.input[@role=\"combobox\"]"));
//        ele.sendKeys("spain");
//        ele.sendKeys(Keys.ENTER);
        ele.sendKeys("Ger");
        driver.findElement(By.xpath("//span[@class=\"select2-results\"]/ul/li[2]")).click();
    }
}