package com.wordpress.pages;

import org.openqa.selenium.*;

public class Photopage {

    WebDriver driver;
     
    By search = By.xpath("//input[@placeholder='Search photos']");
    By images = By.xpath("//li[contains(@class,'hentry')]");

    public Photopage(WebDriver driver) {
        this.driver = driver;
    }
    
    
    public void searchImage(String name) {

        driver.findElement(search).sendKeys("Crystal");
        driver.findElement(search).sendKeys(Keys.ENTER);
    }

    public boolean isImageDisplayed() {
        
    	System.out.println("No of Images : "+driver.findElements(images).size());
        return driver.findElements(images).size() > 0;
    }
}
