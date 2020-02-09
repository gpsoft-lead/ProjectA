package com.gpsoft.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:/Downloads/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Test
	public void titleTest() {
		driver.navigate().to("https://classic.crmpro.com/login.cfm");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "CRMPRO LogIn Screen");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
