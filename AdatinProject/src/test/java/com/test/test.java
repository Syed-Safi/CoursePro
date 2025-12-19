package com.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.base.BaseClass;
import com.pages.BookConfirmation;
import com.pages.BookHotalPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotel;


public class test extends BaseClass {
	
	@BeforeClass
	public static void beforeTest() {
		launch("https://adactinhotelapp.com/index.php");
	}
	
	@Test
	public void hotelPage() {
		setImplicitWait(20);
		LoginPage log=new LoginPage();
		log.loginPage("nochange", "QVF164");
		SearchHotelPage hotelPage= new SearchHotelPage();
		hotelPage.hotalPage(2, 3, 3, 4,"05/06/2025", "07/07/2025", 2, 2);
		SelectHotel selectHotel=new SelectHotel();
		selectHotel.selectHotel();
		BookHotalPage bookPage = new BookHotalPage();
		bookPage.bookHotel("no", "change","trichy" ,"5678786543456788","VISA", "June", "2027", "2000");
		BookConfirmation bookCom=new BookConfirmation();
		bookCom.bookConfirm();
	}
}
