package com.vms.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigationObject {
    private WebDriver driver;

    public navigationObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement linkVendorRegistration() {
        return driver.findElement(
                By.xpath("//div[@class = 'sidebar-menu-wrapper']//li[5]//span[text() = 'Vendor Registration']"));
    }

    public WebElement dropdownVendorDatabase() {
        return driver.findElement(By.xpath(
                "//div[@class = 'sidebar-menu-wrapper']//li[3]//a[@href = '#']//span[text() = 'Vendor Database']"));
    }

    public WebElement linkVendorDatabase() {
        return driver.findElement(
                By.xpath("//div[@class = 'sidebar-menu-wrapper']//li[3]//ul/li[1]//span[text() = 'Vendor Database']"));
    }
}
