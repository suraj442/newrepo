package testpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class ActiTimeTest2 {
	
	
	@Test
	public void TestActiTime()
	{
		SoftAssert softAssert = new SoftAssert();
		Reporter.log("Open the Browser",true);
		Reporter.log("enter the URL",true);
		Reporter.log("login to the application",true);
		Assert.assertEquals(true, true);// hard assert
		Reporter.log("Validate the Home page",true);
		softAssert.assertEquals(false, true);
		Reporter.log("Create Reports",true);
		Reporter.log("Create User",true);
		softAssert.assertAll();
		softAssert.
	}

	@Test
		public void login()
		{
			Reporter.log("Open the browser",true);
		}

}
