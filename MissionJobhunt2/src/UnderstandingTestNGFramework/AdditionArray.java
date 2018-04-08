package UnderstandingTestNGFramework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AdditionArray {

	public static void main(String[] args) throws BiffException, IOException 
	{
//		 TODO Auto-generated method stub
		File f = new File("C:\\Users\\user1\\Desktop\\Selenium\\RichaPractice\\Additiondata.xlsx");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		int rows = s.getRows();
		int columns = s.getColumns();
		String data[][] = new String[rows][columns];
		for(int i = 0 ; i< rows ; i++)
		{
			for(int j =0;j<columns ; j++)
			{
				Cell c = s.getCell(j, i);
				data[i][j]=c.getContents();
				System.out.println(data[i][j]);

			}
		}
	}	}
