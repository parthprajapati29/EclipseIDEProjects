package keyDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.io.FileHandler;

public class flipcartTrycatchwithscreenshot {
	public static void main(String[] args) throws Exception{	
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		
		FileInputStream file = new FileInputStream("C:\\Users\\Parth\\Downloads\\keydrivenFlipkart.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		
		for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
			XSSFRow row = sheet1.getRow(i);
			XSSFCell testStep = row.getCell(0);
			flipkartRepo fr = new flipkartRepo(w);
			
			try {
				switch (testStep.toString()) {
					case "searchproduct":
						fr.searchproduct();
						break;
						
					case "windowhandle":
						fr.windowHandling();
						break;
						
					case "backOperation":
						fr.backOperation();
						break;
						
					case "productOpen1":
						fr.productOpen1();
						break;
						
					case "productOpen2":
						fr.productOpen2();
						break;	
						
					case "windowhandle2":
						fr.windowHandling2();
						break;
						
					case "placeorder":
						fr.placeorder();
						break;
						
					case "closeBrowser":
						fr.closeBrowser();
						break;
						
					default:
							System.out.println("Invalid step: "+testStep.toString());
						break;
				}
			} catch (Exception e) {
				System.out.println("exeption :" +e);
				Thread.sleep(2000);
				fr.Screenshot();
			}
			
			
		}
	}



}
