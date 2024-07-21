package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver w;
	
	@Test (enabled = true)
	public void TestUsingChrome() {
		w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/");
		w.findElement(By.name("SubmitUser")).click();
	}
	
	@Test (enabled = true)
	public void TestUsingFirefox() {
		w = new FirefoxDriver();
		w.get("https://demo.frontaccounting.eu/");
		w.findElement(By.name("SubmitUser")).click();
		w.findElement(By.linkText("Sales Quotation Entry")).click();
		w.findElement(By.linkText("Logout")).click();
		
	}

}
