package javascriptexecutorr;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeftRight {
	

		static
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.craftsvilla.com/");
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			//to scroll right
//			jse.executeScript("window.scrollBy(100,0)");
//			//to scroll left
//			Thread.sleep(3000);
//			jse.executeScript("window.scrollBy(-90,0)");
			Point loc = driver.findElement(By.xpath("//span[.='BLOG']")).getLocation();
			int xaxis = loc.getX();
			int yaxis = loc.getY();
			jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-200)+")");
			
			
			
			
}
}
