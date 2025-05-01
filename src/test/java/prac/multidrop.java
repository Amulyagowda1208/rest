package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class multidrop {
    public static void main(String args[]) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement ele = driver.findElement(By.id("animals"));
        Select s=new Select(ele);
        s.selectByValue("cheetah");
        s.selectByIndex(4);
        s.selectByVisibleText("Fox");
        Thread.sleep(3000);
        System.out.println( s.getAllSelectedOptions());
        List<WebElement> selectedOptions = s.getAllSelectedOptions();
        System.out.println("Selected options:");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
        s.deselectByIndex(4);
        Thread.sleep(3000);


    }
}
