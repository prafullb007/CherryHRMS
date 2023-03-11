package StepDefinitions;
import PageObject.LoginPage;
import PageObject.LogoutPage;
import TestRunner.BaseClass;
import io.cucumber.java.en.*;
public class LoginSteps {
	@Given("User lauch browser")
	public void user_lauch_browser() {
		BaseClass.openapplication();
	}

	@Given("User enters url {string}")
	public void user_enters_url(String hurl) {
		BaseClass.enterurl(hurl);
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String uname, String upswrd) {
	  LoginPage.login(uname, upswrd);
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	   
	}

	@Then("User get home page")
	public void user_get_home_page() {
	   
	}
	@Then("User clicks on log out button")
	public void user_clicks_on_log_out_button() {
	    LogoutPage.logout();
	}
	@Then("User closes the browser")
	public void user_closes_the_browser() {
		BaseClass.closeapplication();
	}


}
