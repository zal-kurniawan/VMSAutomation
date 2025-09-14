package com.vms.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.vms.common.BaseTest;
import com.vms.steps.createVendorPage;
import com.vms.steps.loginPage;
import com.vms.steps.vendorDatabasePage;

public class editVendor extends BaseTest {
    private loginPage login;
    private vendorDatabasePage vendorDatabasePage;
    private createVendorPage createVendorPage;

    @BeforeEach
    public void init() {
        login = new loginPage(driver);
        vendorDatabasePage = new vendorDatabasePage(driver);
        createVendorPage = new createVendorPage(driver);
    }

    @Test
    public void editVendorStage1() throws InterruptedException {

    }
}
