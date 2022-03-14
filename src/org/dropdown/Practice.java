package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		WebElement dDnCourse = driver.findElement(By.id("Skills"));
		Select select=new Select(dDnCourse);
		
		//select all values using index
		
	//	List<WebElement> options = select.getOptions();
		
	//	for (int i = 0; i < options.size(); i++) {
			
	//		select.selectByIndex(i);
			
	//	}
		
		//select all values using attribute values
		
	//	List<WebElement> options = select.getOptions();
		
	//	for (WebElement element : options) {
	//		select.selectByValue("value");
		
		List<WebElement> options = select.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			select.selectByIndex(i);
			
		}
		
		
		
		
		select.deselectAll();
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}