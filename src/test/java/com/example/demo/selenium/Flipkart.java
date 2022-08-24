package com.example.demo.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {
	
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		Action  sendEsc = actions.sendKeys(Keys.ESCAPE).build();
		sendEsc.perform();
		
		driver.findElement(By.name("q")).sendKeys("dell");
		
		driver.findElement(By.className("_34RNph")).click();
		
		//driver.switchTo().window("https://www.flipkart.com/search?q=dell&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		
		//driver.findElement(By.className("_4rR01T")).click();
		
	
		/*
		 * driver.findElement(By.className("_4rR01T")).click();
		 * driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		 */
		
		
		/*
		 * driver.findElement(By.className("_4rR01T")).click();
		 * 
		 * driver.findElement(By.className("_2KpZ6l _2U9uOA _3v1-ww")).click();
		 */
		 
	}

}
