

package com.webdriver.login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LaunchingDifferentBrowsers {
  @Test
  public void f() {
	  
	  String firefoxLocation = "C:\\Program Files\\WindowsApps\\Mozilla.Firefox_106.0.5.0_x64__n80bbvh6b1yt2\\VFS\\ProgramFiles\\Firefox Package Root\\firefox.exe";
	  String operaLocation = "C:\\Users\\busha\\AppData\\Local\\Programs\\Opera.exe";
	  // add "\\" after adding location in the fileLocations
	  
	    WebDriverManager.chromedriver().setup();   // setup chromedriver
	    WebDriver driver1 = new ChromeDriver();   // create driver for chromedriver
	    driver1.get("https://www.google.com");	  // searching in chrome
	    
	    
		System.setProperty("webdriver.firefox.bin", firefoxLocation);
	    WebDriverManager.firefoxdriver().setup(); // setup firfoxdriver
	    WebDriver driver2 = new FirefoxDriver();  // create driver for firefoxdriver
	    driver2.get("https://www.google.com");	  // searching in firefox
	    

		System.setProperty("webdriver.opera.bin", operaLocation);
	    WebDriverManager.operadriver().setup();		//setup opera
	    WebDriver driver3 = new OperaDriver();		// create driver for opera
	    driver3.get("https://www.google.com");	    // searching in opera
	    }
  
  // instead of setting  the opera path  in environment variables set by using "setProperty"
}

