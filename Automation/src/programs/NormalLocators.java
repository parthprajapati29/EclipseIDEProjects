package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalLocators {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		
		
		w.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		w.findElement(By.name("firstname")).sendKeys("Parth");
		
		w.findElement(By.name("lastname")).sendKeys("Prajapati");
		
		Thread.sleep(2000);
		w.findElement(By.name("reg_email__")).sendKeys("emilyjames202115@gmail.com");
		
		w.findElement(By.id("password_step_input")).sendKeys("1234567890");
		
		//w.findElement(By.linkText("Already have an account?")).click();
		//w.findElement(By.partialLinkText("Already have an ")).click();
		
		//w.findElement(By.name("reg_email_confirmation__")).sendKeys("emilyjames202115@gmail.com");

	}

}


//normal locators
// id
// name
// classname