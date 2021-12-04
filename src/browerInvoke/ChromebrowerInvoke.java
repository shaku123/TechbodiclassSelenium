package browerInvoke;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromebrowerInvoke {
public static void main(String[]args) {
	ChromeOptions ch = new ChromeOptions();
	ch.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium jars\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(ch);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	
}
}