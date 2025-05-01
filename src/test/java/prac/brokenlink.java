package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;
import java.util.List;

public class brokenlink {
    @Test
    public void launch() throws IOException {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.setExperimentalOption("detach",true);
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.flipkart.com");


        List<WebElement> all_links = driver.findElements(By.xpath("//a"));
        System.out.println(all_links.size());
        for (WebElement e:all_links)
        {
        String url=e.getAttribute("href");
        if(url!=null&& !url.isEmpty()&&(url.startsWith("http://")||url.startsWith("https://")))
            {
                connectionUrl(url);
            }
        else
        {
            System.out.println("Skipping invalid or unsupported URL: " + url);
        }

        }

        driver.quit();
    }
    public static void connectionUrl(String linkurl) throws IOException {
        URL url=new URL(linkurl);
        HttpURLConnection connection=(HttpURLConnection)url.openConnection();
        connection.setReadTimeout(5000);
        connection.setConnectTimeout(5000);
        connection.connect();
        int responsecode=connection.getResponseCode();
        int count=0;
        if(responsecode>=400)
        {
            System.out.println(connection.getResponseMessage()+"broken link");
            count=count+1;
        }
        else
        {
            System.out.println(connection.getResponseMessage()+    " valid link");
        }
        


    }
}