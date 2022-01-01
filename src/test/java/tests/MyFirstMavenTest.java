package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyFirstMavenTest {


    public static void main(String[] args) { //chrome 86


      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      //driver.get("https://jqueryui.com/droppable/");

     driver.get("https://opensource-demo.orangehrmlive.com/");
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
     driver.findElement(By.id("btnLogin")).click();


      WebElement leave = driver.findElement(By.xpath("//b[text()='Leave']"));
      Actions actions = new Actions(driver);
      actions.moveToElement(leave).build().perform();

      WebElement entitlements = driver.findElement(By.xpath("//a[text()='Entitlements']"));
      actions.moveToElement(entitlements).build().perform();

      WebElement addEntitlements = driver.findElement(By.xpath("//a[text()='Add Entitlements']"));
      actions.click(addEntitlements).build().perform();






    }



}
