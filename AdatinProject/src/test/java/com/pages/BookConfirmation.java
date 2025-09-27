package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookConfirmation extends BaseClass {
	public BookConfirmation() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement orderNo;

	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement  search;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement  myItinerary;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout;
	
	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}
	
	public WebElement getLogout() {
		return logout;
	}
	
	public void bookConfirm() {
		System.out.println(getAttribute(getOrderNo(), "value"));
	    
	}
}
