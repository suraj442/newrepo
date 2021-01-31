package javascriptexecutorr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSE {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/disabledElement.html");
		WebElement username = driver.findElement(By.id("i1"));
		if(username.isEnabled())
		{
			username.sendKeys("admin");
		}
		else
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i2').value='admin'");
		}
		
		WebElement password = driver.findElement(By.id("i2"));
		
		if(password.isEnabled())
		{
			password.sendKeys("admin");
		}
		else
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i2').value='manager'");
		}
		
		

		
		
		
	}

}
