package testn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Base {
	
	
	static WebDriver driver;
	public static void  initialization()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
	}
	
	public static void failed(String methodName) throws IOException
	{
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/"+methodName+".png");
		Files.copy(src, dest);
		}
		
		
		catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	
	

}
