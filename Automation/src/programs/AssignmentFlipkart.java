package programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w  = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		w.findElement(By.xpath("//*[@class=\"Pke_EE\"]")).sendKeys("iphone xr",Keys.ENTER);
		w.findElement(By.xpath("//*[@class=\"KzDlHZ\"][1]")).click();
		
		String pwindow = w.getWindowHandle();
		Set<String> cwindow = w.getWindowHandles();
		
		System.out.println("parent: " +pwindow);
		System.out.println("parent: " +cwindow);
		
		for (String win : cwindow) {
			if (!win.equals(pwindow)) {
				w.switchTo().window(win);
				w.findElement(By.id("pincodeInputId")).sendKeys("396230");
				w.findElement(By.xpath("//*[@class=\"i40dM4\"]"));
				w.findElement(By.xpath("//*[@class=\"OGrnIL\"]")).click();
			}
		}
		
		
		
	}

}
