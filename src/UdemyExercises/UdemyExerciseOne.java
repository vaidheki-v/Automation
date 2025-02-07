package UdemyExercises;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UdemyExerciseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(	"checkbox selected...." +driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(	"checkbox selected...." +driver.findElement(By.id("checkBoxOption1")).isSelected());
		int checkboxCount =0;
		List<WebElement> checkboxvalues=  driver.findElements(By.xpath("//div[@id='checkbox-example'] //label"));
		for (WebElement ele : checkboxvalues)
		{
			System.out.println( "checkbox values are below...." +ele.getText());
		}
		System.out.println("count of checkboxes are: " +checkboxvalues.size());

	}

}
