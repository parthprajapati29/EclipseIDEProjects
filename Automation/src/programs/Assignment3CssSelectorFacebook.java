package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3CssSelectorFacebook {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		w.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		w.findElement(By.cssSelector("input[placeholder=\"First name\"]")).sendKeys("Parth");
		w.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Prajapati");
		w.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]")).sendKeys("emilyjames202115@gmail.com");
		w.findElement(By.cssSelector("input#password_step_input")).sendKeys("Password123");
		
		


	}

}
