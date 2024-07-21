package programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownhandlingwithdivtag {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		w.findElement(By.name("username")).sendKeys("Admin");
		w.findElement(By.name("password")).sendKeys("admin123");
		w.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		
		w.findElement(By.linkText("PIM")).click();
		w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[1]/div[1]")).click();
		Thread.sleep(1000);
		
		List<WebElement> lwe = w.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div"));
		for (WebElement job : lwe) {
			System.out.println(job.getText());
			if (job.getText().equals("Content Specialist")) {
				job.click();
				break;
			}
		}
		
		w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")).click();
		Thread.sleep(1000);

		List<WebElement> lwe1 = w.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div"));
		for (WebElement status : lwe1) {
			System.out.println(status.getText());
			if (status.getText().equals("Full-Time Probation")) {
				status.click();
				break;
			}
		}
		
		w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")).click();
		Thread.sleep(1000);

		List<WebElement> lwe2 = w.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div"));
		for (WebElement include : lwe2) {
			System.out.println(include.getText());
			if (include.getText().equals("Past Employees Only")) {
				include.click();
				break;
			}
		}
		
		w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[1]")).click();
		Thread.sleep(1000);


		List<WebElement> lwe3 = w.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div[2]/div"));
		for (WebElement subunit : lwe3) {
			System.out.println(subunit.getText());
			if (subunit.getText().equals("Engineering")) {
				subunit.click();
				break;
			}
		}
		
	}

}