package UdemyExercises;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class submittingForm_Angular {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//*[@class='form-group']/input[@name='name']")).sendKeys("testaarthi");
		driver.findElement(By.cssSelector(".form-group input[name='email']")).sendKeys("testaarthi@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password@123");
		driver.findElement(By.cssSelector("input[id='exampleCheck1']")).click();
		driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']")).click();
		WebElement genders = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select gender= new Select(genders);
		gender.selectByVisibleText("Female");
		driver.findElement(By.xpath("//label[@for='inlineRadio1'][text()='Student']")).click(); 
		driver.findElement(By.name("bday")).sendKeys("02/02/1997");
		driver.findElement(By.className("btn-success")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3000));
		WebElement alertelement = driver.findElement(By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]"));
		wait.until(ExpectedConditions.visibilityOf(alertelement));
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert alert-success alert-dismissible')]")).getText());
		driver.quit();
	}
}
