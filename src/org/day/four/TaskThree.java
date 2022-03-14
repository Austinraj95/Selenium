package org.day.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		
		WebElement btnClick = driver.findElement(By.id("overview-tab"));
		btnClick.click();
		Thread.sleep(3000);
		
		WebElement TxtCardHeader = driver.findElement(By.xpath("(//h3[@class='card-header  collapsed'])[1]"));
		String text = TxtCardHeader.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		WebElement TxtCardBody = driver.findElement(By.xpath("(//div[@class='card-body'])[1]"));
		String text1 = TxtCardBody.getText();
		System.out.println(text1);

		
		
		



	
}
}