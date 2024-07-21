package keyDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyDrivenFileAccount {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/");
		
		FileInputStream file = new FileInputStream("C:\\Users\\Parth\\Downloads\\keyDrivenfileaccount.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
			XSSFRow row = sheet1.getRow(i);
			XSSFCell testStep = row.getCell(0);
			
			keyDrivenRepoFile kdrf = new keyDrivenRepoFile(w);
			switch (testStep.toString()) {
			case "login":
					kdrf.login("demousers", "password");
					break;
			case "saleQuotation":
					try {
						kdrf.saleQuotation();
					} catch (Exception e) {
						System.out.println(e);
						kdrf.screenshot("C:\\Users\\Parth\\eclipse-workspace\\MavenGroupid\\screenshots\\capture.png");
					}
					break;
			case "salesOrderEntry":
					kdrf.salesOrderEntry();
					break;
			case "back":
					Thread.sleep(2000);
					kdrf.back();
					break;
			case "logout":
					kdrf.logout();
					break;
			case "closeBrowser":
					kdrf.closeBrowser();
					break;

			default:
				System.out.println("Invalid step:" +testStep.toString());
				break;
			}
			
			
			
			
		}
		
	}

}
