package org.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		element.sendKeys("austinraj94@gmail.com");
		
		WebElement element1 = driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		element1.sendKeys("Austinraj@2022");

		WebElement element2 = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		element2.click();


		
		
		
		
}
}
