package com.vms.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vendorDatabaseObject {
    private WebDriver driver;

    public vendorDatabaseObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement buttonFilterVendor() {
        return driver.findElement(By.xpath("//*//button[@id = 'toggleFilterButton']"));
    }

    public WebElement inputFilterVendorName() {
        return driver.findElement(By.xpath("//*//input[@aria-label = 'Vendor Name']"));
    }

    // public WebElement buttonViewVendorDynamic() {
    // return driver.findElement(By.xpath("//*//td[text() = 'PT. MAJU
    // MUNDUR']//following-sibling::td//button"));
    // }
}
