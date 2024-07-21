package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {
	WebDriver w;
	
	@Test
	public void Flipkart() throws Exception{
		w = new ChromeDriver();
		w.manage().window().maximize();

		w.get("https://www.flipkart.com/");
		SoftAssert soft = new SoftAssert();
		w.findElement(By.linkText("Cart")).click();
		Thread.sleep(1000);

	    String expText = "Shopping Cart | Flipkart.com";
	    String actText = w.getTitle();
	    
	    
	    //Assert.assertEquals(actText, expText);
	    soft.assertEquals(actText, expText);

	    
	    String expUrl = "https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART";
	    String actUrl = w.getCurrentUrl();
	    
	    //Assert.assertEquals(actUrl, expUrl);
	    soft.assertEquals(actUrl, expUrl);
	    
	    soft.assertAll();

	}

}
