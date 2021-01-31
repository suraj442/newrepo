package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsWorking {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
// handling the multiple webElements
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		
		List<WebElement> listoflanguages = driver.findElements(By.xpath("//th[.='Language']/ancestor::table[@class='datat']/tbody/tr/td[@data-label='Language']"));
//        //using for each loop
//		for(WebElement we:listoflanguages)
//		{
//			
//			System.out.println(we.getText());
//		}
		
		//handling the multiple webelements using fo loop
		for(int s=0;s<=listoflanguages.size()-1;s++)
		{
			String data = listoflanguages.get(s).getText();
			System.out.println(data);
		}
		
		
		
}
}



