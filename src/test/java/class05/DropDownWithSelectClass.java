package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithSelectClass {
    public static void main(String[] args) {
        //instance
        WebDriver driver= new ChromeDriver();
        //go to facebok.com
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        //maximize the window
        driver.manage().window().maximize();
        //find the drop down or locate the drop down
        WebElement dropDown=driver.findElement(By.xpath("//Select[@id='select-demo']"));
        //create object of select class and pass in the dd element
        Select sel=new Select(dropDown);
        //use any method out of index(), visibleText, byValue to select ur desired option
        sel.selectByVisibleText("Friday");

        sel.selectByValue("Tuesday");

        sel.selectByIndex(2);





        //example below for learning
        List<WebElement> options =sel.getOptions();
        options.forEach(x -> System.out.println(x.getText()));


        //for(WebElement option:options){
        //Sout(option.getText());
        //option.click();

        }




    }
