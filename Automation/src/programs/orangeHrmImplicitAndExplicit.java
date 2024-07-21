package programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangeHrmImplicitAndExplicit {

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();

		
		// implicit wait
		//w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(10));
		WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		username.sendKeys("Admin");

		w.findElement(By.name("password")).sendKeys("admin123");
		w.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		WebDriverWait wait1 = new WebDriverWait(w, Duration.ofSeconds(15));
		WebElement pim = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("PIM")));
		pim.click();
		
	}

}
