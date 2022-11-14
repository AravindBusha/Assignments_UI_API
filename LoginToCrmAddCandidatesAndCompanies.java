import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToCrmAddCandidatesAndCompanies {
	static ChromeDriver driver;
	static String pass="Aravind@#1411";


	public static void main(String[] args) throws InterruptedException {
		
		 	  WebDriverManager.chromedriver().setup();
		 	  driver = new ChromeDriver();
			  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;

			  LoginToRcrm();
			  System.out.println("Login successful");
			  
			  AddCandidates();
			  System.out.println("added candidates");
			  
			  AddCompanies();
			  System.out.println("added companies");
			  
			  System.out.println("all tasks completed");
			  driver.quit();

	}
	

	public static void LoginToRcrm() {

		  driver.get("https://app.recruitcrm.io/");
		  driver.findElement(By.id("sTestEmail")).sendKeys("aravind@recruitcrm.io");
		  driver.findElement(ById.name("password")).sendKeys(pass);
		  driver.findElement(ById.id("sTestLoginBtn")).click();
		
	}
	
	
	public  static void AddCandidates() throws InterruptedException {

		  String firstName="aravind";
		  String lastName="busha";
		  String email="busha.aravindvce@gmail.com";
		 
		  driver.findElement(By.id("sTest-candidateIcon")).click();
		  System.out.println("waiting for 5 sec");
		  TimeUnit.SECONDS.sleep(5);
		  driver.findElement(By.id("sTest-addCandidateBtn")).click();
		  driver.findElement(By.name("firstname")).sendKeys(firstName);
//		  driver.findElement(By.id("sTest-candidateLastName")).sendKeys(lastName);
		  driver.findElement(By.cssSelector("#sTest-candidateLastName")).sendKeys(lastName);
//		  driver.findElement(By.id("sTest-candidateEmail")).sendKeys(email);
		  driver.findElement(By.xpath("//*[@id=\"sTest-candidateEmail\"]")).sendKeys(email);

		  driver.findElement(By.id("sTest-candidateAddBtn")).click();
		
	}

	
	public static void AddCompanies() throws InterruptedException{

		  String companyName="commm"; 
		  String website="www.company1.com";
		  String contact="9000000000";
		 
		  System.out.println("waiting for 5 sec");
		  TimeUnit.SECONDS.sleep(5);
		  driver.findElement(By.id("sTest-companiesIcon")).click();
		  driver.findElement(By.id("sTest-addCompanyBtn")).click();
		  driver.findElement(By.id("sTest-companyNameTxt")).sendKeys(companyName);
		  driver.findElement(By.id("sTest-companyWebsiteTxt")).sendKeys(website);
		  driver.findElement(By.id("sTest-cContactNumberTxt")).sendKeys(contact);
		  driver.findElement(By.id("sTest-companySubmitBtn")).click();
				
	}

}
