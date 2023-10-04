package review1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/*
Check the if Checkbox1 is enabled
If Checkbox1 is disabled:
Click on the "enable checkboxes" button.
Verify that Checkbox1 is now enabled.
Click on Checkbox1.
Confirm that Checkbox1 is selected.
 */
public class Hw3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //go to URL
        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        //maximize the window
        driver.manage().window().maximize();
        //check if checkbox1 is enabled

        //check all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for (WebElement checkbox : checkboxes) {
            String option = checkbox.getAttribute("value");
            if (option.equalsIgnoreCase("Checkbox-1")) {
                boolean state = checkbox.isEnabled();
                System.out.println(state);
                //If Checkbox1 is disabled:
                if (!state) {
                    //Click on the "enable checkboxes" button.
                    WebElement enableBtn = driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
                    enableBtn.click();
                    //Verify that Checkbox1 is now enabled.
                    boolean status2 = checkbox.isEnabled();
                    if (status2) {
                        //Click on Checkbox1.
                        checkbox.click();
                        //Confirm that Checkbox1 is selected.
                        boolean isSelectedStatus=checkbox.isSelected();
                        System.out.println(isSelectedStatus);

                    }
                }
            }
        }
    }
}