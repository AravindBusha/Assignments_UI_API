package Assignment7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="sTestEmail")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="sTestLoginBtn")
	WebElement submit;
	
	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}

	public void enterPassword(String Password) {
		password.sendKeys(Password);
	}
//	
	public void submitButton() {
		submit.click();
	}
	

}
