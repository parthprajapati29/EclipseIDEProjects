package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
	WebDriver w;
	
	@DataProvider
	public String[][] getdata(){
		
		String[][] data = new String[4][2];
		
		data[0][0] = "standard_user";
		data[0][1] = "secret_sauce";
		
		
		data[1][0] = "locked_out_user";
		data[1][1] = "secret_sauce";
		
		data[2][0] = "problem_user";
		data[2][1] = "secret_sauce";
				
		data[3][0] = "performance_glitch_user";
		data[3][1] = "secret_sauce";
		
		return data;
		
	}

	
	@BeforeClass (alwaysRun = true)
	public void launchDriver() {
		w = new ChromeDriver();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void openurl() {
		w.get("https://www.saucedemo.com/v1/");
	}
	
	@Test (dataProvider = "getdata", alwaysRun = true)
	public void loginValid(String name, String pass) throws InterruptedException {
		w.findElement(By.id("user-name")).sendKeys(name);
		w.findElement(By.id("password")).sendKeys(pass);
		Thread.sleep(3000);
		w.findElement(By.id("login-button")).click();
	}
	
	@AfterMethod (alwaysRun = true)
	public void logout() throws InterruptedException {
		w.findElement(By.xpath("//*[@class=\"bm-burger-button\"]/button")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
	}
	
	@AfterClass (alwaysRun = true)
	public void CloseDriver() {
		w.quit();
	}
}
