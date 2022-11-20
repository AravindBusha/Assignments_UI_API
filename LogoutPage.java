package Assignment7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {
	
private WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="sTest-dpLinkInAppBtn")
	WebElement profile;
	
	@FindBy(id="sTest-signOutInAppBtn")
	WebElement logout;
	
	public void Profile() throws InterruptedException {
		profile.click();
	}

	public void Logout() {
		logout.click();
	}
}
