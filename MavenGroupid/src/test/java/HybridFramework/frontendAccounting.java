package HybridFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class frontendAccounting {

	public static void main(String[] args) throws Exception {

		WebDriver w;
		FileInputStream fs = new FileInputStream("C:\\Users\\Parth\\Desktop\\HybridFrontAccount.xlsx");
		XSSFWorkbook workbook  = new XSSFWorkbook(fs);
		XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		XSSFSheet sheet2 = workbook.getSheet("sheet2");
		
		for (int j = 1; j <= sheet1.getLastRowNum(); j++) {
			XSSFRow row1 = sheet1.getRow(j); 
			XSSFCell uname = row1.getCell(0);
			XSSFCell pass = row1.getCell(1);
			w = new ChromeDriver();
			w.manage().window().maximize();
			w.get("https://demo.frontaccounting.eu/");
				
			for (int i = 1; i <= sheet2.getLastRowNum(); i++) {
				XSSFRow row = sheet2.getRow(i); 
				XSSFCell rowSheet2 = row.getCell(0);		
					
				frontendRepo fer = new frontendRepo(w);
				switch (rowSheet2.toString()) {
					case "login":
						fer.login(uname.toString(),pass.toString());		
						break;
					case "saleQuotation":
							try {
								fer.saleQuotation();
							} catch (Exception e) {
								w.navigate().back();
								TakesScreenshot tss = (TakesScreenshot) w;
								FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Parth\\eclipse-workspace\\MavenGroupid\\screenshots\\"+uname+" "+pass+".png"));
							}
							Thread.sleep(2000);
							break;
					case "salesOrderEntry":
							fer.salesOrderEntry();
							break;
					case "back":
							Thread.sleep(2000);
							fer.back();
							break;
					case "logout":
							fer.logout();
							break;
					case "closeBrowser":
							fer.closeBrowser();
							break;
	
//					default:
//						System.out.println("Invalid step:" +rowSheet2.toString());
//						break;
				}
	
				}	
			

		}	

	}
}
