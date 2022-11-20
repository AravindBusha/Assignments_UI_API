/*
  if not works then run for multiple times , you can get   

 */


package Assignment7;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.scenarios.AbstractChromeWebDriverTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCrmAddCandidatesCompaniesContactsLogoutUsingTestNG {
	
	 ChromeDriver driver;
	
  @BeforeTest
  public void LoginToRCRM() throws InterruptedException{
	  

	  String pass="Aravind@#1411";
	  String username="aravind@recruitcrm.io";
 	  WebDriverManager.chromedriver().setup();
 	  driver = new ChromeDriver();
 	  driver.manage().window().maximize();
 	  System.out.println("login");
 	  
	  driver.get("https://dev.recruitcrm.io/");
	  
	  
	  WebDriverWait webDriverWait = new WebDriverWait(driver,15);
	  webDriverWait.withMessage("waited for 10 sec , but ele not found");
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTestEmail"))));

	  
	  LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class); // this pagefactory not only create class for LoginPage, but also it
//	  map the eamil wtih emailobject, password with passwordObject etc.

	  loginPage.enterEmail(username);
	  loginPage.enterPassword(pass);
	  loginPage.submitButton();
	  
	  System.out.println("Login Successful");

  }
  

  
//  @Test
// public void AddCandidates() throws InterruptedException {
//	 
//	  String firstName="aravind";
//	  String lastName="busha";
//	  String email="busha.aravindvce@gmail.com";
//	  
//	  WebDriverWait webDriverWait = new WebDriverWait(driver,10);
//	  webDriverWait.withMessage("waited for 10 sec , but ele not found");
//	  webDriverWait.until( ExpectedConditions.visibilityOfElementLocated((By.id("sTest-candidateIcon"))));
//
//	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-candidateIcon"))));
//	 
//	  driver.findElement(By.id("sTest-candidateIcon")).click();
//	  System.out.println("Adding Candidates ");
//	  TimeUnit.SECONDS.sleep(5);
//	  driver.findElement(By.id("sTest-addCandidateBtn")).click();
//	  driver.findElement(By.name("firstname")).sendKeys(firstName);
////	  driver.findElement(By.id("sTest-candidateLastName")).sendKeys(lastName);
//	  driver.findElement(By.cssSelector("#sTest-candidateLastName")).sendKeys(lastName);
////	  driver.findElement(By.id("sTest-candidateEmail")).sendKeys(email);
//	  driver.findElement(By.xpath("//*[@id=\"sTest-candidateEmail\"]")).sendKeys(email);
//
//	  driver.findElement(By.id("sTest-candidateAddBtn")).click();
////	  TimeUnit.SECONDS.sleep(1);
////	  driver.switchTo().alert().dismiss();
//	  
//	  
//	  
// }
  
  
  @Test
  public void AddCandidateResumeParser() throws InterruptedException {
	  
	  
	  String Location = "D:\\aravind files\\Aravind_Busha_Resume_4.pdf";
	  
	  TimeUnit.SECONDS.sleep(5);

	  WebDriverWait webDriverWait = new WebDriverWait(driver,10);
	  webDriverWait.withMessage("waited for 10 sec , but ele not found");
	  webDriverWait.until( ExpectedConditions.visibilityOfElementLocated((By.id("sTest-candidateIcon"))));

	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-candidateIcon"))));
	  
	  AddCandidate candidate = PageFactory.initElements(driver, AddCandidate.class);
	  
	  System.out.println("Adding Candidates By Resume Praser ");
	  

	  candidate.AddCandidateIcon();
	  
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-resumeParserBtn"))));
	  candidate.ResumeParser();
	  candidate.UploadFile(Location);
	  
  }
  
  
  @Test
 public void AddCompany() throws InterruptedException {
	  	  
	  String companyName="commm"; 
	  String website="www.company1.com";
  	  String cFirstName="ryan", cLastName="Copper", cTitle="HR Manager", cContact="7777777777";
  	  String cEmail="ryan@bmw.com";
  	  String Industry="Accounting"; 
  	  
  	  WebDriverWait webDriverWait = new WebDriverWait(driver,10);
	  webDriverWait.withMessage("waited for 10 sec , but ele not found");
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-companiesIcon"))));
	  
	  AddCompany company = PageFactory.initElements(driver, AddCompany.class);
	 
	  System.out.println("Adding Company");
	  TimeUnit.SECONDS.sleep(5);
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-companiesIcon"))));
	  company.AddCompanyIcon();
	  company.AddNewCompany();
	  company.CompanyName(companyName);
	  company.Website(website);
	  company.CFirstname(cFirstName);
	  company.CLastname(cLastName);
	  company.CTitle(cTitle);
	  company.CContact(cContact);
	  company.CompanySubmit();
 }
  
  @Test
 public void Addcontacts() throws InterruptedException {
	 
	  String firstName="aravind";
	  String lastName="busha";
	  String email="busha.aravindvce@gmail.com";
	  String companyName="commm"; 
	  String website="www.company1.com";
	  String ccontact="9000000000";
	  
	  TimeUnit.SECONDS.sleep(5);
  	  WebDriverWait webDriverWait = new WebDriverWait(driver,10);
	  webDriverWait.withMessage("waited for 10 sec , but ele not found");
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-contactsIcon"))));
	  
	  AddContact contact = PageFactory.initElements(driver, AddContact.class);
	  
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-contactsIcon"))));
	  System.out.println("Adding Contacts ");

	  contact.AddContactIcon();
	  
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-addContactBtn"))));
	  contact.AddNewContact();
	  contact.FirstName(firstName);
	  contact.LastName(lastName);
	  contact.Email(email);
	  contact.Contact(ccontact);
	  contact.ContactSubmit();
 
 }
  
 @Test 
 public void AddJob() throws InterruptedException {
	 
	  String jobName="sdet", companyName="recruit crm";
	  
	  System.out.println("Adding Job ");
	  TimeUnit.SECONDS.sleep(5);
	  
	  WebDriverWait webDriverWait = new WebDriverWait(driver,10);
	  webDriverWait.withMessage("waited for 10 sec , but ele not found");
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-jobsIcon"))));
	  
	  AddJob job = PageFactory.initElements(driver, AddJob.class);
	  
	  
	  job.AddJobIcon();
	  job.AddNewJob();
	  job.JobName(jobName);
	  job.Company(companyName);
	  job.JobSubmit();
	 
 }
 
 @Test
 public void CustomFieldsForCandidates () throws InterruptedException {
	 
	 
	  System.out.println("Adding Custom Fields for Candidates ");
	  TimeUnit.SECONDS.sleep(5);
	  
	  WebDriverWait webDriverWait = new WebDriverWait(driver,10);
	  webDriverWait.withMessage("waited for 10 sec , but ele not found");
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-adminSettingIcon"))));
	  
	  AddCustomFieldsForCandidates customField = PageFactory.initElements(driver, AddCustomFieldsForCandidates.class);
	  
	  customField.Adminsetting();
	  customField.CandidateFields();
	  TimeUnit.SECONDS.sleep(3);
	  customField.NewCustomField();
	  customField.AddTextField();
	  customField.AddLongText();
	  customField.AddDate();
	  customField.AddNumber();
	  customField.AddCheckBox();
	  customField.AddDropDown();
	  customField.AddMutilselect();
	  customField.AddPhoneNumber();	  
	  customField.AddEmail();
	  customField.AddFile();
	  System.out.println("no error");
	 
 }
 
 @AfterTest
 public void Logout() throws InterruptedException {
	 
	  System.out.println("Logout Section ");
	  System.out.println("-----------------");
	  
	  WebDriverWait webDriverWait = new WebDriverWait(driver,15);
	  webDriverWait.withMessage("waited for 10 sec , but ele not found");
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-dpLinkInAppBtn")))); //visibilityOfElementLocated  
	  
	  LogoutPage job = PageFactory.initElements(driver, LogoutPage.class);

	  TimeUnit.SECONDS.sleep(5);
	  webDriverWait.until( ExpectedConditions.visibilityOfElementLocated((By.id("sTest-dpLinkInAppBtn")))); //visibilityOfElementLocated   

	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-dpLinkInAppBtn")))); //visibilityOfElementLocated   

	  job.Profile();
	  webDriverWait.until( ExpectedConditions.elementToBeClickable((By.id("sTest-signOutInAppBtn")))); //visibilityOfElementLocated 

	  job.Logout();

	  driver.quit();

 }
}
