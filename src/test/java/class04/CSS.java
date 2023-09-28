package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://35.175.58.98/cssSelector.php");
        driver.manage().window().maximize();

        //find in the profile id
        WebElement profileID= driver.findElement(By.cssSelector("input[id='profileID']"));
        profileID.sendKeys("ayeshaSaif");

        //fill in the profile name
        WebElement profileName=driver.findElement(By.cssSelector("input#profileBox"));
        profileName.sendKeys("Hello");
        //feedback from Jenny
        WebElement feedbackJenny=driver.findElement(By.cssSelector("input[class='form-control feedbackBox1']"));
        feedbackJenny.sendKeys("website isn't working");
        //feedback from Raj
        WebElement feedbackRaj=driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackRaj.sendKeys("website is working");

        //contains method to fill course topic
        WebElement courseTopics= driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopics.sendKeys("Selenium");

        //using starts with
        WebElement intoToAdv  =driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intoToAdv.sendKeys("welcome");

        //using ends with
        WebElement Module=driver.findElement(By.cssSelector("input[name$='Input']"));
        Module.sendKeys("Have a good day");
    }
}
