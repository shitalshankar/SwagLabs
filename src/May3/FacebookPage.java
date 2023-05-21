package May3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookPage {
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='pass']")private WebElement pass;
	@FindBy(xpath="//button[@data-testid='royal_login_button']")private WebElement login;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgot;
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")private WebElement signup;
	@FindBy(xpath="//input[@name='firstname']")private WebElement FirstName;
	
	public FacebookPage (WebDriver driver ) {
		PageFactory.initElements(driver, this);
		
	}
	public void enteremail(String mail) {
		email.sendKeys(mail);
		
	}
	public void enterpassword(String password) {
		pass.sendKeys(password);
	}
	public void clickLogin() {
		login.click();
	}
	public void clickOnSignUp() {
		signup.click();
	}
	public void enterFirstName(String Name, WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofMillis(5000));
		wait.pollingEvery(Duration.ofMillis(1000));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(FirstName));
		
		/*WebDriverWait webwait = new WebDriverWait(driver, Duration.ofSeconds(3));
	webwait.until(ExpectedConditions.visibilityOf(FirstName));*/
		FirstName.sendKeys(Name);
	}
	
	
	

}
