package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//implicitelyWait
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
//		driver.findElement(By.xpath("//button[.='✕']")).click();
//		driver.findElement(By.xpath("//span[.='Cart']")).click();
//		driver.findElement(By.xpath("//button[.='Login']")).click();

}
}
