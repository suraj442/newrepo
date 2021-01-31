package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WebElementScreenShot {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// to use the webDriver methods
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement hplogo=driver.findElement(By.id("hplogo"));
		File src = hplogo.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/googleLogo.png");
		Files.copy(src,dest);
		

	}

}
