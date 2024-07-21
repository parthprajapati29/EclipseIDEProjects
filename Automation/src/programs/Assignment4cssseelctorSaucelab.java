package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4cssseelctorSaucelab {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.saucedemo.com/v1/");
		w.manage().window().maximize();
		Thread.sleep(4000);
				
		w.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		w.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		w.findElement(By.cssSelector("input[value=\"LOGIN\"]")).click();
		
		Thread.sleep(2000);
		w.findElement(By.cssSelector("button.btn_primary.btn_inventory")).click();	
		w.findElement(By.cssSelector("a.shopping_cart_link.fa-layers.fa-fw")).click();

		Thread.sleep(2000);
		w.findElement(By.cssSelector("a.btn_action")).click();	
		Thread.sleep(2000);

		w.findElement(By.cssSelector("input[placeholder=\"First Name\"]")).sendKeys("Parth");
		w.findElement(By.cssSelector("input[data-test=\"lastName\"]")).sendKeys("Prajapati");
		w.findElement(By.cssSelector("input[data-test=\"postalCode\"]")).sendKeys("33101");
		
		Thread.sleep(2000);
		w.findElement(By.cssSelector("input[value=\"CONTINUE\"]")).click();

		Thread.sleep(2000);
		w.findElement(By.cssSelector("a[href=\"./checkout-complete.html\"]")).click();
		w.findElement(By.cssSelector("div.bm-burger-button")).click();
		w.findElement(By.cssSelector("a#logout_sidebar_link")).click();


		
		//*[@id="email"]
		//*[@id="pass"]
	}

}



//w.findElement(By.cssSelector("input[name=\"lastname\"]")).sendKeys("Prajapati");
//w.findElement(By.cssSelector("input[aria-label=\"Mobile number or email address\"]")).sendKeys("emilyjames202115@gmail.com");
//w.findElement(By.cssSelector("input#password_step_input")).sendKeys("Password123");