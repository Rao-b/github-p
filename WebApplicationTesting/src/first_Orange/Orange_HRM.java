package first_Orange;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Orange_HRM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		String url ="https://www.facebook.com/";
		
		driver.get(url);
		
	}

}
