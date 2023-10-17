package com.assignment;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	
	protected static WebDriver driver;
	
	@Test
//	public static void main(String[] args) throws InterruptedException {
	public void AddRemoveElements() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		Assignment obj = new Assignment();
		obj.clickAddElement(4);
	//	System.out.println("got the click.");
		
	//	List<WebElement> links= driver.findElements(By.xpath("//*[@class='added-manually']"));
	//	int linkCount= links.size();
		int linkCount=obj.nDelete();
		System.out.println("Number of Delete buttons "+ linkCount);
		Assert.assertEquals(4,linkCount);
		
		driver.quit();
	}
		
		public void clickAddElement(int n) throws InterruptedException{
			
			for(int i =1; i<=n; i++) {
				driver.findElement(By.xpath("//*[contains(text(),'Add Element')]")).click();
				Thread.sleep(1000);
			}	
		}
		
		public int nDelete() {
			
			List<WebElement> links= driver.findElements(By.xpath("//*[@class='added-manually']"));
			int linkCount= links.size();
			return linkCount;
			
		}
		
	

}
