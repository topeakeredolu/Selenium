package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/javascript-alert-box-demo.php");
        driver.manage().window().maximize();
        //task1: click on the first button and handle alert
        WebElement alert1= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1.click();
        Thread.sleep(3000);
        //switch to alert
        Alert alert=driver.switchTo().alert();
        alert.accept();
        //task2: click on the third alert, send some text there and press ok
        WebElement alert2= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alert2.click();
        Thread.sleep(3000);
        //switch to alert
        alert.sendKeys("I am human");
        Thread.sleep(3000);
        alert.accept();
        //task3: click on 2nd alert
        WebElement alert3= driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        Thread.sleep(3000);
        alert3.click();
        Thread.sleep(3000);
        alert.dismiss();


    }
}
