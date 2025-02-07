package SeleniumLearning;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String name="testname";
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//just ok alert button
		driver.findElement(By.cssSelector("#name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println("Alert message is: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
//		ok and cancel alert button
		driver.findElement(By.cssSelector("#name")).sendKeys("aarthi");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println("Alert message is: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}
}
