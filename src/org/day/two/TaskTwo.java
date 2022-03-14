package org.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		WebElement txtSrc = driver.findElement(By.id("src"));
		txtSrc.sendKeys("Chennai");
		
		WebElement txtDest = driver.findElement(By.id("dest"));
		txtDest.sendKeys("Madurai");

}
	
}
