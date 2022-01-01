package tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;

public class ExcelReading  {

    public static void main(String[] args) throws IOException { //read from the excel sheet

        File file = new File(System.getProperty("user.dir")+"/testdata.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        XSSFSheet sheet = workbook.getSheet("Sheet1");
        int lastRowNum = sheet.getLastRowNum();
        System.out.println("lastRowNum = " + lastRowNum);

        int lastCellNum = sheet.getRow(0).getLastCellNum();
        System.out.println(lastCellNum);

        for (int i = 0; i <=lastRowNum ; i++) {
            for (int j = 0; j < lastCellNum; j++) {
                System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
            }
        }
    }
}
