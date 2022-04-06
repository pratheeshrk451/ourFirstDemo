package com.stepDef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClass;
import com.pojo.BookAHotelPojo;
import com.pojo.LoginPojo;
import com.pojo.SearchHotelPojo;
import com.properties.FileReadManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	public SearchHotelPojo sc = new SearchHotelPojo();
	public  BookAHotelPojo sh = new BookAHotelPojo();
	public  FileReadManager fr = new FileReadManager();
public static LoginPojo log= new LoginPojo();
	@Given("User launch the browser")
	public void user_launch_the_browser() throws InterruptedException {
		getDriver("chrome");
	}
	@Given("User enters the url")
	public void user_enters_the_url() throws InterruptedException {
		getUrl("https://adactinhotelapp.com/index.php"); 
		getImplecitWait(3);
	}
	@When("User enters the {string} and {string}")
	public void user_enters_the_and(String s1, String s2) {
		inputValue(log.getUserName(),s1);
		inputValue(log.getUserName(),s2);
	  
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		click(log.getLogIn());
		sleep(3000);
	}
	@Then("User navigate to hotel search page")
	public void user_navigate_to_hotel_search_page() {
		String url = getCurrentUrl();
		System.out.println(url);
	} 
	@When("User select the location and name of the hotel")
	public void user_select_the_location_and_name_of_the_hotel() {
		getDropDownSelectByVisibleText(sc.getLocation(),"London");
		getDropDownSelectByVisibleText(sc.getHotel(), "Hotel Creek");
	}
	@When("User select the roomType and noOfRoom they want")
	public void user_select_the_room_type_and_no_of_room_they_want() {
		getDropDownSelectByValue(sc.getHoomType(), "Deluxe");
		getDropDownSelectByIndex(sc.getNoOfRoom(), 1);
	}
	@When("User select the adult and child counts")
	public void user_select_the_adult_and_child_counts() {
		getDropDownSelectByIndex(sc.getAdulutsPerRoom(), 2);
		getDropDownSelectByIndex(sc.getChildPerRoom(), 1);
	}
	@When("User click the submit button")
	public void user_click_the_submit_button() {
		click(sc.getSubmit());
	}
	@Then("User navigate to hotel selected page")
	public void user_navigate_to_hotel_selected_page() throws InterruptedException {
		String url = getCurrentUrl();
		System.out.println(url);
		sleep(2000);
	}
	@When("User choose the required hotel offers")
	public void user_choose_the_required_hotel_offers() {
		click(sc.getSelectHotelButton());
	}
	@When("User click the continue button")
	public void user_click_the_continue_button() {
		click(sc.getContinueHotel());
	}
	@When("User enter the firstName and lastName")
	public void user_enter_the_first_name_and_last_name() throws IOException {
		inputValue(sh.getFirstName(),FileReadManager.geInstantFRM().getInstanceCR().getFirstName());
		inputValue(sh.getLastName(), FileReadManager.geInstantFRM().getInstanceCR().getLastName());
	}
	@When("User enter the billingAdress and creditCardNumber")
	public void user_enter_the_billing_adress_and_credit_card_number() throws IOException {
		inputValue(sh.getBillingAdress(), FileReadManager.geInstantFRM().getInstanceCR().getBillingAdress());
		inputValue(sh.getCreditCardNo(), FileReadManager.geInstantFRM().getInstanceCR().creditCardNo());
	}
	@When("User select the cardType,cardExpireMonth,cvv and expireDate")
	public void user_select_the_card_type_card_expire_month_and_expire_date() throws IOException {
		getDropDownSelectByVisibleText(sh.getCardType(), "VISA");
		getDropDownSelectByVisibleText(sh.getExpMonth(), "May");
		getDropDownSelectByVisibleText(sh.getExpYear(), "2022");
		inputValue(sh.getCvvNo(), FileReadManager.geInstantFRM().getInstanceCR().cvvNo());
	}
	@When("user click the BOok button")
	public void user_click_the_b_ook_button() {
		click(sh.getBtnBook());
		getImplecitWait(10);
	 	}
	@Then("User booked the hotel")
	public void user_booked_the_hotel() {
		String currentUrl = getCurrentUrl();
		System.out.println(currentUrl);
		if(currentUrl.equalsIgnoreCase("https://adactinhotelapp.com/BookingConfirm.php")){
			System.out.println("hotel booked");
		}else{System.out.println("hotel not booked");
			
		}
	  
	}


}
