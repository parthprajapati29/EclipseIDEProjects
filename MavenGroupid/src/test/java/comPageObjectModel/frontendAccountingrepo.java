package comPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class frontendAccountingrepo {

	WebDriver w;
	public frontendAccountingrepo(WebDriver wd) {
		w = wd;
	}
	
	//webelements
	By username = By.name("user_name_entry_field");
	By password = By.name("password");
	By loginbtn = By.name("SubmitUser");
	By SQE = By.linkText("Sales Quotation Entry");
	By logoutbtn = By.linkText("Logout");
	
	public void login(String user, String pass) {
		w.findElement(username).clear();
		w.findElement(username).sendKeys(user);
		w.findElement(password).clear();
		w.findElement(password).sendKeys(pass);
		w.findElement(loginbtn).click();
	}
	
	public void salesQuotationWntry() {
		w.findElement(SQE).click();
	}
	
	public void logout() {
		w.findElement(logoutbtn).click();
	}

}
