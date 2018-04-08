package DataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class Wordpress_TestNG_NoExcelInput 
{
	WebDriver driver;
	@Test(dataProvider = "dp")

	public void logintowordpress(String username, String password) throws InterruptedException 
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
		Object[][] data = new Object[3][2];
		data[0][0]="admin1";
		data[0][1]="demo";

		data[1][0]="admin";
		data[1][1]="demo123";

		data[2][0]="admin1";
		data[2][1]="demo2";

		return data;	
	}
}

