package com.sel.test;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverMethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//get(url) - opens the url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//get(title) - returns current webpage title
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - return current window url
		System.out.println(driver.getCurrentUrl());	
		
		//getPageSource() - get page source of current window
		System.out.println(driver.getPageSource());
		
		//getWindowHandle() - get current window id
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles() - get window ids of more than one windows
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		// windowHandles() returns set because ids cannot be duplicate
		Set<String> windowIdList = driver.getWindowHandles();
		System.out.println(windowIdList);
		
		driver.quit();
	}
}
