package com.TestNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadceck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://cloudconvert.com/");
		//w.get("https://omayo.blogspot.com/");
		w.manage().window().maximize();
		Thread.sleep(10000);

		
		w.findElement(By.xpath("//*[contains(@type, \"file\")]")).sendKeys("C:\\Users\\Parth\\Downloads\\Parth Prajapati- wordfile.docx");
		//fileinput.sendKeys();
		
		w.findElement(By.xpath("//*[@id=\"__BVID__39__BV_toggle_\"]")).click();
		Thread.sleep(1000);
		
		w.findElement(By.id("__BVID__42__BV_toggle_")).click();
		
		
	}



}
