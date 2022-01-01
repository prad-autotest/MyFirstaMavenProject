package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportTest {


    public static void main(String[] args) { //html, email
        ExtentReports extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/index.html");
        extent.attachReporter(spark);

        ExtentTest loginTest = extent.createTest("Login Test"); //1 test case
        loginTest.assignAuthor("Amuthan");
        loginTest.assignCategory("smoke").assignCategory("regression").assignCategory("login test");
        loginTest.pass("username is entered");
        loginTest.pass("tpassword is entered");
        loginTest.pass("login button is clicked");
        loginTest.fail("test case login is failed");

        ExtentTest homepagetest = extent.createTest("home page Test"); //2 test case
        homepagetest.assignAuthor("Sachin").assignAuthor("Dravid");
        homepagetest.assignCategory("regression").assignCategory("home test");
        homepagetest.pass("log in successful");
        homepagetest.pass("home page logo is displayed");
        homepagetest.pass("home page test is passed");

        extent.flush();//producing the report --> writes all the lines in to the html
    }
}
