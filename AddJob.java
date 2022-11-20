package Assignment7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddJob {
	
	private WebDriver driver;

	public AddJob(WebDriver driver) {
		super();
		this.driver = driver;
	}


	@FindBy(id="sTest-jobsIcon")
	WebElement addJobIcon; 
	
	@FindBy(id="sTest-addJobListBtn")
	WebElement addNewJob;
	
	
	@FindBy(id="sTest-jobNameTxt")
	WebElement jobName;
	
	@FindBy(id="sTest-companysearchControl")
	WebElement company;
	
	@FindBy(id="sTest-companyAddBtn")
	WebElement jobSubmit;
	
	
	
	
	
  void AddJobIcon() throws InterruptedException {
	  addJobIcon.click();
	  TimeUnit.SECONDS.sleep(2);

  }
  
  void AddNewJob() {
	  addNewJob.click();
  }
  
  void JobName(String jobName) {
	  this.jobName.sendKeys(jobName);
  }
  
  void Company(String company) throws InterruptedException {
	  this.company.sendKeys(company);
	  TimeUnit.SECONDS.sleep(2);
	  Actions KeyDown = new Actions(driver);
	  KeyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
	  TimeUnit.SECONDS.sleep(1);

  }
  
  void JobSubmit() {
	  jobSubmit.click();
  }

	
	
}
