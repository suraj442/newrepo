package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(4000);
		List<WebElement> seleniumsuggestions = driver.findElements(By.xpath("//div[@class='sbl1']/span"));
		
//		for(WebElement we :seleniumsuggestions)
//		{
//			System.out.println(we.getText());
//		   
//		}
		
		
		for(int i=0;i<seleniumsuggestions.size();i++)
		{
			
			if(seleniumsuggestions.contains("ide"));
			{
				seleniumsuggestions.get(i).click();
				break;
			}
			
				
			
				
			
		}
		
	}

}
