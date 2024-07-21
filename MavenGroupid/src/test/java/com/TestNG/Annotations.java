package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver w;
	
	@BeforeMethod
	public void openurl() {
		w = new ChromeDriver();
		w.get("https://www.saucedemo.com/v1/");
	}
	
	@AfterMethod
	public void close() {
		w.quit();
	}
	
	@Test (priority = 1)
	public void validCreds() {
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		w.findElement(By.id("login-button")).click();;
	}
	
	@Test (priority = 2)
	public void InvalidCreds() {
		w.findElement(By.id("user-name")).sendKeys("standard_userw");
		w.findElement(By.id("password")).sendKeys("secret_saucew");
		w.findElement(By.id("login-button")).click();
		
		w.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
		
	}	
}