package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGFlags {
  @Test
  public void g()
  {
	  Reporter.log("Launch the browser",true);
  }
  @Test
  public void h()
  {
	  Reporter.log("Enter the URL",true);
  }
  
  @Test
  public void d()
  {
	  Reporter.log("Login to the application",true);
  }
  
  
  @Test
  public void k()
  {
	  Reporter.log("verify the home page",true);
  }
  
  
  
  @Test
  public void e()
  {
	  Reporter.log("logout",true);
  }
  
}
