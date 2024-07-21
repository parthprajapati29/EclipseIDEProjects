package programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpathPrintRowWise {
	static WebDriver w;
	public static void main(String[] args) {
		w = new ChromeDriver();
		w.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		getRowColValue("Taipei 101");
		
	}

	private static void getRowColValue(String struc) {
		int rowCount = w.findElements(By.xpath("//*[contains(@id, 'post-body-1325137018292710854')]/div[1]/div[1]/div[5]/table/tbody/tr/th")).size();
		int row1Count = w.findElements(By.xpath("//*[contains(@id, 'post-body-1325137018292710854')]/div[1]/div[1]/div[5]/table/tbody/tr/td[1]")).size();
		
		for (int i = 1; i < rowCount; i++) {
			for (int j = 1; j <=row1Count; j++) {
				String StructureValue = w.findElement(By.xpath("//*[contains(@id, 'post-body-1325137018292710854')]/div[1]/div[1]/div[5]/table/tbody/tr/th")).getText();
				if (StructureValue.equals(struc)) {
					String countryValue = w.findElement(By.xpath("//*[contains(@id, 'post-body-1325137018292710854')]/div[1]/div[1]/div[5]/table/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
					System.out.println(countryValue);
					break;
				}
			}
		}
		
	}
}




