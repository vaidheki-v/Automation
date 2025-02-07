package SeleniumLearning;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginSiteInWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// chrome options start window in maximized mode explicitly
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		below line will maximize the current window
//		driver.manage().window().maximize();

//		WebDriverWait wait = new WebDriverWait(driver, 3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("opentab")).click();
		ArrayList<String> tabs = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.close();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.quit();
	}

}
