package UdemyExercises;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class nestedFrameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Nested Frames")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("nested"));		
		//navigate to top frame and print no of frames inside that
		driver.switchTo().frame("frame-top");
		System.out.println( "No of frames inside top frame is " + driver.findElements(By.tagName("frame")).size());
        //store the middleframe as web element and then navigate to that frame
//		WebElement middleFrame =driver.findElement(By.xpath("//frameset[@name='frameset-middle']/frame[@name='frame-middle']"));
		driver.switchTo().frame(1);
		//below line will directly navigate to middle frame frame main frame
		//driver.switchTo().frame("frame-top").switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.quit();
	}
}
