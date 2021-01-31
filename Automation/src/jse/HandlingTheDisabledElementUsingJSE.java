package jse;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTheDisabledElementUsingJSE {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// to use the webDriver methods
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/disabledElementText.html");
		
		WebElement username = driver.findElement(By.id("i1"));
		WebElement psw = driver.findElement(By.id("i2"));
		
		if(username.isEnabled())
		{
			Thread.sleep(3000);
			username.sendKeys("admin");
		}
		
		else
		{
			//explicit type casting to use the method of JSE(I)
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i1').value='admin'");
		}
		
		
		if(psw.isEnabled())
		{
			psw.sendKeys("admin");
		}
		
		else
		{
			Thread.sleep(3000);
			//explicit type casting to use the method of JSE(I)
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i2').value='manager'");
		}
		
		
		

}
}
