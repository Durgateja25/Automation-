package com.wordpress.pages;


import org.openqa.selenium.*;

public class WordpressPage {

    WebDriver driver;


    public WordpressPage(WebDriver driver) {
        this.driver = driver;
    }
    
    By heading = By.xpath("//h1[text()='Get WordPress']");


    public String getText() {
    	System.out.println("");
        return driver.findElement(heading).getText();
        
    }
}
