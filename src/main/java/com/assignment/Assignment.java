package com.assignment;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	
	protected static WebDriver driver;
	
	@Test
	public void AddRemoveElements() throws InterruptedException {
		//initializing Driver
		driver = new ChromeDriver();
		
		//Navigating test site
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		Assignment obj = new Assignment();
		obj.clickAddElement(4);
		int linkCount=obj.nDelete();
		System.out.println("Number of Delete buttons "+ linkCount);
		
		//Asserting opened "Delete button" count
		Assert.assertEquals(4,linkCount);
		
	}
		
	//This method is created to click Add Element button
	public void clickAddElement(int n) throws InterruptedException{
		
		for(int i =1; i<=n; i++) {
			driver.findElement(By.xpath("//*[contains(text(),'Add Element')]")).click();
			Thread.sleep(1000);
		}	
	}
	
	//This method is created to count Delete Button 
	public int nDelete() {
		
		List<WebElement> links= driver.findElements(By.xpath("//*[@class='added-manually']"));
		int linkCount= links.size();
		return linkCount;
		
	}
	
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	

}
