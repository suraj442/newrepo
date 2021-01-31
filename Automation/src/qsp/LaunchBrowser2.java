package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		Dimension ds = new Dimension(100, 300);
		
		Thread.sleep(3000);
		driver.manage().window().setSize(ds);
		Thread.sleep(3000);
		Point p = new Point(300, 100);
		driver.manage().window().setPosition(p);
//		driver.manage().window().maximize();
		
		
	}
}
