package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Imagehandlling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
driver.manage().window().maximize();

driver.get("https://www.google.com");
System.out.println(driver.findElement(By.id("hplogo")).isDisplayed());
System.out.println(driver.findElement(By.id("hplogo")).getAttribute("title"));

System.out.println(driver.findElement(By.id("hplogo")).getText());
driver.navigate().to("newtours.demoaut.com"); 
driver.findElement(By.name("login")).click();
driver.close();
}}