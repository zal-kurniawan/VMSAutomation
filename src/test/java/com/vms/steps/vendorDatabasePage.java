package com.vms.steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.vms.objects.navigationObject;
import com.vms.objects.vendorDatabaseObject;
import com.vms.utils.BasePage;

public class vendorDatabasePage extends BasePage {
    private vendorDatabaseObject vendorDatabaseObject;
    private navigationObject navigationObject;

    public vendorDatabasePage(WebDriver driver) {
        super(driver);
        this.navigationObject = new navigationObject(driver);
        this.vendorDatabaseObject = new vendorDatabaseObject(driver);
    }

    public void openVendorDatabasePage() throws InterruptedException {
        navigationObject.dropdownVendorDatabase().click();
        sleep(500);
        navigationObject.linkVendorDatabase().click();
        sleep(1000);
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://tam-vms.southeastasia.cloudapp.azure.com/vms/VendorDatabase/VendorDatabase";
        if (currentUrl.equals(expectedUrl)) {
            System.out.println("Berhasil membuka halaman Vendor Database");
        } else {
            System.out.println("Gagal membuka halaman Vendor Database");
        }
    }

    public void filterByVendorName(String vendorName) throws InterruptedException {
        vendorDatabaseObject.buttonFilterVendor().click();
        sleep(500);
        vendorDatabaseObject.inputFilterVendorName().sendKeys(vendorName);
        vendorDatabaseObject.inputFilterVendorName().sendKeys(Keys.ENTER);
        wait.until(
                ExpectedConditions.visibilityOf(vendorDatabaseObject.textVendorNameDynami(vendorName.toUpperCase())));
    }

    public void openVendorDetail(String vendorName) throws InterruptedException {
        scrollRightOnElement(vendorDatabaseObject.buttonViewVendorDynamic(vendorName.toUpperCase()));
        vendorDatabaseObject.buttonViewVendorDynamic(vendorName.toUpperCase()).click();
        sleep(1000);
    }

}
