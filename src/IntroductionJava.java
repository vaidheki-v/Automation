//import Web

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionJava {

	public static void main(String[] args) 
	{
//		chrome driver
		
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println("Title of the webpage is " + driver.getTitle());
		System.out.println("Current URL is " + driver.getCurrentUrl());
		driver.quit();
		
		
		/* firefox driver
		System.setProperty("webdriver.gecko.driver","C:/Users/vaidhe/Desktop/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println("Title of the webpage is " + driver.getTitle());
		System.out.println("Current URL is " + driver.getCurrentUrl());
		driver.quit();
	 */
		// edge driver
	/*
		System.setProperty("webdriver.edge.driver","C:/Users/vaidhe/Downloads/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println("Title of the webpage is " + driver.getTitle());
		System.out.println("Current URL is " + driver.getCurrentUrl());
		driver.quit();
		*/
		
	}
}
