import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class parallel {
    WebDriver driver;


    @BeforeClass
    @Parameters({"browser"})
    void launch_browser(String br) {
       switch (br.toLowerCase()) {
           case "chrome":
               driver = new ChromeDriver();
               break;
           case "edge":
               driver = new EdgeDriver();
               break;
           case "firefox":
               driver = new FirefoxDriver();
               break;
           default:
               System.out.println("Invalid browser");
               return;
       }
   }

    @Test
    void tc2() {

        driver.findElement(By.className("_8ice")).isDisplayed();
    }

    @AfterClass
    void closeBrowser() {
        driver.quit();
    }

    @DataProvider(name = "dp",indices = {0,2})
    public Object[][] sendata() {
        Object data[][] = {{"test@gmail.com", "123456"}, {"amulya@gmail.com", "98765455"},{"amusja@gmail.com","908778"}};
        return  data;
    }
}
