package programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception {
		WebDriver w  = new ChromeDriver();
		w.get("https://www.amazon.in/");
		Thread.sleep(10000);
		
		w.findElement(By.id("twotabsearchtextbox")).sendKeys("nike shoes",Keys.ENTER);
		w.findElement(By.linkText("Mens Downshifter Running Shoes 13Nike Downshifter 13")).click();
		
		String parentWindow = w.getWindowHandle();
		Set<String> childwindow = w.getWindowHandles();
		
		for (String win : childwindow) {
			if (!win.equals(parentWindow)) {
				w.switchTo().window(win);
				w.findElement(By.cssSelector("input[id=\"buy-now-button\"]")).click();
			}
		}
	}
}