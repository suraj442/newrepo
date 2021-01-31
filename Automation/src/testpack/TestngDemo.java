package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngDemo {
	
	@Test
	public void login()
	{
	Reporter.log("login successful",true);
	}
	
	
	
	@Test()
	public void verifyHome()
	{
		Reporter.log("home page verified",true);
	}
	
	
	
	
	
	
	
	
	

}
