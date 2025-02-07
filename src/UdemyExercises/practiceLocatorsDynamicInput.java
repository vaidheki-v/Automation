package UdemyExercises;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class practiceLocatorsDynamicInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
//		1) Select any checkbox 
		driver.findElement(By.id("checkBoxOption2")).click();
		System.out.println("is checkbox selected? " + 		driver.findElement(By.id("checkBoxOption2")).isSelected());
		String value = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println("fetched value is: " + value);
//		2) grab the label of the selected checkbox // put variable
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		3) Select and optin in dropdown. Here option to select should come from step 2 // do dynamically
		Select select = new Select(dropdown);
		select.selectByVisibleText(value);
//		4) enter the step 2 grabbed label text in Editbox
		driver.findElement(By.id("name")).sendKeys(value);
//		5) click on Alert and then verify if text grabbed from step 2 is present in the pop up message
		driver.findElement(By.id("alertbtn")).click();
		String alertMessage =driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		if(alertMessage.contains(value))
		{
			System.out.println("alert message validation is success");
		}
		else
		{
			System.out.println("validation is failed");

		}
		driver.quit();
	}

}
