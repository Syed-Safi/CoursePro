package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass{
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement  location;
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement  hotel;
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement  roomType;
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement  roomNum;
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement datePickIn ;
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement datepPickOut ;
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultRoom ;
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childRoom ;
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement  search;
	@FindBy(xpath = "//input[@id='Reset']")
	private WebElement  reset;
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoomNum() {
		return roomNum;
	}
	public WebElement getDatePickIn() {
		return datePickIn;
	}
	public WebElement getDatepPickOut() {
		return datepPickOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getReset() {
		return reset;
	}
	public void hotalPage(int locat,int hotel,int roomType,int noOfRoom, String checkIn,String checkOut, int adultRoom,int childRoom  ) {
		SelectByIndex(getLocation(), locat);
		SelectByIndex(getHotels(), hotel);
		SelectByIndex(getRoomType(), roomType);
		SelectByIndex(getRoomNum(), noOfRoom);
		textType(getDatePickIn(), checkIn);
		textType(getDatepPickOut(), checkOut);
		SelectByIndex(getAdultRoom(), adultRoom);
		SelectByIndex(getChildRoom(), childRoom);
		baseClick(getSearch());
	}
}









