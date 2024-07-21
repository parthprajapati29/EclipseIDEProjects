package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver w = new ChromeDriver();
		Thread.sleep(2000);
		w.get("https://www.flipkart.com/");		
		w.navigate().to("https://www.amazon.in/");
		w.navigate().back();
		
		
		String title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if (title.equals(w.getTitle())) {
			System.out.println("Title testcase passed");
		}else {
			System.out.println("Title Test case failed");
		}
		
		w.navigate().forward();
		
		System.out.println("Current url is: " +w.getCurrentUrl());
		
		w.navigate().refresh();

	}

}


/*    task
 * 1. 1st site by using get
 * 2. 2nd site by using navigate.to
 * 3. back
 * 4.title verify
 * 5.forward 
 * 6.current url display
 * 7. page reload.
 */