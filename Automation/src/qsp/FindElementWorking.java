package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementWorking {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement textbox = driver.findElement(By.xpath("//input[@title='Search']"));
		textbox.sendKeys("qspider");
		Thread.sleep(5000);
//		String tag = textbox.getAttribute("class");
//		String tag2= textbox.getAttribute("name");
//		System.out.println(tag);
//		System.out.println(tag2);
//		String valuecss = textbox.getCssValue("margin-top");
//		System.out.println(valuecss);
//		Point location1 = textbox.getLocation();
//		int a = location1.getX();
//		int b = location1.getY();
//		
//		System.out.println(a);
//		System.out.println(b);
//		Rectangle rect1 = textbox.getRect();
//	    int h1 = rect1.getHeight();
		
//		int w1 = rect1.getWidth();
//		System.out.println(h1);
//		System.out.println(w1);
//		
//		String tagname1 = textbox.getTagName();
//		System.out.println(tagname1);
		
		
//		boolean ch = textbox.isDisplayed();
//		System.out.println(ch);
//		
		
		
		
		
		
		
	

		

	}

}


