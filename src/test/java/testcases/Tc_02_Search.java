package testcases;

import org.testng.annotations.Test;

import page_objects.Loginpage;
import page_objects.SearchHotel;
import reusable.Base;

public class Tc_02_Search extends Base {
	public  SearchHotel sh;
	public  Loginpage lg;
	@Test
	public void SearchHotel() {
		
		lg =new Loginpage(driver);
		lg.setUsername1();
		lg.setPassword1();
		lg.clickLoginButton();
		
		sh=new SearchHotel(driver);
		sh.setLocation();
		sh.setRoomNo();
		sh.setDatePickIn();
		sh.setDatePickOut();
		sh.clickSearchButton();
	}

}
