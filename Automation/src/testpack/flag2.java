package testpack;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag2 {


	@Test(dependsOnMethods = "verifyTheLogo",alwaysRun = true)
	public void createUser()
	{
		Reporter.log("Hi create the user",true);	
	}

	@Test()
	public void createContact()
	{
		Reporter.log("Hi create the contact",true);

	}


	@Test()
	public void verifyTheLogo()
	{
		int i=9/0;
		Reporter.log("logo verified",true);

	}




	@Test(alwaysRun = true,dependsOnMethods = "verifyTheLogo")
	public void homePageTitle()
	{

		Reporter.log("Title is verified",true);

	}



}
