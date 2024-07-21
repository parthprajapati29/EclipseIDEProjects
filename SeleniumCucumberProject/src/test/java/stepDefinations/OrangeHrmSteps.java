package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class OrangeHrmSteps {
	
	WebDriver w;
	
	
	@Given("I launch the chrome browser")
	public void i_launch_the_chrome_browser() {
		w = new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.manage().window().maximize();
	}

	@When("I open orangehrm homepage")
	public void i_open_orangehrm_homepage() throws Exception {
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	
	@When("^user enters (.*) and (.*) and perform login$")
	public void user_enters_username_and_password_and_perform_login(String uname, String pass){
		w.findElement(By.name("username")).sendKeys(uname);
		w.findElement(By.name("password")).sendKeys(pass);
		w.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	}
	
	@Then("I verify that user redirects to dashboard")
	public void I_verify_that_user_redirects_to_dashboard() throws Exception {
		Thread.sleep(3000);
		WebElement element = w.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
		String text = element.getText();
		if(text.contains("Dashboard")) {
			System.out.println("Sucess");
		}
		
	}


	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.name("username")).sendKeys("Admin");

		//Assert.assertEquals(true, b);
	}

	@Then("close browser")
	public void close_browser() {
		w.quit();
	}

}
