package prac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class right {
    public static  void main(String args[]) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClick = driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
        Actions act = new Actions(driver);
        act.contextClick(rightClick).perform();
        driver.findElement(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]/li[3]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();


    }


}
