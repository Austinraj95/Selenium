package org.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTen {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Rajvarghees");

		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("9840722600");

		
}
}