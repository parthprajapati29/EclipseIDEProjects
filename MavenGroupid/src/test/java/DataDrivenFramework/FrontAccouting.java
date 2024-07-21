package DataDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FrontAccouting {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Parth\\Desktop\\FrontAccounting testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);	
			String username = row.getCell(0).toString();
			String password = row.getCell(1).toString();
			
			w.get("https://demo.frontaccounting.eu/");
			w.findElement(By.name("user_name_entry_field")).clear();
			w.findElement(By.name("user_name_entry_field")).sendKeys(username);
			w.findElement(By.name("password")).clear();
			w.findElement(By.name("password")).sendKeys(password);

			Thread.sleep(2000);
			w.findElement(By.name("SubmitUser")).click();
			
			try {
				w.findElement(By.linkText("Logout")).click();
			} catch (Exception e) {
				w.navigate().back();
				Thread.sleep(2000);
				TakesScreenshot tss = (TakesScreenshot) w;
				FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Parth\\eclipse-workspace\\MavenGroupid\\screenshots\\"+username+" "+password+".png"));
				
			}
			
		}
		w.close();
	}
	

}
