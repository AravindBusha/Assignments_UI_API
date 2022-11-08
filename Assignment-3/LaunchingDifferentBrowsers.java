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
	  
	  
	    WebDriverManager.chromedriver().setup();   // setup chromedriver
	    WebDriver driver1 = new ChromeDriver();   // create driver for chromedriver
	    driver1.get("https://www.google.com");	  // searching in chrome
	    
	    
	    // instead of setting  the firefox path  in environment variables set by using "setProperty"
	    System.setProperty("webdriver.firefox.bin",
              "C:\\Program Files\\WindowsApps\\Mozilla.Firefox_106.0.3.0_x64__n80bbvh6b1yt2\\VFS\\ProgramFiles\\Firefox Package Root\\firefox.exe");
	    WebDriverManager.firefoxdriver().setup(); // setup firfoxdriver
	    WebDriver driver2 = new FirefoxDriver();  // create driver for firefoxdriver
	    driver2.get("https://www.google.com");	  // searching in firefox
	    
	    // instead of setting  the opera path  in environment variables set by using "setProperty"

	    System.setProperty("webdriver.opera.bin",
	              "C:\\Users\\busha\\AppData\\Local\\Programs\\Opera.exe");
	    WebDriverManager.operadriver().setup();		//setup opera
	    WebDriver driver3 = new OperaDriver();		// create driver for opera
	    driver3.get("https://www.google.com");	    // searching in opera
	    
	    

	  
  }
}
