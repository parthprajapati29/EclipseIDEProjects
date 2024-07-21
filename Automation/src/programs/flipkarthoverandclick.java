package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkarthoverandclick {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		Actions alt = new Actions(w);
		Thread.sleep(5000);

		//WebElement fashion= w.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]"));
		WebElement fashion = w.findElement(By.xpath("//*[@aria-label=\"Fashion\"]"));
		Thread.sleep(5000);
		alt.moveToElement(fashion).perform();
		Thread.sleep(5000);
		w.findElement(By.linkText("Men's T-Shirts")).click();
		


	}

}
