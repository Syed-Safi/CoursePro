package com.step;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step extends BaseClass {
	WebDriver driver;

	@Given("the user is logged in to adactin hotel webpage")
	public void the_user_is_logged_in_to_adactin_hotel_webpage() {

		launch("https://adactinhotelapp.com/");
		maxmizeWindow();
		setImplicitWait(70);
		textType("username", "nochange");
		textType("password", "nochange007");
		baseClick("login");

	}

	@When("the user select the Location {string}")
	public void the_user_select_the_location(String location) {
		SelectVisibleText("location", location);
	}

	@When("the user select the Hotels {string}")
	public void the_user_select_the_hotels(String hotel) {
		SelectVisibleText("hotels", hotel);
	}

	@When("the user select the RoomType {string}")
	public void the_user_select_the_room_type(String roomType) {
		SelectVisibleText("room_type", roomType);
	}

	@When("the user select the NumberofRoom {string}")
	public void the_user_select_the_numberof_room(String noRoom) {
		SelectVisibleText("room_nos", noRoom);
	}

	@When("the user enter the check in date {string}")
	public void the_user_enter_the_check_in_date(String checkIn) {
		clearText("datepick_in");
		textType("datepick_in", checkIn);
	}

	@When("the user enter the check out date {string}")
	public void the_user_enter_the_check_out_date(String checkOut) {
		clearText("datepick_out");
		textType("datepick_out", checkOut);
	}

	@When("the user select the Adults per room {string}")
	public void the_user_select_the_adults_per_room(String adultRoom) {
		SelectVisibleText("adult_room", adultRoom);
	}

	@When("the user select the children per room {string}")
	public void the_user_select_the_children_per_room(String childRoom) {
		SelectVisibleText("child_room", childRoom);
	}

	@When("the user clicks on search")
	public void the_user_clicks_on_search() {
		baseClick("Submit");
	}

	@Then("the hotels details should be displayed {string}")
	public void the_hotels_details_should_be_displayed(String expected) {
		String textData = textData("login_title");
		Assert.assertEquals(expected, textData);
	}

	@Then("the hotels with  Mandatory details  should be displayed {string}")
	public void the_hotels_with_mandatory_details_should_be_displayed(String expected) {
		String textData = textData("login_title");
		Assert.assertEquals(expected, textData);
	}

}
