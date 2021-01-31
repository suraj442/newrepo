package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class SnapUsingEventFiringWebDriver {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// to use the webDriver methods
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		EventFiringWebDriver evf=new EventFiringWebDriver(driver);
		File src = evf.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/snapbyEventFiringWebDriver.png");
		Files.copy(src,dest);
	}

}
