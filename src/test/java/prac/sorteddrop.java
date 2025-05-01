package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorteddrop {
    public static void main(String args[]) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
//        List<WebElement> options1=driver.findElements(By.xpath("//select[@id=\"colors\"]//option"));
        List<WebElement> options1=driver.findElements(By.xpath("//select[@id=\"animals\"]//option"));
        ArrayList<String> original_list=new ArrayList<>();
        ArrayList<String> sorted_list=new ArrayList<>();
        for (WebElement ele:options1)
        {
            original_list.add(ele.getText());
        }
        sorted_list.addAll(original_list);
        Collections.sort(sorted_list);
        System.out.println(sorted_list);
        if (original_list.equals(sorted_list)) {
            System.out.println("✅ Dropdown is sorted.");
        } else {
            System.out.println("❌ Dropdown is NOT sorted.");
        }
    }
}