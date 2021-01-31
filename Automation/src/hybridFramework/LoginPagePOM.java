package hybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	
	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(xpath="//span[contains(.,'invalid')]") private WebElement errMsg;
	
	//utilization 
	public WebElement getUsername() {
		return usn;
	}
	public WebElement getErrMsg() {
		return errMsg;
	}
	public WebElement getPassword() {
		return pass;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	//initialization
	public LoginPagePOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// buisiness logic method
	public void loginProcess(String username,String password) throws InterruptedException
	{
		usn.sendKeys(username);
		Thread.sleep(1000);
		pass.sendKeys(password);
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(2000);
		
		
	
	}
	
	
	
	
	
	
	
	

}
