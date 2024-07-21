package keyDrivenFramework;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartRepo {
	static WebDriver w;
	flipkartRepo(WebDriver wd) {
		w = wd;
		PageFactory.initElements(w, this);
	}
	
	//webelements
	@FindBy(name = "q") WebElement searchinput1;
	@FindBy(xpath = "//*[@class=\"_2iLD__\"]") WebElement searchiconclick;
	@FindBy(linkText = "Portronics Key5 Combo POR-1569 Wireless Laptop Keyboard") WebElement productname1;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div/div/div[2]/div/ul/li/button") WebElement addtocart;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button") WebElement addtocart1;
	@FindBy(xpath = "//*[@class=\"MJG8Up\"]") WebElement productsearchicon;
	@FindBy(linkText = "HP M120 /6 programm. buttons,1 AA battery gives upto 12...") WebElement productname2;
	@FindBy(xpath = "//*[@method=\"post\"]/button") WebElement placeorder;
	
	public void searchproduct() {
		searchinput1.sendKeys("Keyboard");
		searchiconclick.click();
	}
	
	public void productOpen1() throws Exception {
		productname1.click();
		Thread.sleep(2000);
	}
	
	public void productOpen2() throws Exception {
		searchinput1.clear();
		searchinput1.sendKeys("Mouse");
		productsearchicon.click();
		Thread.sleep(2000);
		productname2.click();
	}
	
	public void placeorder() {
		placeorder.click();
	}
	
	public void windowHandling() throws Exception {
		String parentWindow = w.getWindowHandle();
		Set<String> childwindow = w.getWindowHandles();

		for (String win : childwindow) {
			if (!win.equals(parentWindow)) {
				w.switchTo().window(win);
			}
		}
		addtocart.click();
		Thread.sleep(2000);
	}
	
	public void windowHandling2() throws Exception {
		String parentWindow = w.getWindowHandle();
		Set<String> childwindow = w.getWindowHandles();

		for (String win : childwindow) {
			if (!win.equals(parentWindow)) {
				w.switchTo().window(win);
			}
		}
		addtocart1.click();
		Thread.sleep(2000);
	}
	
	public void closeBrowser() {
		w.quit();
	}
	
	public void backOperation() {
		w.navigate().back();
	}
	
	void Screenshot() throws Exception{
		TakesScreenshot tss = (TakesScreenshot) w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Parth\\eclipse-workspace\\MavenGroupid\\screenshots\\capture.png"));
		
	}
}
