package link_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args) {
         WebDriver driver = null;
		
		driver = new FirefoxDriver();
		String url= "http://www.newtours.demoaut.com";
		driver.get(url);
		driver.manage().window().maximize();
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		register.click();
		System.out.println(driver.getTitle());
		
	}

}
