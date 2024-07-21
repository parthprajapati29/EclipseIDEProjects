package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo {
	
	WebDriver w;
	
	@Test (priority = 1)
	public void searchchrome() {
		w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		w.findElement(By.cssSelector("input[class=\"Pke_EE\"]")).sendKeys("phone");
	}
	
	@Test (priority = 2)
	public void searchfirefox() {
		w = new FirefoxDriver();
		w.get("https://www.flipkart.com/");
		w.findElement(By.cssSelector("input[class=\"Pke_EE\"]")).sendKeys("phone");
	}
	
}
