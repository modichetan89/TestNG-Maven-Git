package com.qa.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BaseClass {
	public static WebDriver driver;
	
	public BaseClass(){
	System.setProperty("webdriver.chrome.driver","D:\\Selenium New\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	}
	
	@Test(priority=1)
	public void runBrowser(){
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	}
	//Commenting to pull into local
	@Test(priority=2, enabled=false)
	public void assertTitle(){
		String actual = driver.getTitle();
		System.out.println(actual);
		try{
		Assert.assertEquals(actual, "Google");
		}catch(Exception e){
			System.out.println("Exception occured --> " +e);
		}
		finally{
		driver.quit();
		}
	}
}
