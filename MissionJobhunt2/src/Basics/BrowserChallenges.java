package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserChallenges {

	public static void main(String[] args)
	{

		//READ NOTES ALSO for this topic

		System.setProperty("webdriver.ie.driver", "C:\\Users\\user1\\Desktop\\Selenium\\Softwares\\webdriver materials\\resources\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();

		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys("admin");
	}

}
