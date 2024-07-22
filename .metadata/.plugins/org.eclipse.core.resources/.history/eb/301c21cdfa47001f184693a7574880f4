package com.testngpolymorphism;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class letscheck extends BaseTest{
	

	@Test
	public void googleSearch() throws Exception{
		w.get("https://www.google.com/");
		WebElement searchbox = w.findElement(By.xpath("//*[@class=\"gLFyf\"]"));
		searchbox.sendKeys("iphone");
		searchbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		String exp = "selenium webdriverews - Google Search";
		String act = w.getTitle();
		
		Assert.assertEquals(act, exp);		
	}
}
