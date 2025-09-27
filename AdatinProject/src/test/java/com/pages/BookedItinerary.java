package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookedItinerary extends BaseClass {
	public BookedItinerary() {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@id='order_id_text']")
	private WebElement searchOrder ;
	@FindBy(xpath = "//input[@id='search_hotel_id']")
	private WebElement searchBtn ;
	@FindBy(xpath = "//input[@value='1313412']")
	private WebElement  orderSelect;
	@FindBy(xpath = "//input[@id='btn_id_1313412']")
	private WebElement  cancelOrder;
	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement  cancelAll;
	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement  searchHotel;
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout ;
	
	public WebElement getSearchOrder() {
		return searchOrder;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getOrderSelect() {
		return orderSelect;
	}
	public WebElement getCancelOrder() {
		return cancelOrder;
	}
	public WebElement getCancelAll() {
		return cancelAll;
	}
	public WebElement getSearchHotel() {
		return searchHotel;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	
}





