package org.day.nine;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MorningTask {

	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		WebElement btnClick = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		btnClick.click();
		
		WebElement btnClick1 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		btnClick1.click();
		
		Alert al = driver.switchTo().alert();
		
		al.sendKeys("Rajvarghees");
		al.accept();
		
		WebElement txtHello = driver.findElement(By.xpath("//p[text()='Hello Rajvarghees How are you today']"));
		String text = txtHello.getText();
		System.out.println(text);

}
}