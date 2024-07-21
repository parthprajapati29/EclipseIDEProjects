package com.TestNG;

import java.io.File;
import java.io.IOException;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionFrontAccouting {
	WebDriver w;
	SoftAssert soft;
	int i =0;
	
	@DataProvider
	
	public String[][] getdata(){
		
		String[][] data = new String[4][2];
		
		data[0][0] = "demouser";
		data[0][1] = "password";
		
		
		data[1][0] = "demouser1";
		data[1][1] = "password1";
		
		data[2][0] = "demouser2";
		data[2][1] = "password2";
				
		data[3][0] = "demouser3";
		data[3][1] = "password3";
		
		return data;
	}
	
	
	@BeforeClass (alwaysRun = true)
	public void launchDriver() {
		w = new ChromeDriver();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void openurl() {
		w.get("https://demo.frontaccounting.eu/index.php");
	}
	
	@Test (dataProvider = "getdata", alwaysRun = true)
	public void login(String username, String pass) throws Exception {
		soft = new SoftAssert();
		w.findElement(By.name("user_name_entry_field")).clear();
		w.findElement(By.name("user_name_entry_field")).sendKeys(username);

		w.findElement(By.name("password")).clear();
		w.findElement(By.name("password")).sendKeys(pass);
		w.findElement(By.name("SubmitUser")).click();
		
		String ExpText = "Main Menu";
		String acttext = w.getTitle();
		
		//Assert.assertEquals(acttext, ExpText);
		soft.assertEquals(acttext, ExpText);
		
		soft.assertAll();
		
		Reporter.log("Chrome browser has been opened");
		Reporter.log("<img src= C:/Users/Parth/Pictures/Screenshots/ss/testng2.png> <img>");
		
	}
	
	@AfterMethod (alwaysRun = true)
	public void logout() throws InterruptedException, Exception {
		try {
			w.findElement(By.linkText("Logout")).click();

		} catch (Exception e) {
			w.navigate().back();
			
			TakesScreenshot tss = (TakesScreenshot) w;
			File src = tss.getScreenshotAs(OutputType.FILE);
			File desc = new File("C:\\Users\\Parth\\Pictures\\Screenshots\\ss\\testng"+i+".png");
			i++;
			FileHandler.copy(src, desc);
		}
		
	}

	@AfterClass (alwaysRun = true)
	public void CloseDriver() {
		w.quit();
	}
	
}
