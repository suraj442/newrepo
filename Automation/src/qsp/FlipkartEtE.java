package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlipkartEtE {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(4000);
		
		List<WebElement> ops = driver.findElements(By.xpath("//li[@class='Y5N33s']/div/a/div/following-sibling::div[@class='lrtEPN _17d0yO']"));
		for(WebElement we : ops)
		{
		System.out.println(we.getText());
		
		}
		for(int i=0;i<=ops.size();i++)
		{
			ops.get(i).click();;
			break;
		}
		System.out.println(ops.size());
		Thread.sleep(3000);
		WebElement sel = driver.findElement(By.xpath("//div[@class='_3uDYxP']/select"));
		Select dropdown = new Select(sel);
		dropdown.selectByVisibleText("₹50000");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[.='Processor' and @class='_2gmUFU _3V8rao']/ancestor::section[@class='_167Mu3 _2hbLCH']/descendant::div[@class='_3879cV' and .='Core i3']/preceding-sibling::div")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[.='Brand' and @class='_2gmUFU _3V8rao']/ancestor::section[@class='_167Mu3 _2hbLCH']/descendant::div[@class='_3879cV' and .='Dell']/preceding-sibling::div")).click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/div[.='Operating System']")).click();
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//div[.='Operating System' and @class='_2gmUFU _3V8rao']/ancestor::section[@class='_167Mu3 _2hbLCH']/descendant::div[@class='_3879cV' and .='Windows 10']/preceding-sibling::div")).click();
		
		
		
		
	}

}
