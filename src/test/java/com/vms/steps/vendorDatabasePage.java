package com.vms.steps;

import org.openqa.selenium.WebDriver;
import com.vms.common.BasePage;
import com.vms.objects.vendorDatabaseObject;

public class vendorDatabasePage extends BasePage {

    private vendorDatabaseObject vendorDatabaseObject;

    public vendorDatabasePage(WebDriver driver) {
        super(driver);
        this.vendorDatabaseObject = new vendorDatabaseObject(driver);
    }

}
