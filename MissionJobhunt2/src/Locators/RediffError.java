package Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();

driver.manage().window().maximize();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).click();
Alert alert = driver.switchTo().alert();
alert.getText();
alert.accept();
driver.close();
	}

}
