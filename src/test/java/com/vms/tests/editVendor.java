package com.vms.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.vms.common.BaseTest;
import com.vms.steps.editVendorPage;
import com.vms.steps.loginPage;
import com.vms.steps.vendorDatabasePage;
import com.vms.steps.vendorDetailPage;

public class editVendor extends BaseTest {

    private static loginPage login;
    private static vendorDatabasePage vendorDatabasePage;
    private static vendorDetailPage vendorDetailPage;
    private static editVendorPage editVendorPage;
    public String vendorName = "TESTVMSBUGS004";
    public String[] vendorCategory = { "trade", "nonTrade" };

    @BeforeClass
    public void init() {
        login = new loginPage(driver);
        vendorDatabasePage = new vendorDatabasePage(driver);
        vendorDetailPage = new vendorDetailPage(driver);
        editVendorPage = new editVendorPage(driver);
    }

    @Test(priority = 1)
    public void editVendorStage1() throws InterruptedException {
        // Login vm staff
        login.loginVMS("fahmi.budiman", "123");
        // Open vendor database page
        vendorDatabasePage.openVendorDatabasePage();
        // Search vendor
        vendorDatabasePage.filterByVendorName(vendorName);
        // Open vendor detail page
        vendorDatabasePage.openVendorDetail(vendorName);
        // Open edit vendor page
        vendorDetailPage.openEditVendorPage();

        // Edit vendor stage 1
        String[] businessArea = { "POINTs", "TCO", "GTOPAS" };
        String tradingName = "TESTVMSBUGSUPDATE004";
        String[][] contactPerson = {
                { "FHSODK", "Sales", "0812390239", "budi@gmail.com", "485012" },
                { "GKPWEO", "Marketing", "0812390239", "udin@gmail.com", "540824" }
        };
        String companyPhone1 = "8091203910";
        String scopeOfWork = "TestUpdate";
        String detailScopeOfWork = "TestDetailUpdate";
        String[][] businessCategory = {
                { "hotel", "hotel" },
                { "Gold", "Gold" }
        };
        editVendorPage.updateGeneralInformation(vendorCategory, businessArea, tradingName, contactPerson, companyPhone1,
                scopeOfWork, detailScopeOfWork, businessCategory);
        if (individualRun) {
            // Submit
            editVendorPage.submitUpdateVendor();
        }
    }

    @Test(priority = 2)
    public void editVendorStage2() throws InterruptedException {
        if (individualRun) {
            // Login vm staff
            login.loginVMS("fahmi.budiman", "123");
            // Open vendor database page
            vendorDatabasePage.openVendorDatabasePage();
            // Search vendor
            vendorDatabasePage.filterByVendorName(vendorName);
            // Open vendor detail page
            vendorDatabasePage.openVendorDetail(vendorName);
            // Open edit vendor page
            vendorDetailPage.openEditVendorPage();
        }
        // Edit vendor stage 2
        String address = "Jl. Dr. Satrio No 10, Kec. Kuningan";
        String city = "Jakarta Selatan";
        String country = "Angola";
        String postalCode = "65019";
        String[][] functionaryOfCompany = {
                { "Bono", "DPH", "Bono@gmail.com" },
                { "Udin", "CFO", "Udin@gmail.com" }
        };
        String[][] numberAndPathDocument = {
                { "Pakta Integritas", "581239023", "/Users/rizalkurniawan/Downloads/dummy.pdf" },
                { "Pakta Kerahasiaan", "120930193", "/Users/rizalkurniawan/Downloads/dummy.pdf" },
        };
        editVendorPage.updateCompanyLegality(address, city, country, postalCode, functionaryOfCompany,
                numberAndPathDocument);
        if (individualRun) {
            // Submit
            editVendorPage.submitUpdateVendor();
        }
    }

    @Test(priority = 3)
    public void editVendorStage3() throws InterruptedException {
        if (individualRun) {
            // Login vm staff
            login.loginVMS("fahmi.budiman", "123");
            // Open vendor database page
            vendorDatabasePage.openVendorDatabasePage();
            // Search vendor
            vendorDatabasePage.filterByVendorName(vendorName);
            // Open vendor detail page
            vendorDatabasePage.openVendorDetail(vendorName);
            // Open edit vendor page
            vendorDetailPage.openEditVendorPage();
        }
        // Edit vendor stage 3
        String npwp = "";
        String npwpNumber = "1230912039";
        String taxAddress = "Jl. Dr. Satrio No 10, Kec. Kuningan";
        String taxCity = "Jakarta Selatan";
        String taxCountry = "Angola";
        String taxPostalCode = "65019";
        String copyOfNpwp = "";
        String skt = "";
        String eFaktur = "";
        String pkp = "";
        String sppkp = "";
        String sppkpNumber = "1203912039";
        String nonPkp = "";
        String hasSkb = "";
        String skb = "";
        editVendorPage.updateTaxInformation();
        if (individualRun) {
            // Submit
            editVendorPage.submitUpdateVendor();
        }
    }
}
