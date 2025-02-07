package SeleniumLearning;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerceSitePractice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] ProdName = {"Cucumber","Musk Melon","Beans"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ecommerceSitePractice obj = new ecommerceSitePractice();
		obj.addProductToCart(driver, ProdName);
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement cartButton = driver.findElement(By.cssSelector("a[class='cart-icon']"));
		wait2.until(ExpectedConditions.elementToBeClickable(cartButton));
		driver.findElement(By.cssSelector("a[class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoBtn")));
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		wait2.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//span[@class='promoInfo']"))));
		System.out.println("Coupon applied???? " + driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement country = driver.findElement(By.xpath("//select"));
		Select countryDropDown = new Select(country);
		countryDropDown.selectByValue("India");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.quit();
	}
//	below method is used for adding product to cart from the predefined array list
	public  void addProductToCart(WebDriver driver, String[] ProdName)
	{
		int j =0;
		List<WebElement> products= driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i=0; i< products.size();i++)
		{
		String[] name = products.get(i).getText().split("-");
		String formattedName = name[0].trim(); 
		List itemsneededlist = Arrays.asList(ProdName);
		if(itemsneededlist.contains(formattedName))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		/*driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); 
		once product is added to cart, add to cart text changed to added, selenium try to check text in fraction of second for next for loop, so it will not click correct element, 
		so avoid using text directly, try to use other static xpath instead of actual text
		*/
		if(j==ProdName.length)
			break;
		}
		}
	}
}

