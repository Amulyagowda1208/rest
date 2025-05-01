package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class cp {

        public static void main(String args[]) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--Start-maximized");

            WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.cleartrip.com/flights");
            driver.findElement(By.xpath("//div[@class='pb-1 px-1 flex flex-middle nmx-1']")).click();
            driver.findElement(By.xpath("//div[@class='sc-aXZVg dSvAMK mr-2 mt-1']")).click();
            Thread.sleep(3000);
            WebElement ele = driver.findElement(By.xpath("//div[@class='flex flex-middle flex-between p-absolute w-100p px-5']"));
            String text=ele.getText();
            System.out.println(text);
            Actions act=new Actions(driver);
            act.keyDown(Keys.CONTROL);act.sendKeys("a");


            driver.quit();
        }
    }