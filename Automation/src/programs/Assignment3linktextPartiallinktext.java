package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3linktextPartiallinktext {
	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		
		w.get("https://www.amazon.in/");
		w.manage().window().maximize();
		w.findElement(By.linkText("Amazon miniTV")).click();
		Thread.sleep(500);
		w.findElement(By.partialLinkText("Movi")).click();
		
		
	}
}
