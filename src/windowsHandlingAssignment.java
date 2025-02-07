import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class windowsHandlingAssignment {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.findElement(By.linkText("Multiple Windows")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlContains("windows"));
	driver.findElement(By.linkText("Click Here")).click();
	Set<String> windows =driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String parent = it.next();
	String child = it.next();
//	switching to child window after clicking on the link and getting text from the page
	driver.switchTo().window(child);
	System.out.println("Text present in the new window is: " + driver.findElement(By.tagName("h3")).getText());
//	switching to parent window 
	driver.switchTo().window(parent);
	System.out.println("Text present in the parent window is: " + driver.findElement(By.tagName("h3")).getText());
	driver.quit();
}
}