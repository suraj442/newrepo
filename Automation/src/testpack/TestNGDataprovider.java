package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataprovider {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://laptop-smc8hiai/login.do");
		
	}
	
	
	@DataProvider(name = "TestData")
	public Object[][] testData()
	{
	
		Object[][] data = new Object[3][2];
		data[0][0]="admin565";
		data[0][1]="manager123";
		
		data[1][0]="admin%^";
		data[1][1]="admin123";
		
		
		data[2][0]="admin678";
		data[2][1]="admin829";
		return data;
		
	}

	
	@Test(dataProvider = "TestData")
	public void TestActiTimeInvalid(String username,String password) throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(5000);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();	
	}
}


