package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class InputTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("test is passed");
        } else{
            System.out.println("test is failed");
        }


    }

    public static void add(int a, int b){
        System.out.println("Sum value : "+(a+b));
    }

}
