package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSauceDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.saucedemo.com/v1/");
		w.manage().window().maximize();
		
		Thread.sleep(4000);
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		w.findElement(By.id("login-button")).click();
		
		Thread.sleep(2000);
		w.findElement(By.id("item_4_title_link")).click();
		w.findElement(By.className("btn_primary")).click();
		w.findElement(By.className("shopping_cart_link")).click();
		
		Thread.sleep(4000);
		w.findElement(By.linkText("CHECKOUT")).click();
		
		Thread.sleep(2000);
		w.findElement(By.id("first-name")).sendKeys("Parth");
		w.findElement(By.id("last-name")).sendKeys("Prajapati");
		w.findElement(By.id("postal-code")).sendKeys("33101");
		w.findElement(By.className("btn_primary")).click();
		
		Thread.sleep(2000);
		w.findElement(By.linkText("FINISH")).click();
		
	
		Thread.sleep(2000);
		w.findElement(By.className("bm-burger-button")).click();
		Thread.sleep(2000);
		w.findElement(By.id("logout_sidebar_link")).click();

		w.quit();
	}

}
