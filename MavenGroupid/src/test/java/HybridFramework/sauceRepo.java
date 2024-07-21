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

public class sauceRepo {
	WebDriver w;
	public sauceRepo(WebDriver wd) {
		w = wd;
		PageFactory.initElements(w, this);
	}
	
	//Webelement
	@FindBy(id = "user-name") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "login-button") WebElement login;
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[3]/button") WebElement addtocart;
	@FindBy(id = "shopping_cart_container") WebElement addtocartlogo;
	@FindBy(linkText = "CHECKOUT") WebElement checkout;
	@FindBy(id = "first-name") WebElement fname;
	@FindBy(id = "last-name") WebElement lname;
	@FindBy(id = "postal-code") WebElement zipcode;
	@FindBy(xpath = "//*[@value=\"CONTINUE\"]") WebElement continueoncheckout;
	@FindBy(linkText = "FINISH") WebElement finsih;
	@FindBy(className = "complete-header") WebElement checkoutcompleteText;
	@FindBy(xpath = "//*[@class=\"bm-burger-button\"]/button") WebElement hamburger;
	@FindBy(xpath = "//*[@class=\"bm-item-list\"]/a[3]") WebElement logout;
	@FindBy(xpath = "//h3[contains(@data-test, \"error\")]") WebElement errorloginmessage;
	


	
	public void login(String uname, String pass) throws Exception{
		username.sendKeys(uname);
		password.sendKeys(pass);
		login.click();
			
		Thread.sleep(3000);
		WebElement verifyErrorText = w.findElement(By.xpath("//h3[contains(@data-test, \"error\")]"));
		if(verifyErrorText.isDisplayed()) {
			System.out.println("true");
			TakesScreenshot tss = (TakesScreenshot) w;
			FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Parth\\eclipse-workspace\\MavenGroupid\\screenshots\\"+uname+" "+pass+".png"));
		}
	}
	
	public void inventory() throws Exception{
		
		addtocart.click();
		addtocartlogo.click();
	}

	public void cart() throws Exception{
		checkout.click();
	}
	
	public void checkoutstep1(String finame, String laname, String zipc) throws Exception{
		fname.sendKeys(finame);
		lname.sendKeys(laname);
		zipcode.sendKeys(zipc);
		continueoncheckout.click();
	}
	public void checkoutstep2() throws Exception{
		finsih.click();
	}
	
	public void checkoutcomplete() throws Exception{
		String text = "THANK YOU FOR YOUR ORDER";
		if(checkoutcompleteText.getText().equals(text)) {
			System.out.println("order has been placed");
		}else {
			System.out.println("Order not placed, Some thing went wrong");
		}
		Thread.sleep(2000);
		
	}
	
	public void logout() throws Exception{
		hamburger.click();
		Thread.sleep(2000);
		logout.click();
//		w.close();
	}
	

	

}
