package UnderstandingTestNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Abcd 
{
	@BeforeTest
	public void login()
	{
		System.out.println("login sucessfull");
	}
	@AfterTest
	public void logout()
	{
		System.out.println("log0ut sucessfull");
	}
	@Test (priority = 2)
	public void addproduct()
	{
		System.out.println("addproduct sucessfull");
	}
	@Test(priority = 1)
	public void addvendor()
	{
		System.out.println("addvendor sucessfull");
	}
	@Test (priority = 3)
	public void addcurrency()
	{
		System.out.println("addcurrency sucessfull");
	}
}

