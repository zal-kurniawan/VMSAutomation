package com.vms.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vendorDetailObject {
    private WebDriver driver;

    public vendorDetailObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement buttonEditVendor() {
        return driver.findElement(By.xpath("//*//button[text() = 'Edit Profile']"));
    }

}
