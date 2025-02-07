package SeleniumLearning;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluentWaitPractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Dynamic Loading")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.urlContains("dynamic_loading"));
		driver.findElement(By.xpath("//a[contains(text(),'Example 1')]")).click();
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//h4[contains(text(),'Example 1')]/parent::div/div[@id='start']"))));
		System.out.println(driver.findElement(By.id("start")).getText());
		//fluent wait class implements the Wait Interface and explcitly mention the webdriver
		driver.findElement(By.xpath("//h4[contains(text(),'Example 1')]/parent::div/div[@id='start']/button")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver> (driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
		WebElement foo = wait.until
				
			(new Function<WebDriver, WebElement>() 
			{
		     public WebElement apply(WebDriver driver)
		     {
		    	 if(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) 
		    	 {
				       return driver.findElement(By.xpath("//div[@id='finish']/h4"));
		    	 }
		    	 else
		    	 {
		    		 return null;
		    	 }
		    	 
		     }
		     }
		);
//		driver.findElement(By.xpath("//h4[contains(text(),'Example 1')]/parent::div/div[@id='start']/button")).click();
//		driver.findElement(By.xpath("//h4[contains(text(),'Example 1')]/parent::div/div[@id='start']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());
	}

}
