package browerInvoke;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FireBoxInvoke {
public static void main (String[]args) {
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver.exe");  
//write webdriver.chrome.driver in small letters otherwise runtime error displays
File pathBinary = new File("C:\\Users\\admin\\Downloads\\firefox.exe");
FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
DesiredCapabilities desired = DesiredCapabilities.firefox();
FirefoxOptions options = new FirefoxOptions();
desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS,options.setBinary(firefoxBinary));

 WebDriver driver = new FirefoxDriver(options) ;//WebDriver is interface and ChromeDriver is sub class...i.e, instance of interface so we have to go through subclass.. where all methods implements 
	
	driver.get("https://www.flipkart.com/");
	//driver.close();
}

}
	
	
	
	

