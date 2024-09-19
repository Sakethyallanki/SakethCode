package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	public WebDriver driver; //remote webDriver
	public  SelectHotel(WebDriver driver) { //Local WebDriver

		this.driver=driver; //amiguity issues	
		PageFactory.initElements(driver, this);	
	}
	@FindBy(id="radiobutton_2")
	WebElement btn1click;

	@FindBy(id="continue")
	WebElement btncontinue;

	public void clickcheckbox() {

		btn1click.click();
	}
	public void btncontinue() {

		btncontinue.click();

	}
	
	

}
