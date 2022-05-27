package spotifypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyLoginPage {
	WebDriver driver;
	public SpotifyLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="login-username")
	WebElement username;
	@FindBy(id="login-password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement loginbtn;
	public SpotifyLoginPage typeEmail(String emailValue) {
      username.sendKeys(emailValue);
      return this;
  }
	public SpotifyLoginPage typePassword(String emailValue) {
	      password.sendKeys(emailValue);
	      return this;
	  }
	public PlayListpage loginButton() {
	      loginbtn.click();;
	      return new PlayListpage();
	  }


}
