package com.vtechsolution.orangehrm.testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public WebDriver driver;
	
	  @BeforeTest
	  public void openthebrowser() {
		  WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	 @AfterTest 
	 public void closethebrowser() {
		driver.close(); 
	 }

}
