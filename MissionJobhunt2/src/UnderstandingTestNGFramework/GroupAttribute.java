package UnderstandingTestNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupAttribute 
{
	@Test (groups = {"Sanity", "Regression"})
	public void login()
	{
		System.out.println("login sucessfull");
	}
	@Test (groups = {"Sanity", "Regression"})
	public void logout()
	{
		System.out.println("log0ut sucessfull");
	}
	@Test (groups = {"Sanity"})
	public void search()
	{
		System.out.println("search sucessfull");
	}
	@Test(groups = {"Regression"})
	public void advanceSearch()
	{
		System.out.println("advanceSearch sucessfull");
	}
	@Test (groups = {"Sanity" , "Regression"})
	public void prepaidrecharge()
	{
		System.out.println("prepaidrecharge sucessfull");
	}
	@Test (groups = {"Sanity"})
	public void billpayments()
	{
		System.out.println("billpayments sucessfull");
	}
}

