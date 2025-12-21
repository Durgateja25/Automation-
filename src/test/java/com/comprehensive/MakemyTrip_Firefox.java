package com.comprehensive;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakemyTrip_Firefox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();	
		WebElement logo = driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']"));

		if (logo.isDisplayed()) {
		    System.out.println("Logo is present");
		}
		driver.close();		
	}
}
