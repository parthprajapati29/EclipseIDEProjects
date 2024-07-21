package com.TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSaucedemowithdataDriven {
	WebDriver w;
	SoftAssert soft;
	int i =0;
	
	@DataProvider	
	public String[][] getlogindata(){
		
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
	
	@Test (dataProvider = "getlogindata", alwaysRun = true)
	public void Enterdata(String username, String pass) throws Exception {
		soft = new SoftAssert();
		w.findElement(By.id("user-name")).sendKeys(username);
		w.findElement(By.id("password")).sendKeys(pass);
		w.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		String exp_url = "https://www.saucedemo.com/v1/inventory.html";
		String act_url = w.getCurrentUrl();
		
		soft.assertEquals(act_url, exp_url);
		
		soft.assertAll();
	

	}
	
	@AfterMethod
	public void logout() throws Exception {
		try {
			w.findElement(By.xpath("//*[@class=\"bm-burger-button\"]/button")).click();
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		} catch (Exception e) {
			TakesScreenshot tss = (TakesScreenshot) w;
			File src = tss.getScreenshotAs(OutputType.FILE);
			File desc = new File("C:\\Users\\Parth\\Pictures\\Screenshots\\ss\\testng"+i+".png");
			i++;
			FileHandler.copy(src, desc);
		}

	}
	
	@AfterClass (alwaysRun = true)
	public void CloseBrowser() {
		w.quit();
	}
}
