package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\Selenium\\Softwares\\webdriver materials\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("www.google.com");
		System.out.println(driver.getTitle());
	}

}
