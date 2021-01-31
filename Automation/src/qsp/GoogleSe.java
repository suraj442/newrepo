package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSe {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		//driver.findElement(By.name("q")).sendKeys("qspider");
		driver.findElement(By.xpath("//div[@aria-label='Search by voice']")).click();
		
		
		
//        List<WebElement> listsOfOps = driver.findElements(By.xpath("//div[@class='sbtc']/div[@class='sbl1']/span[1]"));
//        for(int k=0;k<=listsOfOps.size()-1;k++)
//        {
//        	System.err.println(listsOfOps.get(k).getText());
//        	
//        }
//        listsOfOps.get(listsOfOps.size()-2).click();
	}

}
