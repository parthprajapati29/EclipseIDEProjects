import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class techlistictable1rorcolumn {
	static WebDriver w;
	public static void main(String[] args) {
		w = new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		getRowColValue("Google");

	}
	private static void getRowColValue(String str) {
		WebElement structureRow = w.findElement(By.xpath("//td[contains(., '"+str+"')]"));
		String columnRow = structureRow.findElement(By.xpath("./td[1]")).getText();
				System.out.println(columnRow);
		
	}

}
