package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Singleselectdrop {
    public static void main(String args[]) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement ele=driver.findElement(By.id("country"));
        Select dropdown=new Select(ele);
//        dropdown.selectByVisibleText("China");
//        dropdown.selectByIndex(3);
        dropdown.selectByValue("india");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        List<WebElement> dropoptions = dropdown.getOptions();
        for(WebElement element:dropoptions)
        {
            System.out.println(element.getText());
        }
        Thread.sleep(3000);
        driver.quit();
    }
}