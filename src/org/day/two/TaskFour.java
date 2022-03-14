package org.day.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();

		WebElement btnImage = driver.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]"));
		btnImage.click();
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@title='User Id']"));
		txtUser.sendKeys("Arul Sakthi");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@title='Password']"));
		txtPass.sendKeys("Password@12345");



}


}
