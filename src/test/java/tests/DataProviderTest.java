package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderTest {


    @DataProvider(parallel = true)
    public static Object[][] getData() { //2 , 2
        Object[][] a = new Object[][]{
                {"Admin","sdfsfsd","123432"},
                {"Admin123","admin12345","dsfsdf"},
                {"Admin1234567","1234","sdfsd"}
        };
        return a;
        //number of rows --> number of times it is going to run your test
        //number of columns --> number of parameters to your test method
    }

    @Test(dataProvider = "getData")
    public void dataproviderTest(String username,String password,String firstname) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); //open chrome
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//presence of element in the dom
        //driver.get("https://jqueryui.com/droppable/");

        //500ms ,1s ,1.5s ,2,2.5
        driver.get("https://opensource-demo.orangehrmlive.com/");
        click(driver,By.id("txtUsername"));
        click(driver,By.id("txtPassword"));
        System.out.println(firstname);
        // really recommended
    }

    //headless browsers --> you dont see the ui

    public void click(WebDriver driver,By by){
        new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(by))
                .click();

    }

}
