package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomiseLocator {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
	w.findElement(By.cssSelector("input#password_step_input")).sendKeys("123123");
	w.findElement(By.cssSelector("input.inputtext._58mg._5dba._2ph-")).sendKeys("Helloeew");
	w.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]")).sendKeys("emilyjames202115@gmail.com");
	}

}


// 1. css selector
//  	1. Tagname#Id
//		2. Tagname.class      (replace space with dot)
//		3. Tagname["attribute=value"]  - Universal

// 2. Xpath