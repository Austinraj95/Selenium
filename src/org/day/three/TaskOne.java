package org.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TaskOne {

public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Iphone 13");
		
		WebElement element1 = driver.findElement(By.id("nav-search-submit-button"));
		element1.click();

		
		
		
		
		

}
}