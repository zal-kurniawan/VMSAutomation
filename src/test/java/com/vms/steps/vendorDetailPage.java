package com.vms.steps;

import org.openqa.selenium.WebDriver;

import com.vms.objects.vendorDetailObject;
import com.vms.utils.BasePage;

public class vendorDetailPage extends BasePage {
    private vendorDetailObject vendorDetailObject;

    public vendorDetailPage(WebDriver driver) {
        super(driver);
        this.vendorDetailObject = new vendorDetailObject(driver);
    }

    public void openEditVendorPage() throws InterruptedException {
        vendorDetailObject.buttonEditVendor().click();
        sleep(1000);
    }

}
