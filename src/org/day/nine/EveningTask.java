package org.day.nine;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EveningTask {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.moneycontrol.com/markets/fno-market-snapshot");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//div[@id='idxopt_data']"));
		File screenshot = element.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Screenshot//Raj.bng");
		
		Thread.sleep(3000);
		FileUtils.copyFile(screenshot, destination);
		
		
		
		
		
		
	
}
}