package screenshotusingtestng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	
	static WebDriver driver;
	public static void initialize()
	{
		System.setProperty("webdrievr.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://laptop-smc8hiai/login.do");
	}
	
	
	public void failed(String methodName)
	{
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./TestNGScreenShots/"+methodName+".png");
		Files.copy(src, dest);
		}
		
		catch (IOException e) {
			// TODO: handle exception
		}
	}
	

}
