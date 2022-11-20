package Assignment7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddCustomFieldsForCandidates {
	
	private WebDriver driver;

	public AddCustomFieldsForCandidates(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="sTest-adminSettingIcon")
	WebElement adminsetting;
	
	@FindBy(id="sTest-customCandidateIconAdminSettings")
	WebElement candidateFields;
	
	@FindBy(id="sTest-addFieldBtn")
	WebElement newCustomField;
	
	@FindBy(name="custumField0")
	WebElement name0;
	
	@FindBy(name="custumField1") 
	WebElement name1;
	
	@FindBy(name="custumField2") 
	WebElement name2;
	
	@FindBy(name="custumField3") 
	WebElement name3;
	
	@FindBy(name="custumField4") 
	WebElement name4;
	
	@FindBy(name="custumField5") 
	WebElement name5;
	
	@FindBy(name="custumField6") 
	WebElement name6;
	
	@FindBy(name="custumField7") 
	WebElement name7;
	
	@FindBy(name="custumField8") 
	WebElement name8;
	
	@FindBy(name="custumField9") 
	WebElement name9;
	
	
	
	@FindBy(id="sTest-enabled")
	WebElement fieldType;
	
	@FindBy(id="sTest-saveCustomBtn")
	WebElement save;
	
	@FindBy(name="dropddown_value5")
	WebElement dropdown;
	
	@FindBy(name="dropddown_value6")
	WebElement multiselect;
	
	
	
	public void Adminsetting(){
		adminsetting.click();
	}

	public void CandidateFields() {
		candidateFields.click();
	}
	
	public void NewCustomField() {
		newCustomField.click();
	}

	public void AddTextField() throws InterruptedException {
		name0.sendKeys("Father Name");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(0);
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	public void AddLongText() throws InterruptedException {
		name1.sendKeys("Research Papers");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(1);
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	public void AddDate() throws InterruptedException {
		name2.sendKeys("Expected Date of Joining");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(2);
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	public void AddNumber() throws InterruptedException {
		name3.sendKeys("PAN Number");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(3);
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	public void AddCheckBox() throws InterruptedException {
		name4.sendKeys("Learned Technologies");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(4);
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	public void AddDropDown() throws InterruptedException {
		name5.sendKeys("Highest Graduation");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(5);
		dropdown.sendKeys("Graduation,Post-Graduation");
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	public void AddMutilselect() throws InterruptedException {
		name6.sendKeys("Known Technologies");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(6);
		multiselect.sendKeys("web-development , Android-dev");
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	public void AddPhoneNumber() throws InterruptedException {
		name7.sendKeys("Alternate Phone Number ");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(7);
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	
	public void AddEmail() throws InterruptedException {
		name8.sendKeys("Alternate Email-id ");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(8);
		save.click();
		TimeUnit.SECONDS.sleep(3);
		newCustomField.click();

	}
	public void AddFile() throws InterruptedException {
		name9.sendKeys("Certifications ");
		Select s3 = new Select(fieldType);
		s3.selectByIndex(9);
		save.click();

	}

}

