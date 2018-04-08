package ReadExcel;

import Library.ExcelReadConfig;

public class ReadExcel_usingLibfunction {

	public static void main(String[] args)
	{
		ExcelReadConfig EC = new ExcelReadConfig
				("C:\\Users\\user1\\Desktop\\Selenium\\RichaPractice\\InputSheet.xlsx");
		System.out.println("the data is "+EC.getdata(0, 0, 1));
	}

}
