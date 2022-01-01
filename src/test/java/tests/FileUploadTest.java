package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadTest {

    //inheritance
    //encapsulation --> first
    //abstraction

    public static void main(String[] args) throws InterruptedException { //chrome 86


      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      //driver.get("https://jqueryui.com/droppable/");

     driver.get("http://demo.guru99.com/test/upload/");

     WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
     fileUpload.sendKeys(System.getProperty("user.dir")+"/testupload.txt");


     driver.findElement(By.id("terms")).click();
     Thread.sleep(5000);



    }



}
