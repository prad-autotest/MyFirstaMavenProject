package demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestNGExtentReportIntegration {

    //listeners , what the testng test is doing - listeners

    public ExtentReports extent;
    public ExtentTest loginTest;

    @BeforeSuite
    public void beforeSuite(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/index.html");
        extent.attachReporter(spark);
    }

    @AfterSuite
    public void afterSuite(){
        extent.flush();
    }


    @BeforeMethod
    public void setUp(Method method) { //Reflection in java
        loginTest = extent.createTest(method.getName());
    }
    @Test(description = "To check whether the test is ...")
    public void test1(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://jqueryui.com/droppable/");

        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginTest.pass("url is loaded");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin123");
        loginTest.pass("username is entered");
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
        loginTest.pass("password is entered");
        driver.quit();
    }
    @Test(description = "description 2 ....")
    public void test2(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("https://jqueryui.com/droppable/");

        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginTest.pass("url is loaded");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin123");
        loginTest.pass("username is entered");
        driver.findElement(By.id("txtPassword")).sendKeys("admin");
        loginTest.pass("password is entered");
        loginTest.pass("test2 is passed");
        driver.quit();
    }


}
