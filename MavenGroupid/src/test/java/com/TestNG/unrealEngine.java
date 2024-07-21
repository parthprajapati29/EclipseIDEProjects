package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class unrealEngine {

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.unrealengine.com/en-US");
		
		WebElement text = w.findElement(By.linkText("Uses"));
		System.out.println(text.getText());
		
	}

}
