package com.vms.steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import com.vms.common.BasePage;
import com.vms.objects.navigationObject;
import com.vms.objects.vendorDatabaseObject;

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
        sleep(1000);
    }

}
