package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver; //remote webDriver
	public Loginpage(WebDriver driver) { //Local WebDriver

		this.driver=driver; //amiguity issues	
		PageFactory.initElements(driver, this);	
	}

	//2.identify the web elements

	@FindBy(id="username")
	WebElement txtUsername;

	@FindBy(id="password")
	WebElement txtPassword;

	@FindBy(id="login")
	WebElement btnLogin;



	//3.Create the actions

	public void setUsername1() {

		txtUsername.sendKeys("Venkat1997");  
	}
	
	public void setPassword1() {
		txtPassword.sendKeys("73A35C");
	}
	
	public void clickLoginButton() {
		
		btnLogin.click();
	}




}
