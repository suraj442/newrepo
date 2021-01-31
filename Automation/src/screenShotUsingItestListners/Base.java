package screenShotUsingItestListners;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	
	static WebDriver driver;
	public static void  initialization() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	

	
	public void failed(String methodName)
	{
		try
		{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshotsUsingItestListner/"+methodName+".png");
		Files.copy(src, dest);
		}
		
		catch (IOException e) {
			// TODO: handle exception
		}
		
		
		
		
	}

}
