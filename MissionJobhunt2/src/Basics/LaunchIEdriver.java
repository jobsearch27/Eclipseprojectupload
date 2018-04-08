package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\user1\\Desktop\\Selenium\\Softwares\\webdriver materials\\resources\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("www.google.com");
		System.out.println(driver.getTitle());
	}

}
