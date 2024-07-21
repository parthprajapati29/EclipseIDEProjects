package comPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fronendAccountingWithPF {

	public static void main(String[] args) {
		WebDriver w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/");
		comPageObjectModelFrontAccountingRepo cpomfar = new comPageObjectModelFrontAccountingRepo(w);
		cpomfar.login("demouser", "password");
		
		try {
			cpomfar.saleQuotation();
			cpomfar.logout();
		}catch (Exception e) {
			System.out.println("Exception has been occured:" +e);
		}
		cpomfar.closeBrowser();
	}

}
