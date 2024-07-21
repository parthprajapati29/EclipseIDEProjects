package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class meeshoasginment2 {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.meesho.com/");
		Actions alt = new Actions(w);
		
		Thread.sleep(5000);
		
		WebElement men = w.findElement(By.xpath("/html/body/div/div[2]/div[4]/div/div[5]"));
		alt.moveToElement(men).perform();
		
		Thread.sleep(8000);
		
		w.findElement(By.linkText("Belts")).click();
	}

}
