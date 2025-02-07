import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handlingHTTPSissue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		//proxy example
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:portnumber");
		options.setCapability("proxy", proxy);
		// download locaton
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		//block popup
		options.setExperimentalOption("excludeSwitches",
			     Arrays.asList("disable-popup-blocking"));
		//accept https insecure message
		options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(options);
		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","C:/Users/vaidhe/Downloads/edgedriver-win64_new/msedgedriver.exe");
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
	}

}
