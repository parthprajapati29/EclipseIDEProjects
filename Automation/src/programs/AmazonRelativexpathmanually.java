package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRelativexpathmanually {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26adgrpid%3D155259815513%26gad_source%3D1%26hvadid%3D674842289437%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9145958%26hvnetw%3Dg%26hvpone%3D%26hvpos%3D%26hvptwo%3D%26hvqmt%3De%26hvrand%3D12447102826487457220%26hvtargid%3Dkwd-10573980%26hydadcr%3D14453_2316415%26ref%3Dpd_sl_7hz2t19t5c_e%26tag%3Dgooghydrabk1-21%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
		Thread.sleep(10000);
		w.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys("parth");
		w.findElement(By.xpath("//*[@id=\"ap_phone_number\"]")).sendKeys("7864567890");
		w.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("fskafewif");
		w.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
	}

}
