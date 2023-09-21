package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //navigate to the website
        driver.get("http://35.175.58.98/input-form-locator.php");

        //maximize the window
        driver.manage().window().maximize();

        //located thr WebElement first name
        WebElement firstName=driver.findElement(By.id("first_name"));

        //use send keys to send the data to web element
        firstName.sendKeys("Moazzam");

        //locate the Web element last name
        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Sadiq");

        //locate the WebElement email
        WebElement email=driver.findElement(By.className("form-control-01"));
        email.sendKeys("moazzamsadiq94@gmail.com");

        //locate the button and click on it
        WebElement submitBtn=driver.findElement(By.tagName("button"));
        submitBtn.click();

        //locate the Web element Link
        WebElement LinkBtn=driver.findElement(By.linkText("Link"));
        LinkBtn.click();

//      locate the webElement click here using partial link text
        WebElement LinkBtnPartial=driver.findElement(By.partialLinkText("Here"));
        LinkBtnPartial.click();

        driver.quit();
    }
}
