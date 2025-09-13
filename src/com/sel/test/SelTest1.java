package com.sel.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelTest1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    String actTitle = driver.getTitle();
	    String expTitle = "OrangeHRM";
	    
	    if(actTitle.equalsIgnoreCase(expTitle))
	    	System.out.println("Test Passed");
	    
	    else
	    	System.out.println("Test Failed");
	    
	    Thread.sleep(1000);
	    
		driver.quit();
	}

}
