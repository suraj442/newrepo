package hybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOM {
	//declaration
		@FindBy(linkText="View Time-Track") private WebElement viewLogTimeTrack;
		@FindBy(xpath="//div[.='Tasks')") private WebElement taskLink;
		@FindBy(xpath="//a[@class='content administration']") private WebElement settings;
		@FindBy(name="firstHierarchyLevelCode")private WebElement dropdown1;
		@FindBy(name="secondHierarchyLevelCode")private WebElement dropdown2;
		
		
		
		public WebElement getDropdown1() {
			return dropdown1;
		}
		public WebElement getDropdown2() {
			return dropdown1;
		}

		//initialization
		public HomePagePOM(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);
		}

		public WebElement getViewLogTimeTrack() {
			return viewLogTimeTrack;
		}

		public WebElement getTaskLink() {
			return taskLink;
		}

		public WebElement getSettings() {
			return settings;
		}
		
		
		public void clickSetting()
		{
			settings.click();
		}

	
		
}
