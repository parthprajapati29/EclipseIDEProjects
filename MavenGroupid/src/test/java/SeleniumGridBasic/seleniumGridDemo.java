package SeleniumGridBasic;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumGridDemo {
		WebDriver w;
		
		@Test
		public void google() throws Exception {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("chrome");
			dc.setPlatform(Platform.WINDOWS);
			w = new RemoteWebDriver(dc);
			w.manage().window().maximize();
			w.get("https://www.google.com/");
			Thread.sleep(5000);
			w.quit();
		}
		
		@Test
		public void Firefox() throws Exception {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("firefox");
			dc.setPlatform(Platform.WINDOWS);
			w = new RemoteWebDriver(dc);
			w.manage().window().maximize();
			w.get("https://www.flipkart.com/");
			Thread.sleep(5000);
			w.quit();

		}
		
		@Test
		public void edge() throws Exception {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("MicrosoftEdge");
			dc.setPlatform(Platform.WINDOWS);
			w = new RemoteWebDriver(dc);
			w.manage().window().maximize();
			w.get("https://www.amazon.in/");
			Thread.sleep(5000);
			w.quit();

		}
	
}
