package com.testngpolymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseTest {
	WebDriver w;
	
	@BeforeMethod
	public void tearUp() {
		w = new ChromeDriver();
		w.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		w.quit();
	}
}
