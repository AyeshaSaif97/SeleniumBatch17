package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        //get to the browser
        driver.get("http://35.175.58.98/Xpath.php");
        // maximize the window
        driver.manage().window().maximize();
        //go to textbox field 1
        WebElement field1=driver.findElement(By.xpath("//input[@type='text' and @name='customField1']"));
        field1.sendKeys("XPath by Attribute + Using And");

        //go to textbox field 2
        WebElement field2=driver.findElement(By.xpath("//input[@name='customField1' and @ data-detail='two']"));
        field2.sendKeys("XPath by Attribute + Using And");







    }
}
