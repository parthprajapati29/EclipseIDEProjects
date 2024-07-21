package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Saucedemo {
	WebDriver w;
	
	@BeforeClass
	public void launchDriver() {
		w = new ChromeDriver();
	}
	
	@BeforeMethod
	public void openurl() {
		w.get("https://www.saucedemo.com/v1/");
	}

	
	@Test (priority = 1)
	public void loginValid() throws InterruptedException {
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		w.findElement(By.id("login-button")).click();

	}
	
	@Test (priority = 2)
	public void loginInValid() throws InterruptedException {
		w.findElement(By.id("user-name")).sendKeys("locked_out_user");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		w.findElement(By.id("login-button")).click();

	}
	
	@AfterMethod 
	public void logout() throws InterruptedException {
		w.findElement(By.xpath("//*[@class=\"bm-burger-button\"]/button")).click();
		Thread.sleep(1000);
		w.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
	
	@AfterClass (alwaysRun = true)
	public void CloseDriver() {
		w.quit();
	}
	
}
