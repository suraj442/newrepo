package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flags {
  @Test(priority =5)
  public void login() {
	 
//	  int i=9/0;
	  Reporter.log("login to the application",true);
  }
  
  
  
  @Test(dependsOnMethods = "login",priority = 0)
  public void verifyHomePage()
  {
	  Reporter.log("verify the home page",true);
  }
  
  
  
  @Test(priority = 3)
  public void logout()
  {
	  Reporter.log("logout",true);
  }
}
