package google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleAmazon {
	
	@Test
	public void getHandleAmazon() {
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
	
		/*
		 * List<WebElement> menuOptions =
		 * driver.findElements(By.xpath("//*[@class='nav-a  ']"));
		 * System.out.println("Ttoal menu options count="+menuOptions.size()); for (int
		 * i=0; i< menuOptions.size();i++) {
		 * System.out.println("Each options name = "+menuOptions.get(i).getText()); }
		 */
	}

}
