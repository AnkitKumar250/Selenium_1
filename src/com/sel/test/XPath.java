package com.sel.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {

		// syntax - //tagname[@attibute = 'value'] OR //*[attribute = 'value']
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		String username = "Admin";
		String password = "admin123";
		
		Thread.sleep(2000);
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement passwordField = driver.findElement(By.cssSelector("input[placeholder='Password']"));
		
		
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();
		
	}

}
