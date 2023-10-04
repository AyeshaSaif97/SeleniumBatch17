package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork5 {
    public static void main(String[] args) throws InterruptedException {
          /*
    HW2:
Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
Check if the "Female" radio button is displayed.
Click on the "Show Button".
Check again if the "Female" radio button is displayed or not.
Print the results of the checks to the console.
     */

        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");
        driver.manage().window().maximize();

        WebElement FemaleRadioButton= driver.findElement(By.xpath("//input[@value='gender-female']"));
        boolean StatusOfFemaleBtn= FemaleRadioButton.isDisplayed();
        System.out.println("Status of Female Radio Button: "+StatusOfFemaleBtn);

        WebElement ShowButtons=driver.findElement(By.xpath("//button[text()='Show Buttons']"));
        ShowButtons.click();



        Thread.sleep(3000);

        boolean statusOfDisplayButton= FemaleRadioButton.isDisplayed();

        if(statusOfDisplayButton){
            System.out.println("It is displayed "+statusOfDisplayButton);
        }else{
            System.out.println("It is not displayed ");
        }









    }
}
