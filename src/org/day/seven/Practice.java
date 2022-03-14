package org.day.seven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));
		txt.sendKeys("iphone 13",Keys.ENTER);
		
		List<WebElement> rows = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
	for (WebElement txtlist : rows) {
		String datas = txtlist.getText();
		System.out.println(datas);
	}
	
	{
		
	}
	}
		
	
		
	}


