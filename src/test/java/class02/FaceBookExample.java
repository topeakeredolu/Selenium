package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //go to facebook
        driver.get("https://www.facebook.com");
        //maximize the window
        driver.manage().window().maximize();
        //enter emailAddress
        WebElement emailAddress = driver.findElement(By.id("email"));
        emailAddress.sendKeys("moazzamsadiq94@gmail.com");
        //find password
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("adacadabra");
        //press login button
        WebElement loginBtn = driver.findElement(By.name("login"));
        loginBtn.click();

    }
}
