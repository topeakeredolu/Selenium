package SeleniumHomeWork;
//@here HW1:
//Navigate to http://35.175.58.98/basic-checkbox-demo.php.
//Check the if Checkbox1 is enabled
//If Checkbox1 is disabled:
//Click on the "enable checkboxes" button.
//Verify that Checkbox1 is now enabled.
//Click on Checkbox1.
//Confirm that Checkbox1 is selected.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class04HM01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();
    }
}
