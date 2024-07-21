package programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshots {

	public static void main(String[] args) throws Exception, IOException {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");

		TakesScreenshot tss = (TakesScreenshot) w;
		int i = 1;
		i++;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Parth\\Downloads\\src"+i+".png"));
	}

}
