package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();
        //go to google.com
        driver.get("https://www.google.com");
        //max the window
        driver.manage().window().maximize();
        //slow down to observe the process
        Thread.sleep(2000);
        //go to facebook.com
        driver.navigate().to("https://www.facebook.com");


        //difference between navigate and get. get does not allow you to move back and
        // forward in history but navigate allows you to go back and forth
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        //slow down to observe
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
        //slow down to observe
        Thread.sleep(2000);
        //refresh
        driver.navigate().refresh();
        driver.close();
        //also we can use
        //driver.quit();
        //close == closes the current tab
        //quit== closes the entire driver session










    }


}
