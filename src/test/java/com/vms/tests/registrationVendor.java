package com.vms.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import com.vms.common.BaseTest;
import com.vms.steps.createVendorPage;
import com.vms.steps.loginPage;
import com.vms.steps.vendorRegistrationPage;

public class registrationVendor extends BaseTest {

        private static loginPage login;
        private static vendorRegistrationPage vendorRegistrationPage;
        private static createVendorPage createVendorPage;

        @BeforeClass
        public static void init() {
                login = new loginPage(driver);
                vendorRegistrationPage = new vendorRegistrationPage(driver);
                createVendorPage = new createVendorPage(driver);
        }

        @Test(priority = 1)
        public void vendorRegistrationByVMStaff() throws InterruptedException {
                // Login vm staff
                login.loginVMS("fahmi.budiman", "123");
                // Open vendor registration page
                vendorRegistrationPage.openVendorRegistrationPage();
                // Open create vendor page
                vendorRegistrationPage.openCreateVendorPage();

                // Fill General Information
                String[] vendorCategory = { "trade", "nonTrade" };
                String[] businessArea = { "POINTs", "TCO" };
                String type = "company";
                String entity = "CV";
                String vendorName = "TestVMSBugs004";
                String tradingName = "TestVMSBugs004";
                String[][] contact = {
                                { "DAOSJ", "Finance", "62845049183", "jaja@gmail.com", "405592" },
                                { "TKPWE", "Sales", "6280130139", "jojo@gmail.com", "305958" }
                };
                String scopeOfWork = "Testing";
                String detailScopeOfWork = "TestingTesting";
                String dueDilType = "Inscope";
                String compliance = "SDL";
                String[][] businessCategory = {
                                { "After Sales Parts Business", "Chemical", "Oil" },
                                { "Digital Marketing", "Digital Marketing" },
                                { "IT matters", "Software / License", "Link" }
                };
                createVendorPage.fillGeneralInformation(vendorCategory, businessArea, type, entity,
                                vendorName,
                                tradingName,
                                contact,
                                scopeOfWork, detailScopeOfWork, dueDilType, compliance, businessCategory);

                // Fill Company Legality Documents
                String address = "Jl. Sunter No 11";
                String city = "Jakarta Utara";
                String country = "Indonesia";
                String postalCode = "51323";
                String[][] functionaryOfCompany = {
                                { "Dono", "CEO", "Dono@gmail.com" },
                                { "Supri", "CTO", "Supri@gmail.com" },
                                { "Asep", "CTO", "Asep@gmail.com" }
                };
                String[][] numberAndPathDocument = {
                                { "Akta Pendirian", "080910293", "/Users/rizalkurniawan/Downloads/dummy.pdf" },
                                { "Akta UUPT", "801923093", "/Users/rizalkurniawan/Downloads/dummy.pdf" },
                                { "Company Profile", "Ada", "/Users/rizalkurniawan/Downloads/dummy.pdf" }
                };
                createVendorPage.fillLegalityDocuments(address, city, country, postalCode, functionaryOfCompany,
                                numberAndPathDocument);

                // Fill Tax Information
                String npwp = "Yes";
                String npwpNumber = "8203928392012321";
                String npwpName = "TestTxtSAPMultiBank02JZq6celKy2DAiIbcfgd1TestTxtSAP MultiBank02JZq6celKy2DAiIbcfg1234";
                String npwpAddress = "JlSunterNo.11ABCDEGHIJKLMNOPQRSTUVWXYZ123 JlSunterNo.11ABCDEGHIJKLMNOPQRSTUVWXYZQ1234";
                String npwpCity = "Jakarta Utara";
                String npwpCountry = "Indonesia";
                String npwpPostalCode = "51323";
                String copyOfNpwp = "/Users/rizalkurniawan/Downloads/dummy.pdf";
                String skt = "/Users/rizalkurniawan/Downloads/dummy.pdf";
                String eFaktur = "Yes";
                String pkp = "Yes";
                String sppkp = "/Users/rizalkurniawan/Downloads/dummy.pdf";
                String sppkpNumber = "871230932";
                String nonPkp = "/Users/rizalkurniawan/Downloads/dummy.pdf";
                String hasSkb = "Yes";
                String skb = "/Users/rizalkurniawan/Downloads/dummy.pdf";
                String[] vat = { "V2 - PPN", "V6 - VAT-In 1.1%", "A1 - PPN Keluaran Reguler" };
                String[] wht = { "501 - Pelayaran Dalam Negeri yang dibayarkan/ terutang kepada perusahaan pelayaran DN",
                                "2205 - Transaksi Bendaharawan / Pemerintah - BUMN Tertentu",
                                "2315 - Jasa perancang (design)" };
                createVendorPage.fillTaxInformation(npwp, npwpNumber, npwpName, npwpAddress, npwpCity, npwpCountry,
                                npwpPostalCode, copyOfNpwp, skt, eFaktur, pkp, sppkp, sppkpNumber, nonPkp, hasSkb, skb,
                                vat, wht);

                // Fill Payment Information
                String[][] bankAccount = {
                                { "BCA - BCASC1", "Jakarta Utara", "IDR", "8091314", "PT.Testing",
                                                "/Users/rizalkurniawan/Downloads/dummy.pdf",
                                                "/Users/rizalkurniawan/Downloads/dummy.pdf",
                                                "/Users/rizalkurniawan/Downloads/dummy.pdf" },
                                // { "BNI - BNISC1", "Jakarta Utara", "IDR", "908131", "PT.Testing",
                                // "/Users/rizalkurniawan/Downloads/dummy.pdf",
                                // "/Users/rizalkurniawan/Downloads/dummy.pdf",
                                // "/Users/rizalkurniawan/Downloads/dummy.pdf" },
                                // { "BRI - BRISC1", "Jakarta Utara", "IDR", "908131", "PT.Testing",
                                // "/Users/rizalkurniawan/Downloads/dummy.pdf",
                                // "/Users/rizalkurniawan/Downloads/dummy.pdf",
                                // "/Users/rizalkurniawan/Downloads/dummy.pdf" }
                };
                createVendorPage.fillPaymentInformation(bankAccount);

                // Fill Vendor Cateogry
                String[] glTrade = { "Foreign/Import - Non Related" };
                String[] glNonTrade = { "Local - Non Related" };
                String searchTermTrade = vendorName + "-T";
                String searchTermNonTrade = vendorName + "-NT";
                createVendorPage.fillVendorCategory(glTrade, glNonTrade, searchTermTrade, searchTermNonTrade);

                // Fill Compliance Enhancements
                String transactionValue = "150000000";
                String[][] descAndRemarks = {
                                { "Company Website", "Dummy" },
                                { "Penelusuran Perkara", "Dummy" },
                                { "Latar Belakang / Pemegang Saham:", "Dummy" },
                                { "Informasi Umum (Sumber Google/ situs web resmi pihak ketiga)", "Dummy" },
                                { "Peta/ Lokasi Situs (Google Maps)", "Dummy" },
                                { "Informasi Perusahaan (Administrasi Hukum Umum/ Bursa Efek Indonesia (Perusahaan Publik))",
                                                "Dummy" },
                                { "Penelusuran informasi lainnya : Pers/Media", "Dummy" },
                                { "Penelusuran informasi lainnya : Pengadilan Hukum", "Dummy" },
                                { "Penelusuran informasi lainnya : News Center", "Dummy" },
                                { "Penelusuran informasi lainnya : Berita IDX", "Dummy" },
                };
                String dueDillNumber = "618012834";
                String dueDillAttachment = "/Users/rizalkurniawan/Downloads/dummy.pdf";
                String mitigationPlan = "Dummy";
                String expiredDate = "1";
                createVendorPage.fillComplianceEnhancements(transactionValue, descAndRemarks, dueDillNumber,
                                dueDillAttachment, mitigationPlan, expiredDate);

                // Submit vendor
                String remarks = "Testing";
                createVendorPage.submitVendor(remarks);
        }
}
