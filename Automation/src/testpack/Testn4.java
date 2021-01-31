package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testn4 {
	
	
	@Test()
	public void demo()
	{
		Reporter.log("Hi  I am from Demo Method",true);
	}
	
	@Test()
	public void a()
	{
		Reporter.log("Hi  I am from a Method",true);
	}

}
