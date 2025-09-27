package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookHotalPage extends BaseClass{
	public BookHotalPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Back']")
	private WebElement back ;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement  firstName;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement  lastName;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address ;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement ccNum ;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement ccType ;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement  ccExpMonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement ccExpYear ;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement ccCvv ;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNow ;
	@FindBy(xpath = "//input[@name='cancel']")
	private WebElement canc;
	public WebElement getBack() {
		return back;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getCcExpMonth() {
		return ccExpMonth;
	}
	public WebElement getCcExpYear() {
		return ccExpYear;
	}
	public WebElement getCcCvv() {
		return ccCvv;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	public WebElement getCanc() {
		return canc;
	}
	
	public void bookHotel(String firstName,String lastName,String address,String cardNo,String cardType,String month,String year,String cvvNo) {
		textType(getFirstName(), firstName);
		textType(getLastName(), lastName);
		textType(getAddress(), address);
		textType(getCcNum(), cardNo);
		textType(getCcType(), cardType);
		SelectVisibleText(getCcExpMonth(), month);
		SelectVisibleText(getCcExpYear(), year);
		textType(getCcCvv(), cvvNo);
		baseClick(getBookNow());
		
	}
}







