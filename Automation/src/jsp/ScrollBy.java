package jsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(100,400)");
		WebElement elementTill = driver.findElement(By.xpath("//h2[contains(.,'Selenium Level Sponsors')]"));
	    Point location = elementTill.getLocation();
	    int i=location.getX();
	    int j=location.getY();
//		js.executeScript("window.scrollBy("+i+","+j+")");
	    js.executeScript("window.scrollBy"+location);
		
	
//		
	}

}
