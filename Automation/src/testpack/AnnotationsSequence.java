package testpack;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsSequence {
	
	
//	App description
//	Take the data from DB
//	open the browser
//	login to the app
//	userVerified
//	logout from app
//	login to the app
//	GoogleTest
//	logout from app
//	close the browsr
//	gerenrate the reports
	//done
//	PASSED: verifyUserTest
//	PASSED: googleTest

	
	@BeforeClass
    public void a() {
		Reporter.log("open the browser",true);
	}
	
	
	@BeforeMethod
	public void b()
	{
		Reporter.log("login to the app",true);
	}

	
	@BeforeSuite
	public void c()
	{
		Reporter.log("App description",true);
	}
	
	
	@BeforeTest
	public void d()
	{
		Reporter.log("Take the data from DB",true);	
	}
	
	@AfterClass
    public void e() {
		Reporter.log("close the browser",true);
	}
	
	
	@AfterMethod
	public void f()
	{
		Reporter.log("logout from app",true);
	}

	
	@AfterSuite
	public void g()
	{
		Reporter.log("done",true);
	}
	
	
	@AfterTest
	public void h()
	{
		Reporter.log("gerenrate the reports",true);	
	}
	
	@Test(priority = 2)
	public void googleTest()
	{
		Reporter.log("GoogleTest",true);	
	}
	
	@Test(priority = 1)
	public void verifyUserTest()
	{
		Reporter.log("userVerified",true);	
	}
	
	
	
	
	
	
	
	
}
