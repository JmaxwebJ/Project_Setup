package steps;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.*;
import selenium.methods.SignInMethods;

public class SignInSteps {
	
	
	
	private WebDriver driver;

	public SignInSteps() {
		driver =Hooks.driver;

	}
	

	@Given("User is on login page {string}")
	public void user_is_on_login_page(String url) {
	     
		SignInMethods.launchBrowser(url, driver);
		
	}

	@When("User enter UserName {string}")
	public void user_enter_user_name(String uname) {
	     
		SignInMethods.entersUsername(uname, driver);
	}

	@And("Password {string}")
	public void password(String password) {
		SignInMethods.entersPassword(password, driver);
	     
	}

	@And("Clicks on Login button")
	public void clicks_on_login_button() {
	     
		SignInMethods.clickLogin(driver);
		
	}

	@Then("User should get redirected to profile page")
	public void user_should_get_redirected_to_profile_page() throws InterruptedException {
	     
		SignInMethods.verifyOutput(driver);
	}
	
}
