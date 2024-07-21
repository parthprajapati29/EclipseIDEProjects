package programs;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAmazon {
	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.amazon.in/");
		Actions act = new Actions(w);
		Thread.sleep(2000);
				
		WebElement bestseller = w.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]"));	
		act.moveToElement(bestseller).perform();
		
		WebElement signin = w.findElement(By.linkText("Sign in"));
		act.moveToElement(signin).click().perform();
		
	}
}
