package methodDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageTest {
	
	//declaration
	@FindBy(linkText="View Time-Track") private WebElement viewLogTimeTrack;
	@FindBy(xpath="//div[.='Tasks')") private WebElement taskLink;
	@FindBy(xpath="//a[@class='content administration']") private WebElement settings;
	
	
	//initialization
	public HomePageTest(WebDriver driver) 
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
