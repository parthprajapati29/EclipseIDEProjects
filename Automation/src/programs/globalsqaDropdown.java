package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class globalsqaDropdown {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@value=\"IND\"]")).click();
	}

}
