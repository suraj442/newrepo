package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("a1b2c1d1@gmail.com");
		driver.findElement(By.name("password")).sendKeys("inst@123");
		WebElement button = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ' and @type='submit']"));
	    button.click();
	    Thread.sleep(2000);
	    
	    
	    
	    
	    
	}

}