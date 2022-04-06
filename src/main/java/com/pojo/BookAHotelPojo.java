package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class BookAHotelPojo extends BaseClass {
	public BookAHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement FirstName;
	@FindBy(id="last_name")
	private WebElement LastName;
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getBillingAdress() {
		return BillingAdress;
	}
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	public WebElement getCardType() {
		return CardType;
	}
	public WebElement getExpMonth() {
		return ExpMonth;
	}
	public WebElement getExpYear() {
		return ExpYear;
	}
	public WebElement getCvvNo() {
		return CvvNo;
	}
	public WebElement getBtnBook() {
		return BtnBook;
	}
	@FindBy(id="address")
	private WebElement BillingAdress;
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	@FindBy(id="cc_type")
	private WebElement CardType;
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	@FindBy(id="cc_exp_year")
	private WebElement ExpYear;
	@FindBy(id="cc_cvv")
	private WebElement CvvNo;
	@FindBy(id="book_now")
	private WebElement BtnBook;
}
