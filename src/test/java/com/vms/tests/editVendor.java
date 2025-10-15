package com.vms.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.vms.steps.editVendorPage;
import com.vms.steps.loginPage;
import com.vms.steps.vendorDatabasePage;
import com.vms.steps.vendorDetailPage;
import com.vms.utils.BaseTest;

public class editVendor extends BaseTest {

    private static loginPage login;
    private static vendorDatabasePage vendorDatabasePage;
    private static vendorDetailPage vendorDetailPage;
    private static editVendorPage editVendorPage;
    public String vendorName = "EditVMS001";
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
        login.loginVMS();
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
            login.loginVMS();
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
            login.loginVMS();
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
        String npwpName = "";
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
        String sppkpNumber = "";
        String nonPkp = "";
        String hasSkb = "";
        String skb = "";
        String[] vat = {};
        String[] wht = {};
        editVendorPage.updateTaxInformation(npwp, npwpNumber, npwpName, taxAddress, taxCity, taxCountry, taxPostalCode,
                copyOfNpwp, skt, eFaktur, pkp, sppkp, sppkpNumber, nonPkp, hasSkb, skb, vat, wht);
        if (individualRun) {
            // Submit
            editVendorPage.submitUpdateVendor();
        }
    }

    @Test(priority = 4)
    public void editVendorStage4() throws InterruptedException {
        if (individualRun) {
            // Login vm staff
            login.loginVMS();
            // Open vendor database page
            vendorDatabasePage.openVendorDatabasePage();
            // Search vendor
            vendorDatabasePage.filterByVendorName(vendorName);
            // Open vendor detail page
            vendorDatabasePage.openVendorDetail(vendorName);
            // Open edit vendor page
            vendorDetailPage.openEditVendorPage();
        }

        // Edit vendor stage 4
        String[][] bankAccounts = {
                { "CIMB NIAGA - NIASC1", "Jakarta Utara", "IDR", "908131", "Test.CIMB",
                        "/Users/rizalkurniawan/Downloads/dummy.pdf",
                        "/Users/rizalkurniawan/Downloads/dummy.pdf",
                        "/Users/rizalkurniawan/Downloads/dummy.pdf" },
                { "BANK SYARIAH INDONESIA - BSISC1", "Jakarta Utara", "IDR", "908131", "Test.BSI",
                        "/Users/rizalkurniawan/Downloads/dummy.pdf",
                        "/Users/rizalkurniawan/Downloads/dummy.pdf",
                        "/Users/rizalkurniawan/Downloads/dummy.pdf" },
        };
        editVendorPage.updatePaymentInformation(bankAccounts);

        if (individualRun) {
            // Submit
            editVendorPage.submitUpdateVendor();
        }
    }

    @Test(priority = 5)
    public void editVendorStage6() throws InterruptedException {
        if (individualRun) {
            // Login vm staff
            login.loginVMS();
            // Open vendor database page
            vendorDatabasePage.openVendorDatabasePage();
            // Search vendor
            vendorDatabasePage.filterByVendorName(vendorName);
            // Open vendor detail page
            vendorDatabasePage.openVendorDetail(vendorName);
            // Open edit vendor page
            vendorDetailPage.openEditVendorPage();
        }

        // Edit vendor stage 6
        String transactionValue = "500000000";
        String[][] descAndRemarks = {
                { "Company Website", "Dummy2" },
                { "Penelusuran Perkara", "Dummy2" },
                { "Latar Belakang / Pemegang Saham", "Dummy2" },
                { "Informasi Umum (Sumber Google / situs web resmi pihak ketiga)",
                        "Dummy2" },
                { "Peta / Lokasi Situs (Google Maps)", "Dummy2" },
                { "Informasi Perusahaan (Administrasi Hukum Umum / Bursa Efek Indonesia (Perusahaan Publik))",
                        "Dummy2" },
                { "Penelusuran informasi lainnya : Pers/Media", "Dummy2" },
                { "Penelusuran informasi lainnya : Pengadilan Hukum", "Dummy2" },
                { "Penelusuran informasi lainnya : News Center", "Dummy2" },
                { "Penelusuran informasi lainnya : Berita IDX", "Dummy2" },
        };
        String dueDillNumber = "5810392";
        String dueDillAttachment = "";
        String mitigationPlan = "Dummy2";
        String expiredDate = "2";
        editVendorPage.updateComplianceEnhancement(transactionValue, descAndRemarks, dueDillNumber, dueDillAttachment,
                mitigationPlan, expiredDate);

        // Submit
        editVendorPage.submitUpdateVendor();
    }
}
