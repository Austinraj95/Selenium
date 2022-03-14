package org.day.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFive {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();

		WebElement btnHeading = driver.findElement(By.id("heading20"));
		btnHeading.click();
		
		Thread.sleep(3000);
		WebElement btnCts = driver.findElement(By.xpath("//a[@href=\"http://traininginchennai.in/interview-questions/cts.pdf#toolbar=0\"]"));
		btnCts.click();




}




}
