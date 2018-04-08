package DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

import Library.ExcelReadConfig;


public class Wordpress_TestNG_Excellinput 
{
	WebDriver driver ;
	@Test(dataProvider = "dp")

	public void f(String username, String password) throws InterruptedException
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
		Assert.assertTrue(driver.getTitle().contains("Dashboard"),"User is unable to login");
		System.out.println("Page title verified.. Thankyou");

	}

	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}


	@DataProvider
	public Object[][] dp() 
	{
		ExcelReadConfig EC = new ExcelReadConfig("C:\\workspace\\MissionJobhunt2\\src\\Test Data\\InputSheet_Wordpress.xlsx");
		int row = EC.getRowCount(0);	
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
