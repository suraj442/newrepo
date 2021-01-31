package jsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class SS {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
 		WebDriver driver=new ChromeDriver();
//		TakesScreenshot driver3=new ChromeDriver();
//		((WebDriver) driver3).manage().window().maximize();
//		((WebDriver) driver3).get("https://www.amazon.com/");
		driver.get("https//www.google.com");
////		//to take the screenshot with explicit type casting
////		TakesScreenshot ts=(TakesScreenshot)driver;
////		File src = ts.getScreenshotAs(OutputType.FILE);
////		File dest=new File("./data/amazon.png");
////		Files.copy(src, dest);
//		
//		
//		
////		//taking ss with cd
////		File src1 = driver.getScreenshotAs(OutputType.FILE);
////		File dest1=new File("./data/amazonwithcd.png");
////		Files.copy(src1, dest1);
////		
//		
//		//taking ss by downcasting
//	    
////		File src2 = driver3.getScreenshotAs(OutputType.FILE);
////		File dest2=new File("./data/amazonwithts.png");
////		Files.copy(src2, dest2);
//		
//		//Screnshot through Downcasting
//		
////		RemoteWebDriver rwd=(RemoteWebDriver)driver;
////		File srcnew = rwd.getScreenshotAs(OutputType.FILE);
////		File dest=new File("./data/fileRD.png");
////		Files.copy(srcnew,dest);
//		
//		
//		EventFiringWebDriver e=new EventFiringWebDriver(driver);
//		File srce=e.getScreenshotAs(OutputType.FILE);
//		File deste=new File("./data/event.png");
//		Files.copy(srce,deste);
//		

}
}
