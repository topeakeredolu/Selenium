package SeleniumHomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSelectTagHW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement dreamDestination= driver.findElement(By.xpath("//div[contains(text(),'Dream')]"));
        dreamDestination.click();
        Thread.sleep(3000);
        WebElement country=driver.findElement(By.xpath("//a[contains(text(), 'japan')]"));
        country.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
