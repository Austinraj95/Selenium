package org.day.six;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/");
		driver.manage().window().maximize();
		
		WebElement btnClick = driver.findElement(By.xpath("//button[@type='reset']"));
		btnClick.click();
		
		WebElement lnkphones = driver.findElement(By.xpath("//tmo-unav-dropdown[@id='nav-link-contaniner-1']"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(lnkphones).perform();
		
		WebElement btnClick1 = driver.findElement(By.xpath("//span[text()='5G phones']"));
		btnClick1.click();
		
		WebElement txtDoNotSell = driver.findElement(By.xpath("//a[text() =' Do Not Sell My Personal Information']"));
		String txtPrint = txtDoNotSell.getText();
		System.out.println(txtPrint);
		
		}

}
