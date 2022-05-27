package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLoginPage {
    WebDriver driver;
     WebDriverWait wait;
    public FacebookLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[data-testid='open-registration-form-button']")));
           }

    By email = By.id("email");
    By password = By.id("pass");
    By login = By.name("login");
    @FindAll({@FindBy(id = "email"), @FindBy(name = "email")})//OR condition
    WebElement txtEmail;
    @FindBys({@FindBy(id = "email"),@FindBy(xpath = "//input[@type='text']") })//AND condition
    WebElement txtEmail1;

    @FindBy(css="[data-testid='open-registration-form-button']")
    WebElement createAccountBtn;

    public FacebookLoginPage typeEmail(String emailValue) {
//        driver.findElement(email).sendKeys(emailValue);
        txtEmail1.sendKeys(emailValue);
        return this;
    }

    public FacebookLoginPage typePassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
        return this;
    }

    public FacebookHomePage
    clickLogin() {
        driver.findElement(login).click();
        return new FacebookHomePage(driver);
    }
    public CreateAccountPage clickCreateAccount()
    {
        createAccountBtn.click();
        return new CreateAccountPage(driver);
    }
}
