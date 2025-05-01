package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class startdate {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--Start-maximized");

        WebDriver driver = new ChromeDriver(options);
          driver.get("https://www.booking.com/flights/index.en-gb.html?aid=304142&label=gen173nr-1FCAEoggI46AdIM1gEaGyIAQGYAQm4ARfIAQzYAQHoAQH4AQyIAgGoAgO4AvShsL8GwAIB0gIkMGM4NDc4MGMtMTYyNi00NTNiLWE5ODMtY2ZlNmMxNmFhZTM52AIG4AIB&sid=ea567b3b6d717d497c15989f31e6d61c&from=booking&");
      driver.findElement(By.xpath("//div[@class=\"SegmentHorizontal-module__date___xOIh6\"]")).click();

        String Target_month="February";
        String Target_year="2026";

        while (true) {
            WebElement ele=driver.findElement(By.xpath("(//div[@class=\"Calendar-module__monthWrapper___On+lP\"])[1]/h3"));
            String currentyear_month=ele.getText();

            String current_month = currentyear_month.split(" ")[0].trim();
            String current_year = currentyear_month.split(" ")[1].trim();
            if(Target_month.equals(current_month )&&Target_year.equals(current_year))
            {
                break;
            }
            else {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use Selenium 4 syntax
                WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class=\"Actionable-module__root___rChq9 Button-module__root___-8vjy Button-module__root--variant-tertiary___iX2Lh Button-module__root--icon-only___5HLyw Button-module__root--size-large___1iD-Q Button-module__root--variant-tertiary-neutral___4l-gQ Calendar-module__control___Rb0jn Calendar-module__control--next___mSFeL\"]")));
                element.click();

            }
        }
        Thread.sleep(3000);
       List<WebElement> all_dates= driver.findElements(By.xpath("(//table[@class=\"Calendar-module__dates___c0gFk\"])[1]/tbody/tr/td/span"));
        for (WebElement date:all_dates)
        {
            if(date.getText().contains("25"))
            {
                date.click();
            }
        }
        Thread.sleep(3000);

          driver.quit();

    }

}
