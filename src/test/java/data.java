import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class data {
    WebDriver driver;

    @BeforeClass
    void launch_browser() {
        driver = new FirefoxDriver();
    }

    @Test(dataProvider = "dp")
    void tc1(String username,String password) {

        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(password);
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
