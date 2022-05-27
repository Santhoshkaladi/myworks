package spotifySteps;

import BaseTest.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import spotifypages.SpotifyHomePage;
import spotifypages.SpotifyLoginPage;

public class SpotifySteps extends BaseTest
{

     SpotifyHomePage spotifyHomePage;
     SpotifyLoginPage spotifyLoginPage;
	@Given("i clicked {string}")
	public void i_clicked(String url) {
		driver.navigate().to(url);

		
	    	}

	@Given("i clicked login button")
	public void i_clicked_login_button() {
		spotifyHomePage = new SpotifyHomePage(driver);
		spotifyHomePage.clickLogin();
	    	}

	@When("I enter {string} and {string} in fields")
	public void i_enter_and_in_fields(String email, String password) {
		spotifyLoginPage = new SpotifyLoginPage(driver);
		spotifyLoginPage.typeEmail(email);
		spotifyLoginPage.typePassword(password);
		}

	@Then("I see spotify page")
	public void i_see_spotify_page() {
		spotifyLoginPage.loginButton();
	    
	}

}
