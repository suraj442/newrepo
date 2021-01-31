package handlingtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/HP/Desktop/webpages/table1.html");
		WebElement table1 = driver.findElement(By.id("table1"));
		List<WebElement> alltrs = table1.findElements(By.tagName("tr"));
		System.out.println(" The number of trs present in table 1 : "+alltrs.size());
		
		// the elements present in the specific row
		WebElement table2 = driver.findElement(By.id("table2"));
		WebElement specificTr = table2.findElement(By.xpath("//table[@id='table2']//tr[2]"));
		List<WebElement> alltds = specificTr.findElements(By.tagName("td"));
		String firstTdOfTr = specificTr.findElement(By.tagName("td")).getText();
		System.err.println(firstTdOfTr);
		
		
		for(WebElement we : alltds)
		{
			String allOpsInSpecioficRow = we.getText();
			System.out.println(allOpsInSpecioficRow);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}
