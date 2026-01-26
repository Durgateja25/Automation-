package com.wordpress.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class Homepage {

    WebDriver driver;
    
    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    
    By extend = By.xpath("//span[text()='Extend']");
    By getWP = By.xpath("//a[contains(text(),'Get WordPress')]");

    By community = By.xpath("//span[text()='Community']");
    By photo = By.xpath("//span[text()='Photo Directory']");

    

    public void clickGetWordPress() {

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(extend)).perform();

        driver.findElement(getWP).click();
    }

    public void clickPhotoDirectory() {

        driver.findElement(community).click();
        driver.findElement(photo).click();
    }
}
