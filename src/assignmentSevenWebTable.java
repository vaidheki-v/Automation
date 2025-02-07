import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentSevenWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");
		List<WebElement> rows =  driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		List<WebElement> columns =  driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[1]/th"));
		System.out.println("No of rows in table is : " + rows.size());
		System.out.println("No of rows in table is : " + columns.size());
		List<WebElement> secondRowData =  driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		System.out.println("Displaying second row of data below...");
		for( int i =0; i<secondRowData.size();i++)
		{
			System.out.println(secondRowData.get(i).getText());
		}
	}

}
