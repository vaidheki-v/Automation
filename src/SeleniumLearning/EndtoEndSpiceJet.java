package SeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class EndtoEndSpiceJet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		WebElement source = driver.findElement(By.xpath("//a[contains(text(),'Chennai')]"));
		wait.until(ExpectedConditions.elementToBeClickable(source));
		source.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h3[text()='India'])[2]")));
		WebElement destination = driver.findElement(By.xpath("(//a[@value='BLR'])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(destination));
		destination.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Mo']")));
//		selecting current date displayed on the screen
		driver.findElement(By.cssSelector(".ui-state-active")).click();	
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		WebElement doneButton = driver.findElement(By.id("spanAudlt"));
		wait.until(ExpectedConditions.elementToBeClickable(doneButton));
		System.out.println("before adding passengers..." +driver.findElement(By.id("divpaxinfo")).getText());
		for(int j=1;j<4;j++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("after adding passengers..." +driver.findElement(By.id("divpaxinfo")).getText());

		wait.until(ExpectedConditions.invisibilityOf(doneButton));
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
			System.out.println("return trip is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("return trip is not enabled");
			Assert.assertFalse(false);
		}
		WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select currencyDropDown = new Select(currency);
		currencyDropDown.selectByIndex(1);
		Assert.assertEquals(currencyDropDown.getFirstSelectedOption().getText(), "INR");
		driver.findElement(By.xpath("//span[@class='btn-find-flight-home']/input[@type='submit']")).click();
//		WebElement loading = driver.findElement(By.xpath("//*[@id='Loader']/div[2]/p"));
//		wait.until(ExpectedConditions.visibilityOf(loading));
//		System.out.println(driver.findElement(By.className("loading-text")).getText());
//		System.out.println(driver.findElement(By.xpath("//*[@id='Loader']/div[2]/p/text()")).getText());
	}

}
