package com.comprehensive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip_Chrome {

	public static void main(String[] args) throws Exception {
	
		
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();

    driver.get("https://www.makemytrip.com");

    driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
    driver.findElement(By.xpath("(//a[@href='/flights/'])[1]")).click();
    driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();

    driver.findElement(By.cssSelector("label[for='fromCity']")).click();
    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyderabad");

    Thread.sleep(1000); 
    driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
    
    driver.switchTo().activeElement().sendKeys(Keys.TAB);

    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);		    
	
    driver.close();

		
	}
}
