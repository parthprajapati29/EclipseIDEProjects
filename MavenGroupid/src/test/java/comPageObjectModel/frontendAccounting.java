package comPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frontendAccounting {
	static WebDriver w;
	public static void main(String[] args) {
		w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/");
		frontendAccountingrepo r = new frontendAccountingrepo(w); 
		r.login("demouser","password");
		r.salesQuotationWntry();
		r.logout();
		
	}

}
