package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataProviderWithExcel {

    //number of rows --> number of times it is going to run your test
    //number of columns --> number of parameters to your test method
    @DataProvider(parallel = true)
    public static Object[][] getData() throws IOException { //2 , 2

        File file = new File(System.getProperty("user.dir")+"/testdata.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int lastRowNum = sheet.getLastRowNum();
        System.out.println("lastRowNum = " + lastRowNum);

        int lastCellNum = sheet.getRow(0).getLastCellNum();
        System.out.println(lastCellNum);

        Object[][] a = new Object[lastRowNum][1]; //Object[3][1]
        Map<String,String> map;

        for (int i = 1; i <=lastRowNum ; i++) {
            map=new HashMap<>();
            for (int j = 0; j < lastCellNum; j++) { //1,0
                String key = sheet.getRow(0).getCell(j).getStringCellValue();
                String value = sheet.getRow(i).getCell(j).getStringCellValue();
                map.put(key,value);
            }
            a[i-1][0] = map;
        }

        return a;
    }

    @Test(dataProvider = "getData")
    public void dataproviderTest(Map<String,String> data) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys(data.get("username"));
        driver.findElement(By.id("txtPassword")).sendKeys(data.get("password"));
        Thread.sleep(3000);
        driver.quit();

    }
}
