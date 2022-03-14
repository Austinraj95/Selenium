package org.day.six;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		
		WebElement sourcedata = driver.findElement(By.id("credit2"));
		WebElement Destination = driver.findElement(By.id("bank"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourcedata, Destination).perform();
		
		WebElement sourcedata1 = driver.findElement(By.id("fourth"));
		WebElement Destination1 = driver.findElement(By.id("amt7"));

		actions.dragAndDrop(sourcedata1, Destination1).perform();
		
		WebElement sourcedata2 = driver.findElement(By.id("credit1"));
		WebElement Destination2 = driver.findElement(By.id("loan"));
		
		actions.dragAndDrop(sourcedata2, Destination2).perform();
		
		WebElement sourcedata3 = driver.findElement(By.id("fourth"));
		WebElement Destination3 = driver.findElement(By.id("amt8"));

		actions.dragAndDrop(sourcedata3, Destination3).perform();
		
		WebElement btnclick = driver.findElement(By.xpath("//a[@class='button button-green')]"));
		btnclick.click();
		
	}

}
