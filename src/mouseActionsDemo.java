import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActionsDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		//moves to specific element
		WebElement move =driver.findElement(By.id("nav-link-accountList"));
		//a.moveToElement(move)).build().perform();
		a.moveToElement(driver.findElement(By.name("field-keywords"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
		
		//		driver.quit();
	}
}
