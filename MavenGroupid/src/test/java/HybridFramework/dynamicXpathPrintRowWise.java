package HybridFramework;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicXpathPrintRowWise {
	static WebDriver w;
	public static void main(String[] args) {
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		getRowColValue("Financial Center");
		
	}

	private static void getRowColValue(String struc) {
		int rowCount = w.findElements(By.xpath("//*[contains(@id, 'post-body-1325137018292710854')]/div[1]/div[1]/div[5]/table/tbody/tr/th")).size();
		int row1Count = w.findElements(By.xpath("//*[contains(@id, 'post-body-1325137018292710854')]/div[1]/div[1]/div[5]/table/tbody/tr/td[1]")).size();
		
		for (int i = 1; i <= rowCount; i++) {
			List<WebElement> Structure = w.findElements(By.xpath("//*[contains(@id, 'post-body-1325137018292710854')]/div[1]/div[1]/div[5]/table/tbody/tr/th"));
			for(WebElement struct: Structure) {
				int j=1;
				
				if(struct.getText().equals(struc)) {
					
					String countryValue = w.findElement(By.xpath("//*[contains(@id, 'post-body-1325137018292710854')]/div[1]/div[1]/div[5]/table/tbody/tr["+j+"]/td[1]")).getText();
					System.out.println(countryValue);
					break;
				}else {
					System.out.println(j);
					j= j+1;
					System.out.println(j);

				}
				
			}
			break;
				
		}
	}
		
}

