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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.io.FileHandler;

public class saucedemo {

	public static void main(String[] args) throws Exception {
		WebDriver w;
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Parth\\Desktop\\hybridsaucedemo.xlsx");
		XSSFWorkbook workbook  = new XSSFWorkbook(fs);
		XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		XSSFSheet sheet2 = workbook.getSheet("Sheet2");
		
		for (int i = 1; i <= sheet2.getLastRowNum(); i++) {
			XSSFRow row1 = sheet2.getRow(i);
			XSSFCell uname = row1.getCell(0);
			XSSFCell pass = row1.getCell(1);
			XSSFCell fname = row1.getCell(2);
			XSSFCell lname = row1.getCell(3);
			XSSFCell zip = row1.getCell(4);
			
			w = new ChromeDriver();
			w.manage().window().maximize();
			w.get("https://www.saucedemo.com/v1/");
			
			for (int j = 1; j <= sheet1.getLastRowNum(); j++) {
				XSSFRow row2 = sheet1.getRow(j);
				XSSFCell step = row2.getCell(0);
				sauceRepo sR = new sauceRepo(w);
				
				switch (step.toString()) {
				case "login":
					try {
						sR.login(uname.toString(), pass.toString());
					} catch (Exception e) {
						System.out.println(e);
					}
					break;
				
				case "inventory":
					try {
						sR.inventory();
					} catch (Exception e) {
						System.out.println(e);
					}
					break;
					
				
				case "cart":
					try {
						sR.cart();
					} catch (Exception e) {
						System.out.println(e);
					}
					
					break;
				
				case "checkoutstep1":
					try {
						sR.checkoutstep1(fname.toString(), lname.toString(), zip.toString());
					} catch (Exception e) {
						System.out.println(e);
					}
					break;
				
				case "checkoutstep2":
					try {
						sR.checkoutstep2();
					} catch (Exception e) {
						System.out.println(e);
					}
					break;
				
				case "checkoutcomplete":
					try {
						sR.checkoutcomplete();
					} catch (Exception e) {
						System.out.println(e);
					}
					break;
				
				case "logout":
					try {
						sR.logout();
					} catch (Exception e) {
						System.out.println(e);
					}
					
					break;
					
				}
			}			
			w.close();
		}
	

	}
}






