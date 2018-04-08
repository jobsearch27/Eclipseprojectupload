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

public class ReadExcel_forloop {

	public static void main(String[] args) throws Exception 
	{
		//	File src = new File ("C:/Users/user1/Desktop/Selenium/RichaPractice/InputSheet.xlsx");

		File src = new File ("C:\\Users\\user1\\Desktop\\Selenium\\RichaPractice\\InputSheet.xlsx");
		FileInputStream fis =new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String datazero = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("data from excel is " + datazero);
		wb.close();
	}

}
