package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTestNGTest {

    //junit --> unit test cases

    //reports - test-output
   @Test(priority = 1)
   public void verifyOrangeHRMPageTitle(){
       //this is going to be a test case
       WebDriverManager.chromedriver().setup();
       WebDriver driver= new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/");
       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       driver.findElement(By.id("txtPassword")).sendKeys("admin123");
       driver.findElement(By.id("btnLogin")).click();

       String actualTitle = driver.getTitle();
       String expectedTitle = "OrangeHRM";
       //Assertions --> verification

       Assert.assertEquals(actualTitle,expectedTitle); //stop the program here
       driver.quit();
   }

    @Test(priority = 2)
    public void verifyInvalidPasswordError(){
        //this is going to be a test case
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
        driver.findElement(By.id("btnLogin")).click();

        String actualError = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
        String expectedError = "Invalid credentials";

        Assert.assertEquals(actualError,expectedError);
        driver.quit();
    }



}
