import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class miscellaneousChromeoptions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//delete cookies
//		driver.manage().deleteAllCookies();
		
		// if we delete some session cookie, and try to click on anything on page, it should come to login page
		// #1: delete any cookie
//		driver.manage().deleteCookieNamed("sessionKey");
		//#2: click on any link
		//#3: navigate to login page - verify url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//#4: take screenshot
		// method 'getScreenshotAs' will be visible only if we case the driver object to  takesScreenshot
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\vaidhe\\screenshot.png"));
		driver.quit();
	}
}
