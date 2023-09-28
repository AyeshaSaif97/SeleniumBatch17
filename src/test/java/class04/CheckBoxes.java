package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/basic-checkbox-demo.php");
        driver.manage().window().maximize();

        //select the check box
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        checkbox1.click();
        //if it is selected after click
        boolean selectState = checkbox1.isSelected();
        if (selectState) {
            System.out.println("the checkbox is selected");
        } else {
            System.out.println("the checkbox isn't selected");
        }

        //select all options
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        for (WebElement checkBox : checkboxes){
            //click on it
            checkBox.click();
    }

        //deselect option 3
        for(WebElement checkBoxAgain:checkboxes){
            //to verify what is the option
            String option=checkBoxAgain.getAttribute("value");
            if(option.equalsIgnoreCase("Option-3")){
                checkBoxAgain.click();
            }




        }




        //make sure your code is not hardcoded with the locator

    }

}
