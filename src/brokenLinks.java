import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenLinks {
	public static void main(String[] args) throws  IOException, URISyntaxException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// broken url
		// Java methods will call the URLs and get you the status code
//		String url = driver.findElement(By.cssSelector("a[href*='soapui']")).getDomAttribute("href");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		for (WebElement link : links) {
			String url = link.getDomAttribute("href");
			if (url == null || url.isEmpty())
			{
				System.out.println("URL is empty or null for link: " + link.getText());
				continue;
			}
			try 
			{
				URI uri = new URI(url);
				HttpURLConnection conn = (HttpURLConnection) uri.toURL().openConnection(); // Convert URI to URL
				conn.setRequestMethod("HEAD");
				conn.connect();
				int respCode = conn.getResponseCode();
				System.out.println(respCode);
				a.assertTrue((respCode < 400), "The Link Test " + link.getText() + " is broken with code " + respCode);
				
				/*
				 * if (respCode > 400) 
				{
					System.out.println("The Link Test " + link.getText() + " is broken with code " + respCode);
					Assert.assertTrue(false);
				
				}
				*/
			}
			catch (Exception e)
			{
				System.out.println("Error with link: " + url + " - " + e.getMessage());
			}
		}
		a.assertAll();
		driver.quit();
	}
}
