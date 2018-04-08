package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadConfig 
{
	XSSFWorkbook wb ; 
	XSSFSheet sheet1; 

	public ExcelReadConfig(String excelpath) 
	{
		try {
			File src = new File (excelpath);
			FileInputStream fis =new FileInputStream(src);

			wb = new XSSFWorkbook(fis);
			
		 } 
		catch (Exception e)
		{
			System.out.println("Error occured" +e.getMessage());	
		}
	}

	public String getdata(int sheetno , int row , int column)
	{
		sheet1 = wb.getSheetAt(sheetno);

		String data = sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;

	}
public int getRowCount(int sheetIndex)
{
	int rows = wb.getSheetAt(sheetIndex).getLastRowNum();
	rows = rows+1;
	return rows;
	
}
}


