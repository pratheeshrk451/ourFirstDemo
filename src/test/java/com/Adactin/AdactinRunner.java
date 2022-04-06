package com.Adactin;

import java.io.IOException;

import com.baseClass.BaseClass;
import com.pojo.BookAHotelPojo;
import com.pojo.LoginPojo;
import com.pojo.SearchHotelPojo;
import com.properties.FileReadManager;

public class AdactinRunner extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		getDriver("chrome");
		getUrl("https://adactinhotelapp.com/index.php");
		LoginPojo log= new LoginPojo();
		FileReadManager fr = new FileReadManager();
		inputValue(log.getUserName(),FileReadManager.geInstantFRM().getInstanceCR().getName() );
		inputValue(log.getPassword(), FileReadManager.geInstantFRM().getInstanceCR().getPassword());
		click(log.getLogIn());
		sleep(3000);
		
		//search hotel
		SearchHotelPojo sc = new SearchHotelPojo();
		getDropDownSelectByVisibleText(sc.getLocation(),"London");
		getDropDownSelectByVisibleText(sc.getHotel(), "Hotel Creek");
		getDropDownSelectByValue(sc.getHoomType(), "Deluxe");
		getDropDownSelectByIndex(sc.getNoOfRoom(), 1);
		getDropDownSelectByIndex(sc.getAdulutsPerRoom(), 2);
		getDropDownSelectByIndex(sc.getChildPerRoom(), 1);
		click(sc.getSubmit());
		
		//Select hotel
		sleep(2000);
		click(sc.getSelectHotelButton());
		click(sc.getContinueHotel());
		//
		BookAHotelPojo sh = new BookAHotelPojo();
		inputValue(sh.getFirstName(),FileReadManager.geInstantFRM().getInstanceCR().getFirstName());
		inputValue(sh.getLastName(), FileReadManager.geInstantFRM().getInstanceCR().getLastName());
		inputValue(sh.getBillingAdress(), FileReadManager.geInstantFRM().getInstanceCR().getBillingAdress());
		inputValue(sh.getCreditCardNo(), FileReadManager.geInstantFRM().getInstanceCR().creditCardNo());
		getDropDownSelectByVisibleText(sh.getCardType(), "VISA");
		getDropDownSelectByVisibleText(sh.getExpMonth(), "May");
		getDropDownSelectByVisibleText(sh.getExpYear(), "2022");
		inputValue(sh.getCvvNo(), FileReadManager.geInstantFRM().getInstanceCR().cvvNo());
		click(sh.getBtnBook());
		sleep(10000);
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		if(currentUrl.equalsIgnoreCase("https://adactinhotelapp.com/BookingConfirm.php")){
			System.out.println("hotel booked");
		}else{System.out.println("hotel not booked");
			
		}
	}

}
