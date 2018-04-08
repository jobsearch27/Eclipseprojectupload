package UnderstandingTestNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnderstandingAttributes {
	@Test
	public void Login()

	{
		Assert.assertEquals("login sucessfull", "logins sucessfull");	
	}
@Test (dependsOnMethods = {"Login"}, alwaysRun =true)
public void Search()
{
	Assert.assertEquals("searcha sucessfull", "search sucessfull");	
	
}
@Test (dependsOnMethods ="")
public void Advancesearch()
{
	Assert.assertEquals("advsearch sucessfull", "advsearch sucessfull");	
	
}
@Test (priority = 2)
public void Logout()
{
	Assert.assertEquals("logout sucessfull", "logout sucessfull");	
	
}

}