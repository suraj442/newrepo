package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeTest {
	
    
    
	@Test
	public void a()
	{
		SoftAssert softAssert1=new SoftAssert();
		Reporter.log("Open the browser",true);
		softAssert1.assertEquals(true, false);
		softAssert1.assertAll();
		
	}
	
	@Test
	public void b()
	{
		SoftAssert softAssert2=new SoftAssert();
		Reporter.log("login to the application",true);
		softAssert2.assertAll();
		
		
	}
	
	@Test
	public void c()
	{   SoftAssert softAssert3=new SoftAssert();
		Reporter.log("Validate the Home Page",true);
		softAssert3.assertAll();
	}
	
	@Test
	public void d()
	{SoftAssert softAssert4=new SoftAssert();
		Reporter.log("Create contact",true);
		softAssert4.assertAll();
	}
	
	
	@Test
	public void e()
	{SoftAssert softAssert5=new SoftAssert();
		Reporter.log("Create User",true);
		softAssert5.assertAll();
	}
	
	@Test
	public void logout()
	{SoftAssert softAssert6=new SoftAssert();
		softAssert6.assertAll();
	}
	
	
	

}
