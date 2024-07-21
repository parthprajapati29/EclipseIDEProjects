import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistic {
	static WebDriver w;
	public static void main(String[] args) {
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		getRowColValue("Taipei 101");

	}

	private static void getRowColValue(String struc) {
		
		WebElement StructureRow = w.findElement(By.xpath("//tr[contains(.,'"+struc+"')]"));
        String countryRow = StructureRow.findElement(By.xpath(".//td[1]")).getText();
        System.out.println(countryRow);
	}	
}
	
