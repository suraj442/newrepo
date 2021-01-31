package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMAssertion {
	WebDriver driver;

	@Test
	public void orangeHRMTest()
	{   SoftAssert softAssert = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		boolean statusOfUsername = username.isDisplayed();
		boolean statusOfPassword = password.isDisplayed();

		Assert.assertEquals(statusOfUsername, true);//hard assert
		Assert.assertEquals(statusOfPassword, true);//hard assert

		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginButton.click();
		
		String homePageTitle = driver.getTitle();
		
		softAssert.assertEquals(homePageTitle, "OrangeHRM","The title of Home Page is not matching");//home page title verification
		
		driver.findElement(By.id("Subscriber_link")).click();
		softAssert.assertAll();
		



	}

}
