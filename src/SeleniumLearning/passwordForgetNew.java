package SeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class passwordForgetNew {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// chrome options start window in maximized mode explicitly
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String username = "vaiddd";
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
//		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("error msg for incorrect password is below: \n" + driver
				.findElement(By.xpath("//p[@class='error'][contains(text(),'* Incorrect username or password')]"))
				.getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys(username);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vaidjk222@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("vai2001@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9122101234");
		driver.findElement(By.className("reset-pwd-btn")).click();
		passwordForgetNew obj = new passwordForgetNew();
		String PassWord = obj.getPassword(driver);
		String infomsg = driver
				.findElement(By.xpath(
						"//p[contains(text(),\"Please use temporary password 'rahulshettyacademy' to Login.\")]"))
				.getText();
		System.out.println("the temporary password info msg is below: \n" + infomsg);
		String[] list = infomsg.split("\'");
		for (String i : list) {
			System.out.println(i + "*");
		}
		String tempPassword = list[1];
		// clicking on login button after getting temporary password
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys(username);
//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(tempPassword);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(PassWord);

		/*
		 * Actions action = new Actions(driver); WebElement we =
		 * driver.findElement(By.className("signInBtn"));
		 * action.moveToElement(we).click().build().perform();
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement signIn = driver.findElement(By.xpath("//button[@type='submit']"));
		wait.until(ExpectedConditions.elementToBeClickable(signIn));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
//		[ above line used for locator]
		signIn.click();
//		"//p[contains(text(),'You are successfully logged in.')]"
		Thread.sleep(1000);
//		String actual = driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + username + ",");
		String actual = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(actual, "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.xpath("//button[text()='Log Out']")).getText(), "LOG OUT");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();
	}

	public String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement forgotPwd = driver.findElement(By.xpath("//h2[text()='Forgot password']"));
		wait.until(ExpectedConditions.visibilityOf(forgotPwd));
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click();
		Thread.sleep(1000);
		String passwordText = driver.findElement(By.className("infoMsg")).getText();
//		String splittedvalues[] = passwordText.split("\'");
//		String resettedPwd= splittedvalues[0];
//		return resettedPwd;

		String[] passwordArray = passwordText.split("'");

		// String[] passwordArray2 = passwordArray[1].split("'");

		// passwordArray2[0]
//
		String password = passwordArray[1].split("'")[0];

		return password;

	}
}
