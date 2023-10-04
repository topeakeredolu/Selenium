package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        driver.manage().window().maximize();
        WebElement multiDropDown= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(multiDropDown);
        sel.selectByVisibleText("Texas");
        sel.selectByValue("Florida");
        Thread.sleep(3000);
        //to deselect dropdown
        sel.deselectByVisibleText("Texas");
        //to check if the dropdown is a multiselect dropdown
        System.out.println(sel.isMultiple());
    }
}
