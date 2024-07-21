package programs;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonwindowhandle {

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://amazon.in");
		
		w.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone",Keys.ENTER);
		w.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		
		String parentWindow = w.getWindowHandle();
		Set<String> childwindow = w.getWindowHandles();
		
		for (String win : childwindow) {
			if (!win.equals(parentWindow)) {
				w.switchTo().window(win);
				w.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
			}
		}
	}

}
