package com.vms.tests;

import com.vms.common.BaseTest;
import com.vms.steps.createVendorPage;
import com.vms.steps.loginPage;
import com.vms.steps.vendorDatabasePage;

public class editVendor extends BaseTest {
    private loginPage login;
    private vendorDatabasePage vendorDatabasePage;
    private createVendorPage createVendorPage;

    @org.junit.jupiter.api.BeforeEach
    public void init() {
        login = new loginPage(driver);
        vendorDatabasePage = new vendorDatabasePage(driver);
        createVendorPage = new createVendorPage(driver);
    }

    @org.junit.jupiter.api.Test
    public void editVendorStage1() throws InterruptedException {

    }
}
