package UdemyExercises;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class loginpagePractise {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String username = driver.findElement(By.xpath("(//div[@class='form-group']/p/b/i)[1]")).getText();
		String password = driver.findElement(By.xpath("(//div[@class='form-group']/p/b/i)[2]")).getText();
		enterFormDetails(driver, username, password);
//		driver.quit();
		}
	public static void enterFormDetails(WebDriver driver, String username, String password)
	{
	driver.findElement(By.id("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@value='user']/parent::label")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
	System.out.println("Warning message is: " + driver.findElement(By.cssSelector(".modal-body p")).getText());
	driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
	driver.findElement(By.id("terms")).click();
	WebElement dropdown = driver.findElement(By.xpath("//select"));
	Select dropdownvalue = new Select(dropdown);
	dropdownvalue.selectByValue("consult");
	driver.findElement(By.id("signInBtn")).click();
	wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
	wait.until(ExpectedConditions.titleContains("ProtoCommerce"));
	List<WebElement> productsavailable = driver.findElements(By.xpath("//h4/parent::div/following-sibling::div/button"));
	for (int i=0; i<productsavailable.size();i++)
	 {
		 driver.findElements(By.xpath("//h4/parent::div/following-sibling::div/button")).get(i).click();
	 }
	driver.findElement(By.cssSelector("a.btn-primary")).click();
	driver.findElement(By.cssSelector("button.btn-success")).click();
	/*
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Purchase']")));
	driver.findElement(By.id("country")).sendKeys("india");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='suggestions']/ul/li/a[text()='India']")));
	driver.findElement(By.xpath("//div[@class='suggestions']/ul/li/a[text()='India']")).click();
	driver.findElement(By.id("checkbox2")).click();
	driver.findElement(By.xpath("//input[@value='Purchase']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'alert')]")));
	System.out.println(" order placed???" + driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText());
	*/
	}
}


