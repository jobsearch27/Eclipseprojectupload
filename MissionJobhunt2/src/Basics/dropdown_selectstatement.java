package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class dropdown_selectstatement
{
	WebDriver driver = new FirefoxDriver ();
	public void SelectDropdown() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement month_selected = driver.findElement(By.id("month"));
		Select months = new Select(month_selected);

		//March is selected
		months.selectByIndex(2);

		//April is selected
		months.selectByValue("4");

		//Oct is selected
		months.selectByVisibleText("Oct");

		WebElement selected_value = months.getFirstSelectedOption();
		System.out.println("The selected value is "+selected_value.getText());
		Thread.sleep(3000);

		List<WebElement> months_list = months.getOptions();
		int total_months =months_list.size();
		System.out.println("The total number of months are "+total_months);

		for(WebElement ele : months_list)
		{
			System.out.println("The month is =="+ele.getText());
		}
	}

}
