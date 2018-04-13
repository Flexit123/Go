package com.Apmosys.test.Googletest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestGooglePage {

	 public WebDriver driver;
	 
	  @Test
	  public void openURL()  {
		  
	 driver.get("https://www.seleniumhq.org");
	 
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.gecko.driver", "/home/apmosys/Desktop/Art/workspace/geckodriver");
	   driver = new FirefoxDriver();
	   
	  }
	 
	  @AfterClass
	  public void afterClass() throws InterruptedException {
		  Thread.sleep(300);
	   driver.quit();
	  }
	  
	
}
