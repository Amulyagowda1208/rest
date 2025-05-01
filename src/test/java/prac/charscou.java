package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class charscou {
    public static void main(String args[]) throws IOException {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        List<WebElement> all_links = driver.findElements(By.xpath("//a"));
        for (WebElement ele : all_links) {
            String url = ele.getAttribute("href");
            if (url != null && !url.isEmpty() && (url.startsWith("https://") || url.startsWith("http://"))) {
                connection(url);

            } else {
                System.out.println("skipping invalid url");
            }
        }
            driver.quit();
        }

        public static void connection (String link_url) throws IOException {
            URL url = new URL(link_url);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(10000);
            connection.setReadTimeout(10000);
            connection.connect();
            int responsecode = connection.getResponseCode();
            if (responsecode >= 400) {
                System.out.println(connection.getResponseMessage() + link_url + "broken link");
            } else {
                System.out.println(connection.getResponseMessage() + link_url + " valid link");
            }
        }
    }


