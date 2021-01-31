package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorid1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/flipkart.html");
		Thread.sleep(5000);
////		driver.findElement(By.tagName("a")).click();
//		driver.findElement(By.id("i1")).click();
		 
		//sendKeys()
		
//		driver.findElement(By.id("email")).sendKeys("suraj@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("2345678945");
//		driver.findElement(By.id("u_0_b")).click();
		
		
		
//		driver.findElement(By.name("email")).sendKeys("suraj");
//		Thread.sleep(2000);
//		driver.findElement(By.name("pass")).sendKeys("erogijerng");
//		driver.findElement(By.id("u_0_b")).click();
		
		
		
		
		//driver.findElement(By.className("_97w4")).click();
		//driver.findElement(By.linkText("Share Via: Amidst buzz about going app-only, the poster boy of Indian e-commerce industry unveils a new logo, along with a tagline Ab Har Wish Hogi Poori. ")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Ab Har Wish Hogi Poori")).click();
		
	}

}
