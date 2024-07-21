package comPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucelab {
	static WebDriver w;
	public static void main(String[] args) throws Exception {
		w = new ChromeDriver();
		w.get("https://www.saucedemo.com/v1/");
		saucelabrepo r = new saucelabrepo(w); 
		r.login("standard_user","secret_sauce");
		r.logout();
	}
}
