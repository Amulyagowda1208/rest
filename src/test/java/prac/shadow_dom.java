package prac;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class shadow_dom {
    public static void main(String args[]) {


        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://dev.automationtesting.in/shadow-dom");
//        WebElement host1=driver.findElement(By.cssSelector("#shadow-root"));
//        SearchContext shadowroot=  host1.getShadowRoot();
//        WebElement ele=shadowroot.findElement(By.cssSelector("#shadow-element"));
//        System.out.println(ele.isDisplayed());
        WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-root"));

        // Step 2: Use JavaScript to get element inside shadow DOM
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowElement = (WebElement) js.executeScript(
                "return arguments[0].shadowRoot.querySelector('#shadow-element')", shadowHost);

        // Step 3: Interact with the element
        System.out.println("Is shadow element displayed? " + shadowElement.isDisplayed());


    }
}