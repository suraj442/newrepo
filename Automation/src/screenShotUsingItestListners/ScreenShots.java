package screenShotUsingItestListners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(CustomListner.class)
public class ScreenShots extends Base{
	
	
	@BeforeMethod
	
	public void setUp() throws InterruptedException
	{
		initialization();
	}
	
	
	
	
	@Test
	public void testGooglePage()
	{
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "GooglepAGE");
		
	}
	
	@Test
	public void testGooglePage1()
	{
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "GooglepAGE");
		
	}
	
	
	@Test
	public void testGooglePage2()
	{
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "GooglePage");
		
	}
	
	@Test
	public void testGooglePage3()
	{
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "GooglePage");
		
	}
	
	@Test
	public void testGooglePage4()
	{
		String googleTitle = driver.getTitle();
		Assert.assertEquals(googleTitle, "GooglePage");
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
