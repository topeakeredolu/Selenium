package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithSelectClass {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        //find the dropdown or locate the dropdown
        WebElement dropDown= driver.findElement(By.xpath("//Select[@id='select-demo']"));
        //create object of select class and pass in the dropdown element
        Select sel = new Select(dropDown);
        sel.selectByVisibleText("Friday");
        Thread.sleep(3000);
        sel.selectByValue("Tuesday");
        Thread.sleep(3000);
        sel.selectByIndex(2);

//        List<WebElement> options=sel.getOptions();
//        for(WebElement option:options){
//            System.out.println(option.getText());
//            option.click();
        }

    }


