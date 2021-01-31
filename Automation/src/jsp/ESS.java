package jsp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ESS {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(4000);
		WebElement ele = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		File src1 = ele.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./data/flipkart.png");
		Files.copy(src1,dest1);
		
		
		
	}

}
