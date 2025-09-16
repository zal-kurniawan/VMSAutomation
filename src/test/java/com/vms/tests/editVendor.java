package com.vms.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vms.common.BaseTest;
import com.vms.steps.createVendorPage;
import com.vms.steps.loginPage;
import com.vms.steps.vendorDatabasePage;

public class editVendor extends BaseTest {

    private static loginPage login;
    private static vendorDatabasePage vendorDatabasePage;
    private static createVendorPage createVendorPage;
    public String vendorName = "VendorTest";

    @BeforeClass
    public void init() {
        login = new loginPage(driver);
        vendorDatabasePage = new vendorDatabasePage(driver);
        createVendorPage = new createVendorPage(driver);
    }

    @Test
    public void editVendorStage1() throws InterruptedException {
        // Login vm staff
        login.loginVMS("fahmi.budiman", "123");
        // Open vendor database page
        vendorDatabasePage.openVendorDatabasePage();
        // Search vendor
        vendorDatabasePage.filterByVendorName(vendorName);
        // Open vendor detail page

        // Edit vendor stage 1

        if (individualRun) {
            // Submit

        }
    }

    @Test
    public void editVendorStage2() throws InterruptedException {
        if (individualRun) {
            // Login vm staff
            login.loginVMS("fahmi.budiman", "123");
            // Open vendor database page
            vendorDatabasePage.openVendorDatabasePage();
            // Search vendor
            vendorDatabasePage.filterByVendorName(vendorName);
            // Open vendor detail page

        }
        // Edit vendor stage 2

        if (individualRun) {
            // Submit

        }
    }

    @Test
    public void editVendorStage3() throws InterruptedException {
        if (individualRun) {
            // Login vm staff
            login.loginVMS("fahmi.budiman", "123");
            // Open vendor database page
            vendorDatabasePage.openVendorDatabasePage();
            // Search vendor
            vendorDatabasePage.filterByVendorName(vendorName);
            // Open vendor detail page

        }
        // Edit vendor stage 3

        if (individualRun) {
            // Submit

        }
    }
}
