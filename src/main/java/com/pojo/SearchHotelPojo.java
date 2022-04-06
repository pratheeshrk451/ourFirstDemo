package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class SearchHotelPojo extends BaseClass{
	public SearchHotelPojo(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement Location;
	@FindBy(id="hotels")
	private WebElement Hotel;
	@FindBy(id="room_type")
	private WebElement HoomType;
	@FindBy(id="Submit")
	private WebElement Submit;
	@FindBy(id="radiobutton_0")
	private WebElement SelectHotelButton;
	@FindBy(id="continue")
	private WebElement ContinueHotel;
	
	public WebElement getSelectHotelButton() {
		return SelectHotelButton;
	}
	
	public WebElement getContinueHotel() {
		return ContinueHotel;
	}
	
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getLocation() {
		return Location;
	}
	public WebElement getHotel() {
		return Hotel;
	}
	public WebElement getHoomType() {
		return HoomType;
	}
	public WebElement getNoOfRoom() {
		return NoOfRoom;
	}
	public WebElement getAdulutsPerRoom() {
		return AdulutsPerRoom;
	}
	public WebElement getChildPerRoom() {
		return ChildPerRoom;
	}
	@FindBy(id="room_nos")
	private WebElement NoOfRoom;
	@FindBy(id="adult_room")
	private WebElement AdulutsPerRoom;
	@FindBy(id="child_room")
	private WebElement ChildPerRoom;
}
