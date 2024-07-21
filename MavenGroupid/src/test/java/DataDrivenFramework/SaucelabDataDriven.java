package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SaucelabDataDriven {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();

		
		FileInputStream fis = new FileInputStream("C:\\Users\\Parth\\Desktop\\saucelab datadriven.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			String username = row.getCell(0).toString();
			String password = row.getCell(1).toString();
			
			w.get("https://www.saucedemo.com/v1/");
			w.findElement(By.name("user-name")).sendKeys(username);
			w.findElement(By.name("password")).sendKeys(password);
			
			w.findElement(By.id("login-button")).click();
			
			try {
//				Thread.sleep(2000);
//				w.findElement(By.id("item_4_title_link")).click();
//				Thread.sleep(2000);
//				w.findElement(By.className("btn_primary")).click();	
//				Thread.sleep(2000);
//				w.findElement(By.className("shopping_cart_link")).click();
//				Thread.sleep(2000);
				w.findElement(By.className("bm-burger-button")).click();
				Thread.sleep(2000);
				w.findElement(By.id("logout_sidebar_link")).click();
			} catch (Exception e) {
				Thread.sleep(2000);
				TakesScreenshot tss = (TakesScreenshot) w;
				FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Parth\\eclipse-workspace\\MavenGroupid\\screenshots\\"+username+" "+password+".png"));
			}	
		}
		w.quit();
	}

}
