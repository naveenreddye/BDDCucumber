package test;

import io.cucumber.java.en.*;

public class Register {

	
	@Given("User navigate to login page")
	public void user_navigate_to_login_page() {
	    System.out.println(">>USer navigate to login page");
	}

	@When("Enters First name {string} and last name {string}")
	public void enters_first_name_and_last_name(String string, String string2) {
	    System.out.println(">>Enter firsta nd last name");
	}

	@And("User enters Email {string} and Telephone number {string}")
	public void user_enters_email_and_telephone_number(String string, String string2) {
	  System.out.println(">>enter telephone and email");
	}

	@And("User enters password and Confirm password {string}")
	public void user_enters_password_and_confirm_password(String string) {
		System.out.println(">>password and confirm password");
	}

	@Then("User login details should and access acount details")
	public void user_login_details_should_and_access_acount_details() {
		System.out.println(">>Access login details");
	}

	@And("Select News Letter subsribe as Yes")
	public void select_news_letter_subsribe_as_yes() {
		System.out.println(">>Subscribe as yes");
	}

	@And("Click Continue button")
	public void click_continue_button() {
		System.out.println(">> Click button as yes");
	}
}
