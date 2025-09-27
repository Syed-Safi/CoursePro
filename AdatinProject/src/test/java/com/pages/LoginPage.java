package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[@id='username']")
	private  WebElement userName;
	
	@FindBy(xpath="//input[@id='password']") 
	private  WebElement pass;
	
	@FindBy(xpath = "//input[@id='login']")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public void loginPage(String userName,String password) {

		textType(getUserName(), userName);
		
		textType(getPassword(), password);
		
		baseClick(getLogin()); 
	}
}



