package org.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement BtnClick = driver.findElement(By.xpath("//button[text()='Accept']"));
		BtnClick.click();
			
		WebElement BtnClick1 = driver.findElement(By.xpath("//a[@href='/selenium-training?q=banner#enroll-form']"));
		BtnClick1.click();
		Thread.sleep(3000);
		
		WebElement txtFirstName = driver.findElement(By.id("first-name"));
		txtFirstName.sendKeys("Raj");
		
		WebElement txtLastname = driver.findElement(By.id("last-name"));
		txtLastname.sendKeys("Sakthi");

		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Raj55@gmail.com");

		WebElement txtMobile = driver.findElement(By.id("mobile"));
		txtMobile.sendKeys("9840722622");

		WebElement txtCountry = driver.findElement(By.name("country"));
		txtCountry.sendKeys("India");
		
		WebElement txtCity = driver.findElement(By.id("city"));
		txtCity.sendKeys("Chennai");

		WebElement txtMessage = driver.findElement(By.name("message"));
		txtMessage.sendKeys("Hi This Is Raj");
		
		WebElement txtCode = driver.findElement(By.id("code"));
		txtCode.sendKeys("1xW3");
		
		WebElement btnClick = driver.findElement(By.xpath("//button[text()='Send']"));
		btnClick.click();


		

		
	
}
}