package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class bootstrap {
    public static void main(String args[]) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.findElement(By.xpath("//span[@class=\"multiselect-selected-text\"]")).click();
        driver.findElement(By.xpath("//prac.prac.input[@value=\"Java\"]")).click();
        driver.findElement(By.xpath("//prac.prac.input[@value=\"csharp\"]")).click();

        List<WebElement> all_options = driver.findElements(By.xpath("//ul[contains(@class,\"multiselect\")]//label"));
        for (WebElement option1 : all_options) {

            if (option1.getText().contains("Python")) {
                option1.click();
            }

            driver.quit();
        }
    }
}