import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ForgotPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// chrome options start window in maximized mode explicitly
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("vaidyyy");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
//		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("error msg for incorrect password is below: \n" + driver
				.findElement(By.xpath("//p[@class='error'][contains(text(),'* Incorrect username or password')]"))
				.getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("vaidyyy");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vaidjk222@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9122101234");
		driver.findElement(By.className("reset-pwd-btn")).click();

		String infomsg = driver
				.findElement(By.xpath(
						"//p[contains(text(),\"Please use temporary password 'rahulshettyacademy' to Login.\")]"))
				.getText();
		System.out.println("the temporary password info msg is below: \n" + infomsg);
		String[] list = infomsg.split("\'");
//		for(String i : list) {
//			System.out.println(i);
//		}
		String tempPassword = list[1];
		// clicking on login button after getting temporary password
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("vaidyyy");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(tempPassword);

		Actions action = new Actions(driver);
		WebElement we = driver.findElement(By.className("signInBtn"));
		action.moveToElement(we).click().build().perform();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		System.out.println(
				driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText());
		driver.quit();

	}
}
