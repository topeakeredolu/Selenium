package class02;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("johnson");
        //clear the text box and resend the username
        userName.clear();
        userName.sendKeys("Admin");
        //set password
        WebElement passWord= driver.findElement(By.name("txtPassword"));
        passWord.sendKeys("Hum@nhrm123");
        //click login button
        WebElement loginBtn= driver.findElement(By.className("button"));
        loginBtn.click();
        //get the text and print welcome admin on the console
        WebElement welcomeMsg= driver.findElement(By.linkText("Welcome Admin"));
        String msg=welcomeMsg.getText();
        System.out.println("The message is: "+msg);


    }
}
