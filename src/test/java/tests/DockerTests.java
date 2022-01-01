package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DockerTests {

    @Test
    public void dockerTest() throws MalformedURLException, InterruptedException {
        //WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver(); //open chrome
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");

        WebDriver driver = new RemoteWebDriver(new URL("http://3.86.255.205:4444/"),capabilities);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//presence of element in the dom
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(7000);
        driver.quit();
    }
}
