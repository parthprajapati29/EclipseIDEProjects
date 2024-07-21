package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		w.manage().window().maximize();
		w.findElement(By.id("ap_customer_name")).sendKeys("test1");
		w.findElement(By.id("ap_phone_number")).sendKeys("7864567890");
		w.findElement(By.id("ap_password")).sendKeys("1234567890");
		
		//Thread.sleep(500);
		w.findElement(By.className("a-button-input")).click();
		
		
	}

}
