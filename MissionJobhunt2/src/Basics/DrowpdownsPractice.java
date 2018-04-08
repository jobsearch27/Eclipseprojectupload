package Basics;

import static org.junit.Assert.*;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DrowpdownsPractice {
	WebDriver driver;

	@Before
	public void setUp() throws Exception 
	{
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception 
	{
		driver.quit();
	}

	@Test
	public void test()
	{

		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[1]")).sendKeys("Richa");
		driver.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[1]/input[2]")).sendKeys("Arora");
		driver.findElement(By.id("sex-1")).click();;


		driver.findElement(By.id("exp-3")).click();


		driver.findElement(By.id("datepicker")).sendKeys("27-04-1991");

		driver.findElement(By.id("profession-1")).click();

		//window handle

		/*driver.findElement(By.id("photo")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("D:\\Richa\\Pictures\\College\\farewell\\IMG-20130508-WA0003.jpg");
		driver.findElement(By.name("Open")).click();
		driver.switchTo().activeElement();
		 */

		//when used in a string , each back slash in your file path is represented by a double slash

		//	driver.findElement(By.id("photo")).sendKeys("D:\\Richa\\Pictures\\College\\farewell\\IMG-20130508-WA0003.jpg");

		//Select statements
		driver.findElement(By.id("tool-2")).click();
		WebElement Myselection = driver.findElement(By.id("continents"));
		Select dropdown = new Select (Myselection);
		dropdown.selectByVisibleText("Africa");

		WebElement Myselection1 = driver.findElement(By.id("selenium_commands"));
		Select dropdown1 = new Select (Myselection1);
		//	dropdown1.isMultiple();
		dropdown1.selectByVisibleText("Browser Commands");
		dropdown1.selectByVisibleText("Wait Commands");
		dropdown1.selectByVisibleText("WebElement Commands");
		driver.findElement(By.id("submit")).click();
		//fail("Not yet implemented");
	
	}

}
