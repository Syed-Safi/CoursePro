package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotel extends BaseClass {
	public SelectHotel() {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement btn ;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement cont ;
	
	@FindBy(xpath = "//input[@id='cancel']")
	private WebElement canc;

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getCanc() {
		return canc;
	}
	
	public void selectHotel() {
		baseClick(getBtn());
		baseClick(getCont());
	}
}
