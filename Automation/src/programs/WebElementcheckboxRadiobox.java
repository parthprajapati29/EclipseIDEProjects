package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementcheckboxRadiobox {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement checkbox1 =	w.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		
		Thread.sleep(1000);
		w.findElement(By.cssSelector("input[value=\"radio1\"]")).click();
		
		boolean select = checkbox1.isSelected();
		if (select) {
			System.out.println("checkbox1 is selected");
		} else {
			System.out.println("checkbox 1 is not selected");
		}
		
		//w.findElement(By.id("hide-textbox")).click();
		boolean display = w.findElement(By.id("displayed-text")).isDisplayed();
		if (display) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}
		
	}

}
