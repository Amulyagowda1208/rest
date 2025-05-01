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
import java.util.List;

public class links {
    @Test
    public void launch() throws IOException {
        System.setProperty("webdriver.chrome.driver", "\\softwaredriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

        System.out.println("Total prac.links found: " + allLinks.size());

        int brokenCount = 0; // Counter for broken prac.links

        for (WebElement ele : allLinks) {
            String url = ele.getAttribute("href");

            // ✅ Filter only valid HTTP(S) URLs
            if (url != null && !url.isEmpty() && (url.startsWith("http://") || url.startsWith("https://"))) {
                if (isBrokenLink(url)) {
                    brokenCount++;
                }
            } else {
                System.out.println("Skipping invalid or unsupported URL: " + url);
            }
        }

        System.out.println("Total broken prac.links: " + brokenCount);
        driver.quit();
    }

    public static boolean isBrokenLink(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);
            connection.setRequestMethod("HEAD"); // Faster method for checking link validity
            int responseCode = connection.getResponseCode();

            if (responseCode >= 300 && responseCode < 400) {
                System.out.println(linkUrl + " -> Redirect detected, skipping.");
                return false; // Not a broken link, just a redirect
            } else if (responseCode >= 400) {
                System.out.println(linkUrl + " -> " + connection.getResponseMessage() + " (Broken ❌)");
                return true; // Broken link
            } else {
                System.out.println(linkUrl + " -> " + connection.getResponseMessage() + " (Valid ✅)");
                return false; // Valid link
            }

        } catch (IOException e) {
            System.out.println(linkUrl + " -> Error: " + e.getMessage());
            return true; // Treat as broken if an exception occurs
        }
    }
}
