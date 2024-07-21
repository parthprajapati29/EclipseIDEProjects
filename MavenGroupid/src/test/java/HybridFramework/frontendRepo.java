package HybridFramework;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class frontendRepo {
	WebDriver w;
	public frontendRepo(WebDriver wd) {
		w = wd;
		PageFactory.initElements(w, this);
	}
	
	@FindBy(name = "user_name_entry_field") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(name = "SubmitUser") WebElement loginbtn;
	@FindBy(linkText = "Sales Quotation Entry") WebElement saleQuotationEntry;
	@FindBy(linkText = "Sales Order Entry") WebElement salesOrderEntry;
	@FindBy(linkText = "Logout") WebElement logout;

	public void login(String uname, String pass) {
		username.clear();
		username.sendKeys(uname);
		password.clear();
		password.sendKeys(pass);
		loginbtn.click();
	}
	
	public void saleQuotation() throws Exception{
		saleQuotationEntry.click();
	}
	public void salesOrderEntry() {
		
		try {
			salesOrderEntry.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void logout() {
		try {
			logout.click();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void closeBrowser() {
		w.quit();
	}
	public void back() {
		try {
			w.navigate().back();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void screenshot(String location) throws Exception {
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File(location));
	}
}
