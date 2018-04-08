package WriteExcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import Library.ReadWriteExcelConfig;


public class Wordpress_TestNG_WriteExcel 
{
	WebDriver driver ;
	ReadWriteExcelConfig EC = new ReadWriteExcelConfig("C:\\workspace\\MissionJobhunt2\\src\\Test Data\\InputSheet_Wordpress.xlsx");
	int row = EC.getRowCount(0);	

	@Test(dataProvider = "dp")

	public void script(String username, String password) throws InterruptedException
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.id("wp-submit")).click();
		Thread.sleep(5000);
		driver.getTitle();
		if(driver.getTitle().contains("Dashboard"))

		{
			EC.PassData(0, row, 2)	;
		}
		else
		{
			EC.FailData(0, row, 2)	;
		}
		System.out.println("Page title verified.. Thankyou");

	}

	@AfterMethod
	public void aftertest(ITestResult result)
	{
		Throwable t = result.getThrowable();
	}
	public void afterMethod()
	{
		driver.quit();
	}
	


	@DataProvider
	public Object[][] dp() 
	{
		Object data[][] = new Object[row][2];

		for (int i = 0 ; i<row ; i++)
		{
			data[i][0] = EC.getdata(0, row, 0);
			data[i][1] = EC.getdata(0, row, 1);
			//			return data;

		}
		return data;
	}
}
