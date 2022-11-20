package Assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCandidate  {

	private WebDriver driver;

	public AddCandidate(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(id="sTest-candidateIcon")
	WebElement addCandidateIcon; 
	
	@FindBy(id="sTest-resumeParserBtn")
	WebElement resumeParser;
	
	@FindBy(id="sTest-uploadFilesForResumeParser")
	WebElement uplaodFile;
	
  void AddCandidateIcon() {
	  addCandidateIcon.click();
  }
  
  void ResumeParser() {
	  resumeParser.click();
  }
  
  void UploadFile(String Location) {
	  uplaodFile.sendKeys(Location);
  }

}
