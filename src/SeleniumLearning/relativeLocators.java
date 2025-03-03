package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class relativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement nameEditBox = driver.findElement(By.xpath("//div/input[@name='name']"));
		//above example
		String text = driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText();
//		WebElement nameBox = driver.findElement(RelativeLocator.with(By.tagName("label")).above(nameEditBox));
		System.out.println( "displaying text above the nameEditBox: " +text);
		// left of example
		WebElement description = driver.findElement(By.xpath("//label[@for='exampleCheck1']"));
		WebElement checkbox = driver.findElement(RelativeLocator.with(By.tagName("input")).toLeftOf(description));
		checkbox.click();
		// right of example
		WebElement radioButton1 = driver.findElement(By.id("inlineRadio1"));
		String textToRightOfradioButton1=driver.findElement(RelativeLocator.with(By.tagName("label")).toRightOf(radioButton1)).getText();
		System.out.println("displaying text present right to the radioButton1: " + textToRightOfradioButton1);
		// below example
		WebElement dateOfBirth = driver.findElement(By.xpath("//label[@for='dateofBirth']"));
		System.out.println(	 "displaying text below the dateOfBirth: " + driver.findElement(with(By.tagName("input")).below(dateOfBirth)).getDomAttribute("type"));
		driver.findElement(with(By.tagName("input")).below(dateOfBirth)).click();
		driver.quit();
	}

}
