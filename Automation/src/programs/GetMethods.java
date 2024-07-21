package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.get("https://demo.frontaccounting.eu/");
		
		if ("FrontAccounting 2.4.12 - Login".equals(w.getTitle())) {
			System.out.println("Title is expected");
		}else {
			System.out.println("Title is different");
		}
		
		String url = w.getCurrentUrl();
		System.out.println(url);
		
		System.out.println(w.getPageSource());
		
		w.close();
	}

}
