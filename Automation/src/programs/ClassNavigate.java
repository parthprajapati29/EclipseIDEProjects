package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNavigate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		Thread.sleep(2000);
		w.navigate().to("https://demo.frontaccounting.eu/");
		Thread.sleep(2000);
		w.navigate().back();
		Thread.sleep(2000);
		w.navigate().forward();
		Thread.sleep(2000);
		w.navigate().refresh();
		
	}

}
