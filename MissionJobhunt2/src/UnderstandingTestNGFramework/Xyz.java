package UnderstandingTestNGFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Xyz 
{
	@Test (priority = 2)
	public void deleteaddproduct()
	{
		System.out.println("deleteaddproduct sucessfull");
	}
	@Test(priority = 1)
	public void deleteaddvendor()
	{
		System.out.println("deleteaddvendor sucessfull");
	}
	@Test (priority = 3)
	public void deleteaddcurrency()
	{
		System.out.println("deleteaddcurrency sucessfull");
	}
}

