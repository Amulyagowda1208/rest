package prac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class actions {

    public  static  void main(String args[]) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver","\\softwaredriver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
//        WebElement copy=driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
//        WebElement ele=driver.findElement(By.xpath("//button[@class=\"dropbtn\"]"));
//        Actions act= new Actions(driver);
//       act.scrollToElement(copy).perform();
//       /*mover
//        act.moveToElement(ele).perform();
//        Thread.sleep(3000);*/
//        /* double*/
//        act.doubleClick(copy).perform();

        //drag and drop
//        WebElement copy=driver.findElement(By.xpath("//button[text()=\"Copy Text\"]"));
//        WebElement src=driver.findElement(By.id("draggable"));
//        WebElement target=driver.findElement(By.id("droppable"));
//        Actions act=new Actions(driver);
//        act.scrollToElement(copy).perform();
//        act.dragAndDrop(src,target).perform();
//        Thread.sleep(3000);
        WebElement copy=driver.findElement(By.xpath("//h2[text()=\"Slider\"]"));
        WebElement min_slider=driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"][1]"));
        WebElement max_slider=driver.findElement(By.xpath("//span[@class=\"ui-slider-handle ui-corner-all ui-state-default\"][2]"));
        Actions act=new Actions( driver);
        act.scrollToElement(copy);
        act.dragAndDropBy(min_slider,-33,0).perform();
        act.dragAndDropBy(max_slider,20,0).perform();
        Thread.sleep(3000);



    }

}
