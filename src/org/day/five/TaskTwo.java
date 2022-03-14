package org.day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement txtUserName = driver.findElement(By.name("username"));
		txtUserName.sendKeys("Rajvarghees");
		
		WebElement TxtPassword = driver.findElement(By.name("password"));
		TxtPassword.sendKeys("Raj*12345");
		
		

		

		
}
}