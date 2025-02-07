import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class windowNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='blinkingText'][contains(text(),'Free')]")).click();
		Set<String> windows= driver.getWindowHandles(); 
		Iterator<String> it = windows.iterator();
		String parentId= it.next();
		String childId= it.next();
//		switching to child window after clicking on the link and getting text from the page
		driver.switchTo().window(childId);
		String mailID =driver.findElement(By.xpath("//*[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
//		navigating back to parent window and entering text in username
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(mailID);
	}
}

