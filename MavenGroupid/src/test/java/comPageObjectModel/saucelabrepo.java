package comPageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class saucelabrepo {
	
	WebDriver w;
	public saucelabrepo(WebDriver wd) {
		w = wd;
	}
	
	By username = By.name("user-name");
	By password = By.name("password");
	By loginbtn = By.id("login-button");
	By logouthum = By.className("bm-burger-button");
	By logout = By.id("logout_sidebar_link");
	
	public void login(String user, String pass) {
		w.findElement(username).sendKeys(user);
		w.findElement(password).sendKeys(pass);
		w.findElement(loginbtn).click();
	}
	
	public void logout() throws Exception {
		w.findElement(logouthum).click();
 		Thread.sleep(2000);
		w.findElement(logout).click();
	}
}
