package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		w.findElement(By.id("autocomplete")).sendKeys("xyz");
		
		Thread.sleep(2000);
		w.switchTo().frame(w.findElement(By.name("iframe-name")));
		w.findElement(By.linkText("Mentorship")).click();
		
//		w.switchTo().parentFrame();
		w.switchTo().defaultContent();
		
		w.findElement(By.id("autocomplete")).sendKeys("123");
		
		
		List<WebElement> checkbox = w.findElements(By.xpath("/html/body/div[1]/div[4]/fieldset/label/input"));
		for (WebElement ch : checkbox) {
			ch.click();
		}
	}
}
