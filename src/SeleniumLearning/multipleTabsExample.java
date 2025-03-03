package SeleniumLearning;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class multipleTabsExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		//landing into first webpage in a tab
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//open new window 
		driver.switchTo().newWindow(WindowType.WINDOW);
		//navigate the driver control to second tab
		Set<String> windows = driver.getWindowHandles(); //get the no of windows
		Iterator it = windows.iterator(); 
		String parentWindowId = (String) it.next(); // navigate to parent window using iterator
		String childWindowId =(String) it.next(); // navigate to child window using iterator
		driver.switchTo().window(childWindowId);
		driver.get("https://courses.rahulshettyacademy.com/#/index");
		String nameOfFirstCourse =driver.findElement(By.xpath("//div[@class='container']/h2[text()='Featured Courses']/parent::div/div[1]/div//a/div/div[2]")).getText();
		driver.switchTo().window(parentWindowId);
		WebElement nameField =driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input"));
		nameField.sendKeys(nameOfFirstCourse);
		//get the partial screenshot where particular element is located
		File file = nameField.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("C:\\Users\\vaidhe\\Downloads\\logo.png"));
	}

}
