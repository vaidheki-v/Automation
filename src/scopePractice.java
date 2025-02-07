import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scopePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1. count of links in entire webpage
		System.out.println( "No of links present in entire web page is: "+ driver.findElements(By.tagName("a")).size());
		//2. count of links in footer section
		WebElement headerdriver = driver.findElement(By.cssSelector(".jumbotron"));
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("No of links present in header section of web page is:" + headerdriver.findElements(By.tagName("a")).size());
		System.out.println("No of links present in footer section of web page is:" + footerdriver.findElements(By.tagName("a")).size());
		//3. count of columns in footer section
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("No of links present in columns section of footer is:" + columndriver.findElements(By.tagName("a")).size());
		 List<WebElement> columnlinks= columndriver.findElements(By.tagName("a"));
		 Actions a = new Actions(driver);
		// 4. click on each of  the links in column driver and checking if it is 
		 //open all tabs in new tab
		for ( int i=1; i<columnlinks.size();i++)
		{
		String clickLinkOnNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		columnlinks.get(i).sendKeys(clickLinkOnNewTab);
		//Thread.sleep(Duration.ofSeconds(10));
		
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		//solution using for loop
		/* 
		for(int i =0; i<windows.size();i++)
		{
			String currentwindow = it.next();
			String currentTitle = driver.switchTo().window(currentwindow).getTitle();
			System.out.println("title of the window " + (i+1) +" " + currentTitle);
	
		}
		*/
		//print title of all the opened tabs
		while(it.hasNext())
		{
			String currentwindow = it.next();
			driver.switchTo().window(currentwindow).getTitle();
			System.out.println("title of the window is: " + driver.getTitle());
		}
		driver.quit();
	}
}

