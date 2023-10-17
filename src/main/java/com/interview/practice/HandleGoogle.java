package com.interview.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class HandleGoogle {

	

public static void main(String[] args) {
        
		//public void getHandleGoogle() {
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.costco.com");
			driver.manage().window().maximize();
		//	driver.findElements(By.xpath("//*[@class='nav-flyout']"));
			//List<WebElement> menuOptions= driver.findElements(By.xpath("//*[@class='nav-flyout']"));
			List<WebElement> menuOptions= driver.findElements(By.xpath("//*[@class='nav-item']"));
			System.out.println("Total count ="+menuOptions.size());
			
			for(int i=0; i<menuOptions.size(); i++) {
				
			System.out.println("Name of the list:" + menuOptions.get(i).getText());
			
			
			}
			
			/*
			 * WebDriver driver = new ChromeDriver(); driver.get("https://www.google.com");
			 * driver.manage().window().maximize();
			 * 
			 * WebElement search = driver.findElement(By.xpath("//*[@class='gLFyf']"));
			 * search.click(); search.sendKeys("Iphone"); List <WebElement> searchOptions =
			 * driver.findElements(By.xpath("//*[@class='wM6W7d']")); for(int i =0;
			 * i<searchOptions.size(); i++) { System.out.println("gfgfg"); }
			 */
//}
}		
	
	}
