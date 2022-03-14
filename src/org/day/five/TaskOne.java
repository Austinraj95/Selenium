package org.day.five;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement btnClick = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnClick.click();
		Thread.sleep(3000);
		
		WebElement TxtFirstName = driver.findElement(By.name("firstname"));
		TxtFirstName.sendKeys("Rajvarghees");
		
		WebElement TxtLastName = driver.findElement(By.name("lastname"));
		TxtLastName.sendKeys("Raj@12345");

		

}
}