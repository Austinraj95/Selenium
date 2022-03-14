package org.day.eight;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskTwo {
public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenscart.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement txtloginEmail = driver.findElement(By.id("loginEmailId"));
		txtloginEmail.sendKeys("austinraj94@gmail.com");
		
		WebElement txtloginPassword = driver.findElement(By.id("loginPassword"));
		txtloginPassword.sendKeys("Greenscart*12345");
		WebElement btnClick = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		btnClick.click();
		
		Thread.sleep(3000);
		WebElement txtType = driver.findElement(By.id("typeahead-basic"));
		txtType.sendKeys("Apple Iphone 12 Pro Max");
		
		Thread.sleep(3000);
		WebElement btnType = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		btnType.click();
		
		Thread.sleep(3000);
		WebElement btnAddCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		btnAddCart.click();
		
		Thread.sleep(3000);
		WebElement btnClickCart = driver.findElement(By.xpath("//a[@href='#/products/cart-items']"));
		btnClickCart.click();
		
		Thread.sleep(3000);
		WebElement btnAddGift = driver.findElement(By.xpath("(//button[@type=\"button\"])[4]"));
		btnAddGift.click();
		
		Thread.sleep(20000);
		WebElement btnDoubleClick = driver.findElement(By.xpath("//span[text()='GRN10']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(btnDoubleClick).perform();
		
		Thread.sleep(3000);
		WebElement btnRight = driver.findElement(By.xpath("//span[contains(text(),'×')]"));
		actions.contextClick(btnRight).perform();
		
		Thread.sleep(3000);
		WebElement btnSection = driver.findElement(By.xpath("//div[contains(text(),'Remove')]"));
		btnSection.click();
		
		
}
}