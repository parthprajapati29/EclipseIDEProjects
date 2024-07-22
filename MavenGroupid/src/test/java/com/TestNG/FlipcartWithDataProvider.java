package com.TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FlipcartWithDataProvider {
	WebDriver w;
	
	@DataProvider
	public String[][] getdata() {
		
		String[][] data = new String[3][1];
		
		data[0][1] = "mobile";
		data[1][1] = "tshirt";
		data[2][1] = "watch";
		
		return data;
		
	}
	
	@BeforeClass (alwaysRun = true)
	public void launchDriver() {
		w = new ChromeDriver();
	}
	
	@BeforeMethod (alwaysRun = true)
	public void openurl() {
		w.get("https://www.flipkart.com/");
	}
	
	@Test (dataProvider = "getdata", alwaysRun = true)
	public void loginValid(String searchvalue) throws InterruptedException {
		w.findElement(By.xpath("//*[contains(@class,'Pke_EE')]")).sendKeys(searchvalue);
		w.findElement(By.xpath("//*[contains(@class,'_2iLD__')]")).click();
		
		w.findElement(By.xpath("//*[contains(@data-id,'WATGYZFXPANB6F7G')]/div")).click();
		
		//switch tab
		String parentWindow = w.getWindowHandle();
		Set<String> childwindow = w.getWindowHandles();

		for (String win : childwindow) {
			if (!win.equals(parentWindow)) {
				w.switchTo().window(win);
				w.findElement(By.cssSelector("input[id=\"buy-now-button\"]")).click();
			}
		}
		
		w.findElement(By.xpath("//*[text()='Add to cart']")).click();
		w.close();		

	}
	
	@AfterMethod (alwaysRun = true)
	public void logout() throws InterruptedException {
		
		// cart 
		w.findElement(By.xpath("//*[contains(@class,'cjMG1q')]")).click();
		
		//placeorder
		w.findElement(By.xpath("//*[text()='Place Order']")).click();
	}
	
	@AfterClass (alwaysRun = true)
	public void CloseDriver() {
		w.quit();
	}

}
