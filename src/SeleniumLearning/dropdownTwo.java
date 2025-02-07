package SeleniumLearning;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class dropdownTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println( "before selecting checkbox: " + driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println("after selecting checkbox: "+ driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		List<WebElement> noOfCheckbox= driver.findElements(By.xpath("//*[contains(@class,'home-StudentDiscount')]/a/following-sibling::label"));
		int countvalue =0;
		System.out.println("values of checkboxes are below......");
		for( WebElement count: noOfCheckbox)
		{
			countvalue++;
			 System.out.println(count.getText());
		}
		System.out.println("no of checkboxes are " + countvalue);
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
//		driver.findElement(By.xpath("//div[@id='divpaxinfo']/parent::div/div[3]/div/div[2]/span[@id='hrefIncAdt']"));
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement doneButton = driver.findElement(By.id("spanAudlt"));
		wait.until(ExpectedConditions.elementToBeClickable(doneButton));
		System.out.println("before adding passengers..." +driver.findElement(By.id("divpaxinfo")).getText());
		int i =1;
		for(int j=1;j<4;j++)
		{
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

		}
		/*
		while( i <4) {
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
			i++;
		}
		*/
		driver.findElement(By.id("btnclosepaxoption")).click();
		wait.until(ExpectedConditions.invisibilityOf(doneButton));
		System.out.println("after adding passengers..." +driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		
		
//		driver.quit();
	}
}
