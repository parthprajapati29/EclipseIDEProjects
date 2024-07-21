package comPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comPageObjectModelFrontAccountingRepo {
	
	WebDriver w;
	public comPageObjectModelFrontAccountingRepo(WebDriver wd) {
		w = wd;
		PageFactory.initElements(w, this);
	}

	@FindBy(name = "user_name_entry_field") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(name = "SubmitUser") WebElement loginbtn;
	@FindBy(linkText = "Sales Quotation Entry") WebElement saleQuotationEntry;
	@FindBy(linkText = "Logout") WebElement logout;

	public void login(String uname, String pass) {
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pass);
		loginbtn.click();
	}
	public void saleQuotation() {
		saleQuotationEntry.click();
	}
	public void logout() {
		logout.click();
	}
	public void closeBrowser() {
		w.quit();
	}
}

