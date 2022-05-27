package selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FacebookHomePage {
    WebDriver driver;
    WebDriverWait wait;

    public FacebookHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        if (!driver.getPageSource().contains("Welcome")) {
//            throw new IllegalStateException("we've not logged in to home page!");
//        }
    }

    @FindBy(how = How.CSS, using = "a[href*='profile'] span>span")
    WebElement profileName;

    public String fetchProfileName() {
        return profileName.getText();
    }
}
