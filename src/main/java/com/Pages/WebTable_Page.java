package com.Pages;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable_Page {

    private WebDriver driver;
    private By rows = By.xpath("//div[@class='rt-tr-group']");
    private By columns = By.xpath("//div[@class='rt-th rt-resizable-header']");

    public WebTable_Page(WebDriver driver) {
        this.driver = driver;
    }

    // Get row count
    public int getRowCount() {
        return driver.findElements(rows).size();
    }

    // Get column count
    public int getColumnCount() {
        return driver.findElements(columns).size();
    }

    // Get entire table data
    public void printTableData() {
        List<WebElement> allRows = driver.findElements(rows);

        for (WebElement row : allRows) {
            if (!row.getText().trim().isEmpty()) {
                System.out.println(row.getText());
            }
        }

    }

    // Get cell value based on row & column
    public String getCellValue(int row, int column) {
        return driver.findElement(
            By.xpath("//div[@class='rt-tr-group'][" + row + "]//div[@class='rt-td'][" + column + "]")
        ).getText();
    }

    // Click edit button based on first name
    public void clickEditByName(String name) {
    	    By editButton = By.xpath("//div[text()='" + name + "']/following-sibling::div//span[@title='Edit']");

    	    WebElement element = driver.findElement(editButton);

    	    // Scroll into view
    	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

    	    // Wait until clickable
    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    wait.until(ExpectedConditions.elementToBeClickable(element));

    	    try {
    	        element.click();
    	    } catch (ElementClickInterceptedException e) {
    	        ((JavascriptExecutor) driver)
    	                .executeScript("arguments[0].click();", element);
    	    }
    }

    // Verify data exists in table
    public boolean isValuePresent(String value) {
        return driver.getPageSource().contains(value);
    }
}
