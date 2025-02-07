package SeleniumLearning;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class handlingDropdowns {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//dropdown with select tag - standard dropdown and static
		WebElement currency = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select currencyDropDown = new Select(currency);
		currencyDropDown.selectByIndex(1);
		Assert.assertEquals(currencyDropDown.getFirstSelectedOption().getText(), "INR");
//		changing dropdown value to AED
		currencyDropDown.selectByVisibleText("AED");
		System.out.println(	currencyDropDown.getFirstSelectedOption().getText());
		currencyDropDown.selectByValue("USD");
		System.out.println(	currencyDropDown.getFirstSelectedOption().getText());
		currencyDropDown.selectByContainsVisibleText("IN");
		System.out.println(	currencyDropDown.getFirstSelectedOption().getText());
		System.out.println("checking if return trip is enabled for one way trip?...");
//		Assert.assertEquals( driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled(),false);
//		Assert.assertEquals( driver.findElement(By.className("picker-second")).isEnabled(),true);
		System.out.println(	driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
			System.out.println("return trip is enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("return trip is not enabled");
			Assert.assertTrue(false);
		}
//		selecting round trip
		System.out.println("Now, Selecting round trip..");
		System.out.println("checking if return trip is enabled for round trip?...");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		Assert.assertEquals( driver.findElement(By.className("picker-second")).isEnabled(),true);
//		isenabled method is not working correctly for some websites, do below workaround
		driver.findElement(By.id("Div1")).getDomAttribute("opacity");
		System.out.println(	driver.findElement(By.id("Div1")).getDomAttribute("style"));
		if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
		{
			System.out.println("return trip is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("return trip is not enabled");
			Assert.assertTrue(false);
		}
		driver.quit();
	}
}
