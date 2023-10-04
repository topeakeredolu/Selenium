package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.util.List;

public class Links {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.findElements(By.tagName("a"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for(WebElement link:links){
            String nameOfLink =link.getText();
            System.out.println(nameOfLink);
            String linkVal = link.getAttribute("href");
            System.out.println(linkVal);
        }

    }
}
