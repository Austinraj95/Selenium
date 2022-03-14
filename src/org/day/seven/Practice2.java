package org.day.seven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement btnclick = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnclick.click();
		Thread.sleep(3000);
		
		List<WebElement> txtrows = driver.findElements(By.xpath("//span[@data-type ='radio']"));
		for (int i = 0; i < txtrows.size(); i++) {
			WebElement trow = txtrows.get(i);
			Thread.sleep(3000);
			
		List<WebElement> txtdata = driver.findElements(By.xpath("//label[@class ='_58mt']"));
		Thread.sleep(3000);
		for (int j = 0; j < txtdata.size(); j++) {
			WebElement data = txtdata.get(j);
			String text = data.getText();
			System.out.println(text);   }
	
		}
	
	
	}

	
	
	}


	
	

