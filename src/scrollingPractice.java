import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class scrollingPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//		need to cast the driver  to javascriptexecutor for using java script executor
		JavascriptExecutor js =  (JavascriptExecutor )driver;
//		below line will scroll the webpage
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(Duration.ofSeconds(3));
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=110");
//		List<WebElement> amountValue = driver.findElements(By.xpath("//table[@id='product']/tbody/tr/td[4]"));
		List<WebElement> amountValue = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
//		td:nth-child(4); css selector for writing nth element
		int sum=0;
		for( int i =0; i< amountValue.size();i++)
		{
		sum = sum + Integer.parseInt(amountValue.get(i).getText());
		System.out.println(amountValue.get(i).getText());
		}
		System.out.println("Sum of amount is: " + sum);
		String exp =  (driver.findElement(By.className("totalAmount")).getText().split(":"))[1].trim() ;
		Assert.assertEquals(Integer.parseInt(exp),sum );
		driver.quit();
	}

}
