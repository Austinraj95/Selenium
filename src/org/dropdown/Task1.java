package org.dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Task1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement txtUsername = driver.findElement(By.id("username"));
		txtUsername.sendKeys("Sakthiraj");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("aruchamy");
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();
		
		WebElement dDnlocation = driver.findElement(By.id("location"));
		Select select0=new Select(dDnlocation);
		select0.selectByValue("Los Angeles");
		
		WebElement dDnhotel = driver.findElement(By.id("hotels"));
		Select select1=new Select(dDnhotel);
		select1.selectByIndex(2);
		
		WebElement dDnRoomType = driver.findElement(By.id("room_type"));
		Select select2=new Select(dDnRoomType);
		select2.selectByVisibleText("Super Deluxe");
		
		WebElement dDnPerson = driver.findElement(By.id("room_nos"));
		Select select3=new Select(dDnPerson);
		select3.selectByValue("2");
		
		WebElement txtInDate = driver.findElement(By.id("datepick_in"));
		txtInDate.sendKeys("27/03/2022");
		
		WebElement txtOutDate = driver.findElement(By.id("datepick_out"));
		txtOutDate.sendKeys("31/03/2022");
		
		WebElement dDnAdult = driver.findElement(By.id("adult_room"));
		Select select4=new Select(dDnAdult);
		select4.selectByValue("2");
		
		WebElement dDnChild = driver.findElement(By.id("child_room"));
		Select select5=new Select(dDnChild);
		select5.selectByIndex(0);
		
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id=\"Submit\"]"));
		btnSearch.click();
		
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		WebElement btncon = driver.findElement(By.id("continue"));
		btncon.click();
		
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys("Aruchamy");
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys("Eswaran");
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("Palani");
		WebElement txtCreditCard = driver.findElement(By.id("cc_num"));
		txtCreditCard.sendKeys("1234123412341234");
		
		WebElement txtCType = driver.findElement(By.id("cc_type"));
		Select select11=new Select(txtCType);
		select11.selectByVisibleText("VISA");
		
		WebElement txtCTypeMon = driver.findElement(By.id("cc_exp_month"));
		Select select12=new Select(txtCTypeMon);
		select12.selectByVisibleText("July");
		
		WebElement txtCTypeYr = driver.findElement(By.id("cc_exp_year"));
		Select select13=new Select(txtCTypeYr);
		select13.selectByVisibleText("2022");
		
		WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
		txtCvv.sendKeys("123");
		WebElement clickBook = driver.findElement(By.id("book_now"));
		clickBook.click();
		
		Wait wait=new FluentWait(driver).withTimeout(Duration.ofMinutes(1)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("order_no")));
		WebElement ptOrderNo = driver.findElement(By.id("order_no"));
		
		String text = ptOrderNo.getAttribute("value");
		System.out.println(text);
		System.out.println("workdone");		
	}
}
