package test;

import io.cucumber.java.en.*;

public class Login {
	
	@Given("User navigates to Login page")
	public void user_navigates_to_login_page() {
	    System.out.println(">>From navigate login oage");
	}

	

	

	@And("Clicks on Login button")
	public void clicks_on_login_button() {
		 System.out.println(">>From Login button");
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		 System.out.println(">>From login successfullys");
	}

	@When("User enters invalid email address {string}")
	public void user_enters_invalid_email_address(String string) {
		 System.out.println(">>From invalid email");
	}
	
	
	@And("Enters invalid password {string}")
	public void enters_invalid_password(String string) {
		 System.out.println(">>From invalid password");
	}

	

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		 System.out.println(">>From warning message");
	}


    @When("^User enters valid email address (.+)$")
    public void user_enters_valid_email_address(String email) {
        
    	System.out.println(">>User enteres emial "+email);
    }

    @And("^Enters valid password (.+)$")
    public void enters_valid_password(String password)  {
        
    	System.out.println(">> user entered password "+ password);
    }


}
