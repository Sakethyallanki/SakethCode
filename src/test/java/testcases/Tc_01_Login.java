package testcases;

import org.testng.annotations.Test;

import page_objects.Loginpage;
import reusable.Base;

public class Tc_01_Login extends Base {
	
	public  Loginpage lg;
	@Test
	public void Loginpage() {
		lg =new Loginpage(driver);
		lg.setUsername1();
		lg.setPassword1();
		lg.clickLoginButton();
		
	}
	

}
