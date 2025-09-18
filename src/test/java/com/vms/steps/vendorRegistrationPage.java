package com.vms.steps;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
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
        navigationObject.linkVendorRegistration().click();
        Thread.sleep(1000);
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://tam-vms.southeastasia.cloudapp.azure.com/vms/VendorRegistration/VendorRegistration";
        Assert.assertEquals(currentUrl, expectedUrl, "Gagal membuka halaman Vendor Registration");
    }

    public void openCreateVendorPage() {
        vendorRegistrationObject.buttonCreateVendor().isDisplayed();
        vendorRegistrationObject.buttonCreateVendor().click();
    }

}
