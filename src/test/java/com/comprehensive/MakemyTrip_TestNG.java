package com.comprehensive;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class MakemyTrip_TestNG {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyLogo() {
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();	

        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']")).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
