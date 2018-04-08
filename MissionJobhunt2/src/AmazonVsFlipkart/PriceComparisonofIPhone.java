package AmazonVsFlipkart;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

import com.sun.jna.platform.FileUtils;

public class PriceComparisonofIPhone {

	WebDriver driver;	

	@Test
	public void F() throws Exception 
	{
		//		driver = new FirefoxDriver();
		//		driver.get("http://www.amazon.in");
		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 7 mobile 128gb");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

		//taking the screenshots

		TakesScreenshot ts = (TakesScreenshot)driver;
		File src=	ts.getScreenshotAs(OutputType.FILE);

		org.apache.commons.io.FileUtils.copyFile(src, new File(".//Screenshots/amazon.png"));
		
		String model = driver.findElement(By.xpath(".//*[@id='result_0']/div/div[3]/div[1]/a/h2")).getText();
		String price = driver.findElement(By.xpath(".//*[@id='result_0']/div/div[4]/div[1]/a/span[2]")).getText();
		System.out.println(model +"is available on amazon for "+price);

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")).sendKeys("iphone 7 mobile 128gb");
		driver.findElement(By.xpath((".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[2]/button"))).click();
		String model_name = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div/a/div[3]/div[1]/div[1]")).getText();
		String price2 = driver.findElement(By.xpath(".//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[3]/div/div/div[1]/div/a/div[3]/div[2]/div[1]/div/div[1]")).getText();
		System.out.println(model_name +"is available on Flipkart for "+price2);
	}
	@AfterTest
	public void beforeClass() {
		driver.quit();
	}

	@BeforeMethod
	public void BeforeTest() 
	{
		driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
