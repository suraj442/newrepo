package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority2 {
	
	
	@Test(priority = 3)//5
	public void x()
	{
		Reporter.log("Hi I am From X");
	}

	
	
	@Test(priority = 3)//4
	public void c()
	{
		Reporter.log("Hi I am From C");
	}
	
	
	//highest priority=0 , 1 will have less priority than 0 | 2 will have  less priority than 1
	
	@Test
	public void k()//2
	{
		Reporter.log("Hi I am From K");
	}
	
	
	
	@Test(priority = 0)//1
	public void h()
	{
		Reporter.log("Hi I am From h");
	}
	
	
	
	//hkycxv
	
	@Test
	public void y()//3
	{
		Reporter.log("Hi I am From y");
	}
	
	
	
	
	@Test(priority = 5)//6
	public void v()
	{
		Reporter.log("Hi I am From v");
	}
}
