package stepdefinition;

import BaseTest.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.pages.FacebookLoginPage;

public class FacebookLoginSteps extends BaseTest {

    FacebookLoginPage facebookLoginPage;
    @Given("I/user navigate(s) to {string}")
    public void iNavigateTo(String url) {
       driver.navigate().to(url);
    }

    @Given("facebook page is open")
    public void facebookPageIsOpen() {
        facebookLoginPage= new FacebookLoginPage(driver);
    }

    @When("I enter {string} and {string} in email and password fields")
    public void iEnterAndInEmailAndPasswordFields(String username, String password) {
        facebookLoginPage.typeEmail(username);
        facebookLoginPage.typePassword(password);
    }

    @Then("I want to see my profile page")
    public void iWantToSeeMyProfilePage() {
        facebookLoginPage.clickLogin();
    }
}
