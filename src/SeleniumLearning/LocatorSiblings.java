package SeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorSiblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement login = driver.findElement(By.xpath("//header/div/a/following-sibling::button[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		driver.findElement(By.xpath("//header/div/a/following-sibling::button[1]")).click();
		System.out.println(driver.findElement(By.xpath("//header/div/a/following-sibling::button[1]")).getText());
		driver.close();
	}

}
