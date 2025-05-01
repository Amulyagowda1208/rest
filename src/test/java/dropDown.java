import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String args[])
    {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--Start-maximized");
        WebDriver driver=new ChromeDriver(options);
        driver.get("htpp;//www.google.com");
        WebElement ele=driver.findElement(By.xpath(""));
        Select sc=new Select(ele);
        sc.selectByVisibleText("");
    }
}
