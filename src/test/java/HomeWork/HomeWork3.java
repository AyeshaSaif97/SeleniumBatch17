package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        //fill in the Full Name Textbox
        WebElement fillInFullName=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        fillInFullName.sendKeys("Ayesha Saif");

        //fill the email
        WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
        Email.sendKeys("ayeshasaif97@hotmail.com");

        //fill in the current address
        WebElement currentAddress= driver.findElement(By.xpath("//textarea[starts-with(@id,'currentAddress')]"));
        currentAddress.sendKeys("Toronto, Ontario, Canada");

        WebElement permanentAddress= driver.findElement(By.xpath("//textarea[starts-with(@id,'permanentAddress')]"));
        permanentAddress.sendKeys("Toronto,Ontario,Canada");

        //Find Submit WebElement and Click on it
        WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
        submit.click();





    }
}
