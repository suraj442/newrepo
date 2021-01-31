package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("laptop",Keys.ENTER);
		Thread.sleep(7000);
		String price = driver.findElement(By.xpath("//div[.='Lenovo ThinkBook 14 Core i5 10th Gen - (8 GB/256 GB SSD/Windows 10 Pro) ThinkBook 14 IML Thin and Ligh...']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println();
		
		
	}

}
