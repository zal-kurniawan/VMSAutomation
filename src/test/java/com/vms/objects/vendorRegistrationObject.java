package com.vms.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vendorRegistrationObject {
     private WebDriver driver;

    // Konstruktor menerima WebDriver
    public vendorRegistrationObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement buttonCreateVendor() {
        return driver.findElement(By.xpath("//*//i[contains(@class, 'fa-plus')]/.."));
    }

    public WebElement buttonViewDynamic(String text){
        return driver.findElement(By.xpath("//*//td[text() = '" + text + "']//following-sibling::td//button"));
    }
}
