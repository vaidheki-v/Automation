package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class heightAndWidthOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//get height and width
		WebElement nameField =driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input"));
	System.out.println("height of element Name is: " +nameField.getRect().getDimension().getHeight());	
	System.out.println("width of element Name is: " + nameField.getRect().getDimension().getWidth());	
	}

}
