package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Dropdown_divtab_Bootstrapdropdown 
{
	@Test
	public void Bootstrapdd()
	{
		WebDriver driver = new FirefoxDriver ();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//*[@id='menu1']")).click();

		List<WebElement> elementList = driver.findElements(By.xpath(".//ul[@class='dropdown-menu']//li/a"));

		for (int i=0;i< elementList.size();i++)
		{
			WebElement element = elementList.get(i);
			String values = element.getAttribute("innerHTML");
	
			if(values.contentEquals("JavaScript"))
			{
				element.click();
				break;
			}
			System.out.println("The value is ====="+values);
		}
		//driver.quit();
	}

}
