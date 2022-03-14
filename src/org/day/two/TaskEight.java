package org.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskEight {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@name='username']"));
		txtUser.sendKeys("Manoj Kumar");

		WebElement txtPass = driver.findElement(By.xpath("//input[@name='password']"));
		txtPass.sendKeys("Password$123");

}
}