import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class calendarGeneric {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "6";
		String date = "30";
		String year = "2027";
		String[] ArrayDate = {month,date,year};
		String expectedDate = month + "/ " + date + "/ " + year;
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.className("react-date-picker__inputGroup")).click();
		driver.findElement(By.className("react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//span[contains(@class,'react-calendar__navigation__label__labelText')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'react-calendar__tile')][text()='"+year+"']")).click();
		driver.findElement(By.xpath("//div[@class='react-calendar__year-view__months']/button["+month+"]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'react-calendar__month-view__days__day')]/abbr[text()='"+date+"']")).click();
		List<WebElement> datevalue =driver.findElements(By.xpath("//input[contains(@class,'react-date-picker__inputGroup__input')]"));
		String enteredDate = datevalue.get(0).getDomAttribute("value")+ "/ " + datevalue.get(1).getDomAttribute("value") + "/ " + datevalue.get(2).getDomAttribute("value");
		System.out.println("The Entered date is: " + datevalue.get(0).getDomAttribute("value")+ "/ " + datevalue.get(1).getDomAttribute("value") + "/ " + datevalue.get(2).getDomAttribute("value"));
//		storing date in date formate and comparing
		Assert.assertEquals(enteredDate, expectedDate);
//		comparing date value separately in for loop
		for (int i =0;i<datevalue.size();i++) 
		{
			Assert.assertEquals(datevalue.get(i).getDomAttribute("value"), ArrayDate[i]);
		}
		driver.quit();
	}
}
