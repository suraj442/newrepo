package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test()
  public void createUser() {
	  
	  Reporter.log("Hi user is created",true);
	   
  }
  //the method which is disabled will act as a redudunt method so any method depends on the method which is disabled by giving : enable=false
  
 // will not be executed and leads to the TestNGException
  
  //and if enabled=true then it will be enabled
  
  
  
  @Test(dependsOnMethods = "createUser")
  public void createContact() {
	  
	  Reporter.log("Hi contact is created",true);
	  
	  
	  
	  
	  
  }
}
