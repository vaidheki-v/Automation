package streamsLearning;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class filtersInStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		String word="apple";
		driver.findElement(By.id("search-field")).sendKeys("Apple");
		List<WebElement> availableProducts = driver.findElements(By.xpath("//tbody/tr/td[1]"));
//		List<WebElement> productsName = availableProducts.stream().filter(s->s.getText().contains("apple")).collect(Collectors.toList());
//		Assert.assertEquals(availableProducts.size(), productsName.size());
		
		 // Normalize the text by converting to lower case and removing spaces
        List<WebElement> productsName = availableProducts.stream()
                .filter(s -> s.getText().toLowerCase().replaceAll("\\s", "").contains(word.toLowerCase().replaceAll("\\s", "")))
                .collect(Collectors.toList());

        // Check if "apple" is present in the productsName list ignoring case and spaces
        boolean isApplePresent = productsName.stream()
                .anyMatch(s -> s.getText().toLowerCase().replaceAll("\\s", "").contains(word.toLowerCase().replaceAll("\\s", "")));

        System.out.println("Is 'apple' present: " + isApplePresent);
		System.out.println("sie of original: " + availableProducts.size());
		System.out.println("sie of filter list: " + productsName.size());
		Assert.assertEquals(availableProducts.size(), productsName.size());
		driver.quit();
	}
}
