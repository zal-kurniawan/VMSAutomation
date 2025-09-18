package com.vms.steps;

import org.openqa.selenium.WebDriver;
import com.vms.common.BasePage;
import com.vms.objects.editVendorObject;

public class editVendorPage extends BasePage {
    private editVendorObject editVendorObject;
    public boolean isTrade, isNonTrade;

    public editVendorPage(WebDriver driver) {
        super(driver);
        this.editVendorObject = new editVendorObject(driver);
    }

    public void updateGeneralInformation(String[] vendorCategory, String[] businessArea, String tradingName,
            String[][] contactPerson, String companyPhone1, String scopeOfWork, String detailScopeOfWork,
            String[][] businessCategory) {

        // Set Vendor Category
        for (String category : vendorCategory) {
            if (category.equals("trade")) {
                isTrade = true;
            }
            if (category.equalsIgnoreCase("nontrade") || category.equals("non-trade")) {
                isNonTrade = true;
            }
        }

        // Open General Information Tab
        editVendorObject.divGeneralInformation().click();
        sleep(500);

        // Update Business Area
        if (isTrade) {
            editVendorObject.buttonAddBusinessArea().click();
            sleep(500);
            for (int countBusinessArea = 0; countBusinessArea < businessArea.length; countBusinessArea++) {
                editVendorObject.checkboxBusinessAreaDynamic(businessArea[countBusinessArea]).click();
            }
            editVendorObject.buttonSaveBusinessArea().click();
            sleep(500);
        }
        // Update Trading Name
        editVendorObject.inputTradingName().clear();
        editVendorObject.inputTradingName().sendKeys(tradingName);

        // Update Contact Person
        int totalContactPerson = editVendorObject.tablerowContactPerson().size();
        for (int countContactPerson = 0; countContactPerson < contactPerson.length; countContactPerson++) {
            editVendorObject.buttonAddContactPerson().click();
            editVendorObject.inputContactPersonNameDynamic(totalContactPerson + 1)
                    .sendKeys(contactPerson[countContactPerson][0]);
            editVendorObject.inputContactPositionDynamic(totalContactPerson + 1)
                    .sendKeys(contactPerson[countContactPerson][1]);
            editVendorObject.inputContactPhoneDynamic(totalContactPerson + 1)
                    .sendKeys(contactPerson[countContactPerson][2]);
            editVendorObject.inputContactEmailDynamic(totalContactPerson + 1)
                    .sendKeys(contactPerson[countContactPerson][3]);
            editVendorObject.inputContactNikDynamic(totalContactPerson + 1)
                    .sendKeys(contactPerson[countContactPerson][4]);
            totalContactPerson++;
        }
        // Update Company Phone 1
        editVendorObject.inputCompanyPhone1().clear();
        editVendorObject.inputCompanyPhone1().sendKeys(companyPhone1);

        // Update Scope of Work
        editVendorObject.inputScopeOfWork().clear();
        editVendorObject.inputScopeOfWork().sendKeys(scopeOfWork);

        // Update Detail Scope of Work
        editVendorObject.inputDetailScopeOfWork().clear();
        editVendorObject.inputDetailScopeOfWork().sendKeys(detailScopeOfWork);

        // Update Business Category
        editVendorObject.buttonAddBusinessCategory().click();
        sleep(1000);
        for (int countBusinessClassification = 0; countBusinessClassification < businessCategory.length; countBusinessClassification++) {
            editVendorObject.checkboxBusinessClasificationDynamic(businessCategory[countBusinessClassification][0])
                    .click();
            sleep(500);
            for (int countBusinessCategory = 1; countBusinessCategory < businessCategory[countBusinessClassification].length; countBusinessCategory++) {
                editVendorObject.checkboxBusinessCategoryDynamic(
                        businessCategory[countBusinessClassification][countBusinessCategory]).click();
            }
        }
        editVendorObject.buttonSaveBusinessCategory().click();

        // Close General Information Tab
        scrollToTop();
        editVendorObject.divGeneralInformation().click();
        sleep(500);
    }

    public void updateCompanyLegality(String address, String city, String country, String postalCode,
            String[][] functionaryOfCompany, String[][] numberAndPathDocument) {
        // Open Company Legality Tab
        editVendorObject.divCompanyLegality().click();
        sleep(500);

        // Update Address
        editVendorObject.inputAddress().clear();
        editVendorObject.inputAddress().sendKeys(address);

        // Update City
        editVendorObject.inputCity().clear();
        editVendorObject.inputCity().sendKeys(city);

        // Update Country
        editVendorObject.comboboxCoutry().click();
        editVendorObject.selectCountryDynamic(country).click();

        // Update Postal Code
        editVendorObject.inputPostalCode().clear();
        editVendorObject.inputPostalCode().sendKeys(postalCode);

        // Update Functionary of Company
        int totalFunctionary = editVendorObject.tablerowFunctionaryOfCompany().size();
        for (int countFunctionary = 0; countFunctionary < functionaryOfCompany.length; countFunctionary++) {
            editVendorObject.buttonAddFunctionaryOfCompany().click();
            editVendorObject.inputFunctionaryNameDynamic(totalFunctionary + 1)
                    .sendKeys(functionaryOfCompany[countFunctionary][0]);
            editVendorObject.inputFunctionaryPositionDynamic(totalFunctionary + 1)
                    .sendKeys(functionaryOfCompany[countFunctionary][1]);
            editVendorObject.inputFunctionaryEmailDynamic(totalFunctionary + 1)
                    .sendKeys(functionaryOfCompany[countFunctionary][2]);
            totalFunctionary++;
        }

        // Update Document Legality
        for (int countDocument = 0; countDocument < numberAndPathDocument.length; countDocument++) {
            editVendorObject.inputDocumentRemarksDynamic(numberAndPathDocument[countDocument][0])
                    .sendKeys(numberAndPathDocument[countDocument][1]);
            editVendorObject.uploadDocumentDynamic(numberAndPathDocument[countDocument][0])
                    .sendKeys(numberAndPathDocument[countDocument][2]);
        }

        // Close Company Legality Tab
        scrollToTop();
        editVendorObject.divCompanyLegality().click();
        sleep(500);
    }

    public void updateTaxInformation() {

    }

    public void updatePaymentInformation() {

    }

    public void updateVendorCategory() {

    }

    public void updateComplianceEnhancement() {

    }

    public void submitUpdateVendor() {
        // Submit vendor
        editVendorObject.buttonSubmitVendor().click();
        sleep(500);
        editVendorObject.buttonConfirmSubmitVendor().click();
        sleep(1000);
    }

}
