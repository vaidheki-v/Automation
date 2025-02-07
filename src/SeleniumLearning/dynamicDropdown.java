package SeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		WebElement source = driver.findElement(By.xpath("//a[contains(text(),'Chennai')]"));
		wait.until(ExpectedConditions.elementToBeClickable(source));
		source.click();
		WebElement destination = driver.findElement(By.xpath("//a[@value='BLR']"));
		wait.until(ExpectedConditions.elementToBeClickable(destination));
		destination.click();
		//	xpath for clicking calendar button is below
		//	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/following-sibling::button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mo']")));
//		selecting current date displayed on the screen
		driver.findElement(By.cssSelector(".ui-state-active")).click();
		driver.quit();
		
//		need to check on below lines for clarifications..
//		WebElement destination = driver.findElement(By.xpath("//a[contains(text(),'Bengaluru')]"));
//		using below line for traversing to element from parent , instead of using indexes
//		WebElement destination = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //a[@value='BLR']"));
//		WebElement destination = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/table //ul[1]/li[6]/a"));
		
		}
}
