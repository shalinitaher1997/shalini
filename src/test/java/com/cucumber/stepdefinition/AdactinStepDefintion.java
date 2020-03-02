package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.cucumber.base.BaseClass;
import com.cucumber.helper.PageObjectManager;
import com.cucumber.runner.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AdactinStepDefintion extends BaseClass {

	public static WebDriver driver = AdactinRunner.driver;
	public static PageObjectManager pom=new PageObjectManager(driver);

	@Given("User launch the adactin application")
	public void user_launch_the_adactin_application() {
		getUrl("https://adactin.com/HotelApp/");
	}

	@When("User enter the username")
	public void user_enter_the_username() {
		inputElement(pom.getLogin().getUsername(), "shalinitaher1997");
	}

	@When("User enter the password")
	public void user_enter_the_password() {
		inputElement(pom.getLogin().getPassword(), "asdfghjkl97");
	}

	@Then("User click on the login button")
	public void user_click_on_the_login_button() {
		clickElement(pom.getLogin().getLoginButton());
	}

	@When("User selects location")
	public void user_selects_location() {
		//selectOptions(pom.getSearchHotel().getLocation(), "London", "byvalue");
		selectOptions(pom.getSearchHotel().getLocation(), "London", "byValue");
	}

	@When("User selects hotel")
	public void user_selects_hotel() {
		selectOptions(pom.getSearchHotel().getHotels(), "Hotel Sunshine", "byvalue");
	}

	@When("User selects room type")
	public void user_selects_room_type() {
		selectOptions(pom.getSearchHotel().getRoomType(), "Deluxe", "byvalue");
	}

	@When("User selects number of rooms")
	public void user_selects_number_of_rooms() {
		selectOptions(pom.getSearchHotel().getRooms(), "2", "byvalue");
	}

	@When("User enters checkin date")
	public void user_enters_checkin_date() {
		inputElement(pom.getSearchHotel().getCheckin(), "18/06/2020");
	}

	@When("User enters checkout date")
	public void user_enters_checkout_date() {
		inputElement(pom.getSearchHotel().getCheckout(), "19/06/2020");
	}

	@When("User selects number of adults")
	public void user_selects_number_of_adults() {
		selectOptions(pom.getSearchHotel().getAdults(), "2", "byvalue");
	}

	@When("User selects number of children")
	public void user_selects_number_of_children() {
		selectOptions(pom.getSearchHotel().getChildren(), "1", "byvalue");
	}

	@Then("User click on the search button")
	public void user_click_on_the_search_button() {
		clickElement(pom.getSearchHotel().getSubmit());
	}

	@When("User selects hotel from available hotels")
	public void user_selects_hotel_from_available_hotels() {
		clickElement(pom.getSelectHotel().getSelectRadio());
	}

	@Then("User click on continue button")
	public void user_click_on_continue_button() {
		clickElement(pom.getSelectHotel().getcontinueButton());
	}

	@When("User enter first name")
	public void user_enter_first_name() {
		inputElement(pom.getPersonalInfo().getFirstname(), "shalini");
	}

	@When("User enter last name")
	public void user_enter_last_name() {
		inputElement(pom.getPersonalInfo().getLastname(), "taher");
	}

	@When("User enter billing address")
	public void user_enter_billing_address() {
		inputElement(pom.getPersonalInfo().getAddress(), "18 new street new york 123456");
	}

	@When("User enter credit card number")
	public void user_enter_credit_card_number() {
		inputElement(pom.getPersonalInfo().getCcnumber(), "1234567890098765");
	}

	@When("User selects credit card type")
	public void user_selects_credit_card_type() {
		selectOptions(pom.getPersonalInfo().getCctype(), "VISA", "byvalue");
	}

	@When("User selects expiry month of card")
	public void user_selects_expiry_month_of_card() {
		selectOptions(pom.getPersonalInfo().getCcexpmonth(), "5", "byvalue");
	}

	@When("User selects expiry year of card")
	public void user_selects_expiry_year_of_card() {
		selectOptions(pom.getPersonalInfo().getCcexpyear(), "2022", "byvalue");
	}

	@When("User enter cvv number")
	public void user_enter_cvv_number() {
		inputElement(pom.getPersonalInfo().getCvv(), "123");
	}

	@Then("User click on book now button")
	public void user_click_on_book_now_button() {
		clickElement(pom.getPersonalInfo().getBook());
	}

	@Then("User click on booked itinerary link")
	public void user_click_on_booked_itinerary_link() {
		clickElement(pom.getItinerary().getItinerary());
	}

	@Then("User click on logout button")
	public void User_click_on_logout_button() {
		clickElement(pom.getLogout().getLogout());
	}



}
