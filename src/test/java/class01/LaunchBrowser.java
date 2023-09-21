package class01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance of WebDriver
        WebDriver driver= new ChromeDriver(); //create an instance of the class ChromeDriver that implements WebDriver Interface
        driver.get("https://www.google.com"); //get== navigates you to a particular URL

        driver.manage().window().maximize(); // maximizes your browser window

        //get the url of the Website

        String currentURL= driver.getCurrentUrl();
        System.out.println("The current url is : " +currentURL);

        //get the title of web application
        String title =driver.getTitle();
        System.out.println("The title of the page is : "+title);

        //added a wait for 2 seconds to slow the closing of window.once code is finalized please delete it or else it can slow down.done with the script

        Thread.sleep(2000);

        //close the browser
        driver.quit();




    }
}
