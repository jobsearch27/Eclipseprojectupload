package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadExcel {

	public static void main(String[] args) throws Exception 
	{
		//	File src = new File ("C:/Users/user1/Desktop/Selenium/RichaPractice/InputSheet.xlsx");

		File src = new File ("C:\\Users\\user1\\Desktop\\Selenium\\RichaPractice\\InputSheet.xlsx");
		FileInputStream fis =new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		for(int i =0 ; i<rowcount ; i++)
		{
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("the data in excel is " +data0);
		}
	wb.close();		
	}

}
