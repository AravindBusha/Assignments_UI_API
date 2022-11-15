package Assignment5;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
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
 	  WebDriverManager.chromedriver().setup();
 	  driver = new ChromeDriver();
 	  System.out.println("login");
	  driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
	  driver.get("https://dev.recruitcrm.io/");
	  driver.findElement(By.id("sTestEmail")).sendKeys("aravind@recruitcrm.io");
	  driver.findElement(ById.name("password")).sendKeys(pass);
	  driver.findElement(ById.id("sTestLoginBtn")).click();
	  
	  System.out.println("Login Successful");

  }
  
  @Test
 public void VerifyLogin() throws InterruptedException {
	  
	  WebElement companies = driver.findElement(By.id("sTest-companiesIcon"));
	  assertEquals(companies.getText(), "business");
	  TimeUnit.SECONDS.sleep(2);

 }
  
//  @Test
// public void AddCandidates() throws InterruptedException {
//	 
//	  String firstName="aravind";
//	  String lastName="busha";
//	  String email="busha.aravindvce@gmail.com";
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
////	  driver.switchTo().alert().dismiss();
//
//	  
// }
  
  @Test
  public void AddCandidateResumeParser() throws InterruptedException {
	  
	  driver.findElement(By.id("sTest-candidateIcon")).click();
	  System.out.println("Adding Candidates By Resume Praser ");
	  TimeUnit.SECONDS.sleep(5);
	  driver.findElement(By.id("sTest-resumeParserBtn")).click();
	  driver.findElement(By.id("sTest-uploadFilesForResumeParser")).sendKeys("D:\\aravind files\\Aravind_Busha_Resume_4.pdf");
	  TimeUnit.SECONDS.sleep(5);
	  
  }
  
  
  @Test
 public void AddCompany() throws InterruptedException {
	  	  
	  String companyName="commm"; 
	  String website="www.company1.com";
  	  String cFirstName="ryan", cLastName="Copper", cTitle="HR Manager", cContact="7777777777";
  	  String cEmail="ryan@bmw.com";
  	  String Industry="Accounting"; 
	 
	  System.out.println("Adding Company");
	  TimeUnit.SECONDS.sleep(5);
	  driver.findElement(By.id("sTest-companiesIcon")).click();
	  driver.findElement(By.id("sTest-addCompanyBtn")).click();
	  driver.findElement(By.id("sTest-companyNameTxt")).sendKeys(companyName);
	  driver.findElement(By.id("sTest-companyWebsiteTxt")).sendKeys(website);
	  driver.findElement(By.id("sTest-cContactFNameTxt")).sendKeys(cFirstName);
	  driver.findElement(By.id("sTest-cContactLastNameTxt")).sendKeys(cLastName);
	  driver.findElement(By.id("sTest-cContactDesignationTxt")).sendKeys(cEmail);
	  driver.findElement(By.id("sTest-cContactNumberTxt")).sendKeys(cContact);
	  driver.findElement(By.id("sTest-companySubmitBtn")).click();
	 
 }
  
  @Test
 public void Addcontacts() throws InterruptedException {
	 
	  String firstName="aravind";
	  String lastName="busha";
	  String email="busha.aravindvce@gmail.com";
	  String companyName="commm"; 
	  String website="www.company1.com";
	  String contact="9000000000";
	 
	  System.out.println("Adding Contacts ");
	  TimeUnit.SECONDS.sleep(5);
	  driver.findElement(By.id("sTest-contactsIcon")).click();
	  driver.findElement(By.id("sTest-addContactBtn")).click();
	  driver.findElement(By.id("sTest-contactFirstnameTxt")).sendKeys(firstName);
	  driver.findElement(By.id("sTest-contactLastnameTxt")).sendKeys(lastName);
	  driver.findElement(By.id("sTest-contactEmailTxt")).sendKeys(email);
	  driver.findElement(By.id("sTest-contactContactnumberTxt")).sendKeys(contact);
	  driver.findElement(By.id("sTest-contactAddBtn")).click();
 
 }
  
 @Test 
 public void AddJob() throws InterruptedException {
	 
	  String jobTitle="sdet", companyName="recruit crm";
	  
	  System.out.println("Adding Job ");
	  TimeUnit.SECONDS.sleep(5);
	  driver.findElement(By.id("sTest-jobsIcon")).click();
	  TimeUnit.SECONDS.sleep(2);
	  driver.findElement(By.id("sTest-addJobListBtn")).click();
	  driver.findElement(By.id("sTest-jobNameTxt")).sendKeys(jobTitle);
	  driver.findElement(By.id("sTest-companysearchControl")).sendKeys(companyName);
	  
	  TimeUnit.SECONDS.sleep(2);
	  WebElement ele=driver.findElement(By.id("sTest-companysearchControl"));
	  Actions KeyDown = new Actions(driver);
	  KeyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
	  TimeUnit.SECONDS.sleep(1);
	  driver.findElement(By.id("sTest-companyAddBtn")).click();
	 
 }
 
 @Test
 public void Logout() throws InterruptedException {
	 
	  System.out.println("Logout Section ");
	  TimeUnit.SECONDS.sleep(5);
	  driver.findElement(By.id("sTest-dpLinkInAppBtn")).click();
	  driver.findElement(By.id("sTest-signOutInAppBtn")).click();
 }

  
 @AfterTest 
 public void exitBrowser() {
	 
	 driver.quit();
	 
 }
}
