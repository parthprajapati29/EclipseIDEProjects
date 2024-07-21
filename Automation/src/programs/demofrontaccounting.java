package programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demofrontaccounting {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://demo.frontaccounting.eu/index.php");
		Thread.sleep(2000);
		w.findElement(By.name("user_name_entry_field")).clear();
		w.findElement(By.name("password")).clear();
		Thread.sleep(2000);

		w.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		w.findElement(By.name("password")).sendKeys("password");
		w.findElement(By.name("SubmitUser")).click();
		
		w.findElement(By.linkText("Sales Quotation Entry")).click();
		
		WebElement cid = w.findElement(By.id("customer_id"));
		Select d = new Select(cid);

		Thread.sleep(2000);
		d.selectByVisibleText("WWW");
		
		w.findElement(By.id("CancelOrder")).click();
		Alert alt = w.switchTo().alert();
		Thread.sleep(2000);
		alt.dismiss();
		
		w.findElement(By.id("CancelOrder")).click();
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(2000);
		w.findElement(By.linkText("Logout")).click();

		
		
		
	}

}
