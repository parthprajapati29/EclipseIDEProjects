package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MesshoAssignment{
	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.meesho.com/");
		Thread.sleep(10000);
		w.findElement(By.cssSelector("input[placeholder=\"Try Saree, Kurti or Search by Product Code\"]")).sendKeys("tshirt",Keys.ENTER);
		w.findElement(By.cssSelector("span[class=\"sc-jcMfQk.fRLybe\"]")).click();
	}
}
