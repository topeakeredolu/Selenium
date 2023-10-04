package Reveiwclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement createNewAccount=driver.findElement(By.xpath("//a[text()='Create new account']"));

        createNewAccount.click();
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname'']"));
        firstName.sendKeys("moazzam");
    }
}
