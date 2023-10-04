package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {
    public static void main(String[] args) throws InterruptedException {
        //instance
        WebDriver driver= new ChromeDriver();
        //go to facebok.com
        driver.get("http://35.175.58.98/basic-select-dropdown-demo.php");
        //maximize the window
        driver.manage().window().maximize();

        //find the drop down
        WebElement dd= driver.findElement(By.xpath("//Select[@id='multi-select']"));
        //
        Select sel=new Select(dd);
//select
        sel.selectByVisibleText("Texas");
        sel.selectByValue("Florida");
        Thread.sleep(3000);

        //deselect
        sel.deselectByVisibleText("Texas");

        //check whether the dropdown is multiselect or not
        System.out.println(sel.isMultiple());















        //http://35.175.58.98/javascript-alert-box-demo.php








    }
}
