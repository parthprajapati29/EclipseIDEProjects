package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramwait {

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.instagram.com/");
		
//		implict wait
		//w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.findElement(By.name("username")).sendKeys("test123");
		w.findElement(By.name("password")).sendKeys("test123");
		
	}

}
