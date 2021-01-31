package methodDrivenFramework;

import javax.sound.sampled.LineListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class ActiTimeLogin {
	
	//declaration
	@FindBy(name="username") private  WebElement un;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginBtn;
	
	
	
	public ActiTimeLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


	public WebElement getUn() {
		return un;
	}


	public WebElement getPsw() {
		return psw;
	}



	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
	
	
	// this constructor is a user defined constructor which instructs the @FindBy  to get the current address of the WebElement even if the browser gets refresh
	
	//initialize the new address of the WebElement
	



	//utilization
	
//	public void setUsername()
//	{
//		un.sendKeys("admin");
//	}
//	
//	public void setpassword()
//	{
//		psw.sendKeys("manager");
//	}
//	
//	
//	public void clickLoginBtn()
//	{
//		loginBtn.click();
//	}
   //Business logic
	public void logInToActiTime(String username,String password) throws InterruptedException
	{
		un.sendKeys(username);
		Thread.sleep(1000);
		psw.sendKeys(password);
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(1000);
		un.clear();
	}
	

	
	
	
	

}
