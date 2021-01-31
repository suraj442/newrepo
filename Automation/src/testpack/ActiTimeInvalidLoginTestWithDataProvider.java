package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimeInvalidLoginTestWithDataProvider {
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://laptop-smc8hiai/login.do");
		
		
	}
	
	@DataProvider(name = "InvalidSetOfCredentials")
	public Object[][] dataprovide()
	{
		Object[][] data = new Object[4][2];
		
		data[0][0]="admin123";
		data[0][1]="manager123"; 
		
		data[1][0]="admin%123";
		data[1][1]="manager&^&"; 
		
		data[2][0]="admi";
		data[2][1]="ma";
		
		data[3][0]="admin123";
		data[3][1]="123"; 
		
	    return data;
		
	}
	

	@Test(dataProvider ="InvalidSetOfCredentials" )
	public void TestInvalidLogin(String username,String password) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		Thread.sleep(3000);

		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
	}
	
	
	@AfterMethod
	public void CloseTheApp()
	{
		driver.quit();
		
		
	}
	

}
