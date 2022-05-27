package spotifypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpotifyHomePage {
	WebDriver driver;

	public SpotifyHomePage(WebDriver driver) {
     this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[@id=\"__next\"]/div[1]/header/div/nav/ul/li[6]/a")
	 WebElement loginbtn;
	public SpotifyLoginPage clickLogin() {
        loginbtn.click();
        return new SpotifyLoginPage(driver);
    }

}
