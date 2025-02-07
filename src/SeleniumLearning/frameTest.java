package SeleniumLearning;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("printing the no of frames in app: " + driver.findElements(By.tagName("iframe")).size());
//		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(1);
//		driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		System.out.println("content in drag box before dropping..." + driver.findElement(By.id("draggable")).getText());
		System.out.println("content in drop box before dropping..." + driver.findElement(By.id("droppable")).getText());
		a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		System.out.println("content in drop box after dropping..." + driver.findElement(By.id("droppable")).getText());
		 //leave frame
        driver.switchTo().defaultContent();
		driver.quit();
	}

}
