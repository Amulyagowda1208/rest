package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class nth {
    public static void  main(String args[]) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Infosys");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@role=\"presentation\"]//ul/li[3]")).click();
        driver.quit();
    }
}
