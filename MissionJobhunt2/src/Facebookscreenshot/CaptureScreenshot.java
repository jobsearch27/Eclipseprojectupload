package Facebookscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CaptureScreenshot {
	WebDriver driver;


	@Test
	public void f() throws Exception 
	{

		driver.findElement(By.id("email")).sendKeys("Gooddd luck");

		System.out.println("the url is "+driver.getCurrentUrl());
		
		/*int xcordinate = driver.manage().window().getPosition().getX();	
		int ycordinate = driver.manage().window().getPosition().getY();	
		System.out.println("the x and cordinates are "+xcordinate +ycordinate);

		TakesScreenshot ts = (TakesScreenshot)driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".\\Screenshots\\facebook.jpg"));
*/
	}


	@BeforeMethod
	public void beforeMethod() {

		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
