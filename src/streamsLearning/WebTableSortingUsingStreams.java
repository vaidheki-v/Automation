package streamsLearning;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebTableSortingUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		WebElement numberOfItems = driver.findElement(By.id("page-menu"));
		Select select = new Select(numberOfItems);
		select.selectByValue("5");
		// click on column 
		driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
		List<WebElement> products = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		// capture all visible webelements into list using stream
		List<String> originalList = products.stream().map(s->s.getText()).collect(Collectors.toList());		
		// sort the captured list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		//compare the two lists and check values
		Assert.assertTrue(originalList.equals(sortedList));
		List<String> price;
		//pagination in web page
		do
		{
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td[1]"));

		price = rows.stream().filter(s->s.getText().contains("Wheat")).map(s->getPriceOfProduct(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
		driver.quit();
	}

	private static  String getPriceOfProduct(WebElement s) {
		// TODO Auto-generated method stub
	String priceValue=	 s.findElement(By.xpath("following-sibling::td[1]")).getText();
	return priceValue;
	}

}
