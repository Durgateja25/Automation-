package com.stepdefinition;

import org.testng.Assert;

import com.wordpress.base.Wordpress_Base;
import com.wordpress.pages.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Wordpress_Steps extends Wordpress_Base {

    Homepage home;
    WordpressPage getWP;
    Photopage photo;

    @Before
    public void setup() {
    	System.out.println("*********** Driver Session Started ***********");
    	setUp();
    }

    @After
    public void tearDown() {
        quit();
        System.out.println("********** Driver Session Ends ************");
    }

    @Given("user launches wordpress site")
    public void launch() {
        home = new Homepage(driver);
        System.out.println("HomePage URL is : "+driver.getCurrentUrl());
        System.out.println("Title of Homepage is : "+driver.getTitle());
    }

    @Then("verify page title")
    public void verifyTitle() {

        String title = driver.getTitle();
        Assert.assertTrue(title.contains("WordPress"));
        System.out.println("Homepage title contains WordPress.");
    }

    @When("user clicks Get WordPress")
    public void clickGetWP() {

        home.clickGetWordPress();
        getWP = new WordpressPage(driver);
    }

    @Then("verify Get WordPress text")
    public void verifyText() {

        String text = getWP.getText();
        Assert.assertEquals(text, "Get WordPress");
        System.out.println("Get WorkPress is in middle of the page.");
    }

    @When("user opens photo directory")
    public void openPhoto() {

        home = new Homepage(driver);
        home.clickPhotoDirectory();
        photo = new Photopage(driver);
    }

    @And("user searches image {string}")
    public void search(String name) {

        photo.searchImage(name);
    }

    @Then("images should be displayed")
    public void verifyImages() {
        
    	
        Assert.assertTrue(photo.isImageDisplayed());
    }
}
