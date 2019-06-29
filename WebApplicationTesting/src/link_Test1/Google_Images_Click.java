package link_Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Images_Click {

	public static void main(String[] args) {
WebDriver driver = null;
		
		driver = new FirefoxDriver();
		String url= "https://www.google.com/";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement register = driver.findElement(By.linkText("Gmail"));
		register.click();
		System.out.println(driver.getTitle());

	}

}
