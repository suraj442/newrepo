package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1Xpath {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/amazonprime/257-4304630-1877024?_encoding=UTF8&ascsubtag=_k_CjwKCAjwnef6BRAgEiwAgv8mQX5GOh8LtM5eEu6P3G5bEru7-FQ8v8fjAq6xDJfcAwoV2EaFJlVb8hoCyHkQAvD_BwE_k_&ext_vrnc=hi&gclid=CjwKCAjwnef6BRAgEiwAgv8mQX5GOh8LtM5eEu6P3G5bEru7-FQ8v8fjAq6xDJfcAwoV2EaFJlVb8hoCyHkQAvD_BwE&hvadid=460697081651&hvdev=c&hvdvcmdl=&hvexid=&hvlocint=&hvlocphy=20462&hvnetw=g&hvpone=&hvpos=&hvptwo=&hvqmt=e&hvrand=400066566043532390&hvtargid=kwd-303629226711&ref=pd_sl_1rto36jhjp_e&tag=amazon-offers-2017-21&tag=googinkenshoo-21");
		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[@name='submit']")).click();
		driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
	}

}
