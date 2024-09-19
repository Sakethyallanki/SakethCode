package testcases;



import org.testng.annotations.Test;

import page_objects.Loginpage;
import page_objects.SearchHotel;
import page_objects.SelectHotel;
import reusable.Base;

public class Tc_03_Select extends Base{
	public  SelectHotel sc;
	public  SearchHotel sh;
	public  Loginpage lg;
	
	@Test
	public void Selecthotel() {
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
		
		
		
		sc =new SelectHotel(driver);
		sc.clickcheckbox();
		sc.btncontinue();
		
		
	}

}
