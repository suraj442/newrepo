package testpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
	
	
	
	
	
	@Test()
	public void z()
	{
		Reporter.log("Hi  I am from method z",true);
	}
	

	@Test(priority = 0)
	public void h()//4
	{
	Reporter.log("Hi  I am from method h",true);
	}
	
	@Test
	public void x()//6
	{
		
		Reporter.log("Hi  I am from method x ",true);
	}
	
	
	@Test(priority = 2)
	public void f()//2
	{
		
		Reporter.log("Hi  I am from method f",true);
	}
	
	
	@Test(priority = 5)
	public void a()//1
	{
		
		Reporter.log("Hi  I am from method a",true);
	}
	@Test(priority = 6)
	public void k()//5
	{
		
		Reporter.log("Hi  I am from method k",true);
	}
	@Test(priority = 7)
	public void g()//3
	{
		
		Reporter.log("Hi  I am from method g",true);
	}
	
	
	

}
