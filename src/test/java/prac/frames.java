package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class frames {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://ui.vision/demo/webtest/frames/");
        WebElement ele= driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
        driver.switchTo().frame(ele);
        driver.findElement(By.xpath("//prac.prac.input[@name=\"mytext1\"]")).sendKeys("hi");
        driver.switchTo().defaultContent();
        WebElement f2=driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
        driver.switchTo().frame(f2);
        driver.findElement(By.xpath("//prac.prac.input[@name=\"mytext2\"]")).sendKeys("hello");

    }
}