package ru_sf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver webDriver;

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void searchByCode(String Code) {
        WebElement searchString = webDriver.findElement(By.id("search"));
        searchString.sendKeys(Code);
        webDriver.findElement(By.className("ot-btn")).click();

    }
}
