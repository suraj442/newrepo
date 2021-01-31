package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisEle {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/disabledElement.html");
		Thread.sleep(5000);
		WebElement untb = driver.findElement(By.id("i1"));
		WebElement psw = driver.findElement(By.id("i2"));
		if(untb.isEnabled())
		{
			untb.sendKeys("admin");
		}
		else
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i2').value='admin'");
		}
		
		
		if(psw.isEnabled())
		{
			psw.sendKeys("manager");
		}
		else
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("document.getElementById('i2').value='manager'");
		}
		
		
		
		
		
		
	}

}
