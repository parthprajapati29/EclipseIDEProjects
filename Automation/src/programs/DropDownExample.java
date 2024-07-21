package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.facebook.com/signup");

		WebElement BDay = w.findElement(By.id("day"));
		WebElement BMonth = w.findElement(By.id("month"));
		WebElement BYear = w.findElement(By.id("year"));
		Select d = new Select(BDay);
		Select m = new Select(BMonth);
		Select y = new Select(BYear);

		d.selectByIndex(13);
		Thread.sleep(2000);
		
		m.selectByValue("10");
		Thread.sleep(2000);
		y.selectByVisibleText("1993");
		
	}

}
