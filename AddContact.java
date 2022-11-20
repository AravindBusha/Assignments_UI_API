package Assignment7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContact {
	
	
	private WebDriver driver;

	public AddContact(WebDriver driver) {
		super();
		this.driver = driver;
	}


	@FindBy(id="sTest-contactsIcon")
	WebElement addContactIcon; 
	
	@FindBy(id="sTest-addContactBtn")
	WebElement addContact;
	
	
	@FindBy(id="sTest-contactFirstnameTxt")
	WebElement firstName;
	
	@FindBy(id="sTest-contactLastnameTxt")
	WebElement lastName;
	
	@FindBy(id="sTest-contactEmailTxt")
	WebElement email;
	
	@FindBy(id="sTest-contactContactnumberTxt")
	WebElement contact;
	
	@FindBy(id="sTest-contactAddBtn")
	WebElement contactSubmit;
	
	
	
	
	
  void AddContactIcon() {
	  addContactIcon.click();
  }
  
  void AddNewContact() {
	  addContact.click();
  }
  
  void FirstName(String firstName) {
	  this.firstName.sendKeys(firstName);
  }
  
  void LastName(String lastName) {
	  this.lastName.sendKeys(lastName);
  }
  
  void Email(String email) {
	  this.email.sendKeys(email);
  }
  
  void Contact(String contact) {
	  this.contact.sendKeys(contact);
  }
  
  void ContactSubmit() {
	  contactSubmit.click();
  }


}
