package link_Test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Homepage_Linkscripts {

	public static void main(String[] args) {
WebDriver driver = null;
		
		driver = new FirefoxDriver();
		String url= "http://www.newtours.demoaut.com";
		driver.get(url);
		driver.manage().window().maximize();
		 List<WebElement>links =driver.findElements(By.tagName("a"));
		 int links_count= links.size();
		 System.out.println("The Total number of links on NewTours home pages " + links_count );
		 driver.quit();
		

	}

}
