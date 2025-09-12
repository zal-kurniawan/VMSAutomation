package com.vms.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class navigationObject {
     private WebDriver driver;

    public navigationObject(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement navigationVendorRegistration() {
        return driver.findElement(By.xpath("//*//li//span[text() = 'Vendor Registration']"));
    }
}
