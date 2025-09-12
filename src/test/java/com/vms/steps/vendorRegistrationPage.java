package com.vms.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import com.vms.common.BasePage;
import com.vms.objects.navigationObject;
import com.vms.objects.vendorRegistrationObject;

public class vendorRegistrationPage extends BasePage {

    private vendorRegistrationObject vendorRegistrationObject;
    private navigationObject navigationObject;

    // Konstruktor mewarisi driver dari BasePage
    public vendorRegistrationPage(WebDriver driver) {
        super(driver);
        this.navigationObject = new navigationObject(driver);
        this.vendorRegistrationObject = new vendorRegistrationObject(driver);
    }

    public void openVendorRegistrationPage() throws InterruptedException {
        navigationObject.navigationVendorRegistration().click();
        Thread.sleep(1000);
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://tam-vms.southeastasia.cloudapp.azure.com/vms/VendorRegistration/VendorRegistration";
        assertEquals(expectedUrl, currentUrl, "URL does not match!");
    }

    public void openCreateVendorPage() {
        vendorRegistrationObject.buttonCreateVendor().isDisplayed();
        vendorRegistrationObject.buttonCreateVendor().click();
    }

}
