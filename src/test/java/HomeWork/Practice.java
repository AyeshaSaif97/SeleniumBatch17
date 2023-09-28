package HomeWork;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Cristiano");
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Last Name']")).sendKeys("Ronaldo");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("apples123@hotmail.com");
        driver.findElement(By.xpath("//button[text()='Submit ']")).click();
    }
}
