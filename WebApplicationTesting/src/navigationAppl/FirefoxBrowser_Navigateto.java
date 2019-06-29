package navigationAppl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirefoxBrowser_Navigateto {

	public static void main(String[] args) {
        
		WebDriver driver = null;
		
		driver = new FirefoxDriver();
		driver.get("http://bing.com");
		driver.get("http://facebook.com");
		driver.quit();
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		WebDriver d= null;
		d= new ChromeDriver();
		d.get("http://facebook.com");

	}

}