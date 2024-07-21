package programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		w.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();
		
		w.findElement(By.id("confirmbtn")).click();
		alt.dismiss();
		Thread.sleep(2000);
		w.findElement(By.id("confirmbtn")).click();
		alt.accept();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		}

}
