package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class githubAssignmentwithwait {

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://github.com/signup");
		
//		implict wait
//		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		w.findElement(By.id("email")).sendKeys("qst@gmail.com");
//		w.findElement(By.xpath("//*[@data-continue-to=\"password-container\"]")).click();
		
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(10));
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		email.sendKeys("qst@gmail.com");
		
		WebElement con = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-continue-to=\"password-container\"]")));
		con.click();
		
		
		
		
		//w.findElement(By.xpath("//*[@data-continue-to=\"password-container\"]")).click();
		

	}

}
