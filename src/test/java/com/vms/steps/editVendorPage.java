package com.vms.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.vms.common.BasePage;
import com.vms.objects.editVendorObject;
import com.vms.tests.editVendor;

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
        if (editVendorObject.inputTradingName().getText() != tradingName) {
            editVendorObject.inputTradingName().clear();
            editVendorObject.inputTradingName().sendKeys(tradingName);
        }

        // Update Contact Person
        int totalContactPerson = editVendorObject.tablerowContactPerson().size();
        for (int countContactPerson = 0; countContactPerson < contactPerson.length; countContactPerson++) {
            editVendorObject.buttonAddContactPerson().click();
            totalContactPerson++;
            editVendorObject.inputContactPersonNameDynamic(totalContactPerson)
                    .sendKeys(contactPerson[countContactPerson][0]);
            editVendorObject.inputContactPositionDynamic(totalContactPerson)
                    .sendKeys(contactPerson[countContactPerson][1]);
            editVendorObject.inputContactPhoneDynamic(totalContactPerson)
                    .sendKeys(contactPerson[countContactPerson][2]);
            editVendorObject.inputContactEmailDynamic(totalContactPerson)
                    .sendKeys(contactPerson[countContactPerson][3]);
            editVendorObject.inputContactNikDynamic(totalContactPerson)
                    .sendKeys(contactPerson[countContactPerson][4]);
        }
        // Update Company Phone 1
        if (editVendorObject.inputCompanyPhone1().getText() != companyPhone1) {
            editVendorObject.inputCompanyPhone1().clear();
            editVendorObject.inputCompanyPhone1().sendKeys(companyPhone1);
        }

        // Update Scope of Work
        if (editVendorObject.inputScopeOfWork().getText() != scopeOfWork) {
            editVendorObject.inputScopeOfWork().clear();
            editVendorObject.inputScopeOfWork().sendKeys(scopeOfWork);
        }

        // Update Detail Scope of Work
        if (editVendorObject.inputDetailScopeOfWork().getText() != detailScopeOfWork) {
            editVendorObject.inputDetailScopeOfWork().clear();
            editVendorObject.inputDetailScopeOfWork().sendKeys(detailScopeOfWork);
        }

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
        if (editVendorObject.inputAddress().getText() != address) {
            editVendorObject.inputAddress().clear();
            editVendorObject.inputAddress().sendKeys(address);
        }

        // Update City
        if (editVendorObject.inputCity().getText() != city) {
            editVendorObject.inputCity().clear();
            editVendorObject.inputCity().sendKeys(city);
        }

        // Update Country
        editVendorObject.comboboxCoutry().click();
        editVendorObject.selectCountryDynamic(country).click();

        // Update Postal Code
        if (editVendorObject.inputPostalCode().getText() != postalCode) {
            editVendorObject.inputPostalCode().clear();
            editVendorObject.inputPostalCode().sendKeys(postalCode);
        }

        // Update Functionary of Company
        int totalFunctionary = editVendorObject.tablerowFunctionaryOfCompany().size();
        for (int countFunctionary = 0; countFunctionary < functionaryOfCompany.length; countFunctionary++) {
            editVendorObject.buttonAddFunctionaryOfCompany().click();
            totalFunctionary++;
            editVendorObject.inputFunctionaryNameDynamic(totalFunctionary)
                    .sendKeys(functionaryOfCompany[countFunctionary][0]);
            editVendorObject.inputFunctionaryPositionDynamic(totalFunctionary)
                    .sendKeys(functionaryOfCompany[countFunctionary][1]);
            editVendorObject.inputFunctionaryEmailDynamic(totalFunctionary)
                    .sendKeys(functionaryOfCompany[countFunctionary][2]);
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

    public void updateTaxInformation(String npwp, String npwpNumber, String npwpName, String npwpAddress,
            String npwpCity, String npwpCountry, String npwpPostalCode, String copyOfNpwp, String skt, String eFaktur,
            String pkp, String sppkp, String sppkpNumber, String nonPkp, String hasSkb, String skb, String[] vat,
            String[] wht) {
        // Open Tax Information Tab
        editVendorObject.divTaxInformation().click();
        wait.until(ExpectedConditions.visibilityOf(editVendorObject.comboboxNpwp()));

        // Update NPWP
        if (npwp != "") {
            editVendorObject.comboboxNpwp().clear();
            editVendorObject.selectNpwpDynamic(npwp.toLowerCase()).click();
        }

        // Update NPWP Number
        if (npwp != "") {
            editVendorObject.inputNpwpNumber().clear();
            editVendorObject.inputNpwpNumber().sendKeys(npwpNumber);
        }

        // Update NPWP Name
        if (npwpName != "") {
            editVendorObject.inputNpwpName().clear();
            editVendorObject.inputNpwpName().sendKeys(npwpName);
        }

        // Update NPWP Address
        if (npwpAddress != "") {
            editVendorObject.inputNpwpAddress().clear();
            editVendorObject.inputNpwpAddress().sendKeys(npwpAddress);
        }

        // Update NPWP City
        if (npwpCity != "") {
            editVendorObject.inputNpwpCity().clear();
            editVendorObject.inputNpwpCity().sendKeys(npwpCity);
        }

        // Update Npwp Country

        // Update NPWP Postal Code
        if (npwpPostalCode != "") {
            editVendorObject.inputNpwpPostalCode().clear();
            editVendorObject.inputNpwpPostalCode().sendKeys(npwpPostalCode);
        }

        // Update Copy of NPWP
        if (copyOfNpwp != "") {
            editVendorObject.uploadCopyOfNpwp().sendKeys(copyOfNpwp);
        }

        // Upload SKT
        if (skt != "") {
            editVendorObject.uploadSkt().sendKeys(skt);
        }

        // Update eFaktur
        if (eFaktur != "") {
            editVendorObject.comboboxEFaktur().click();
            editVendorObject.selectEFakturDynamic(eFaktur.toLowerCase()).click();
        }

        // Update PKP
        if (pkp != "") {
            editVendorObject.comboboxPkp().click();
            editVendorObject.selectPkpDynamic(pkp.toLowerCase()).click();
        }

        // Update SPPKP
        if (sppkp != "" && pkp == "Yes") {
            editVendorObject.uploadSppkp().sendKeys(sppkp);
        }

        // Update SPPKP Number
        if (sppkpNumber != "" && pkp == "Yes") {
            editVendorObject.inputSppkpNumber().clear();
            editVendorObject.inputSppkpNumber().sendKeys(sppkpNumber);
        }

        // Update Non PKP
        if (nonPkp != "" && pkp == "No") {
            editVendorObject.uploadNonPkp().sendKeys(nonPkp);
        }

        // Update Has SKB
        if (hasSkb != "") {
            editVendorObject.comboboxHasSkb().click();
            editVendorObject.selectHasSkbDynamic(skb.toLowerCase()).click();
        }

        // Update SKB
        if (skb != "" && hasSkb == "Yes") {
            editVendorObject.uploadSkb().sendKeys(skb);
        }

        // Update VAT
        if (vat.length > 0 && pkp == "Yes") {
            editVendorObject.buttonAddVat().click();
            sleep(500);
            for (int countVat = 0; countVat < vat.length; countVat++) {
                String vatTemp = vat[countVat].replaceFirst("^(\\w+).*", "$1");
                editVendorObject.inputSearchVat().clear();
                editVendorObject.inputSearchVat().sendKeys(vatTemp.toLowerCase());
                sleep(500);
                editVendorObject.checkboxVatDynamic(vat[countVat]).click();
            }
            editVendorObject.buttonSaveVat().click();
            sleep(500);
        }

        // Update WHT
        if (wht.length > 0) {
            editVendorObject.buttonAddWht().click();
            sleep(500);
            for (int countWht = 0; countWht < wht.length; countWht++) {
                String whtTemp = wht[countWht].replaceFirst("^(\\w+).*", "$1");
                editVendorObject.inputSearchWht().clear();
                editVendorObject.inputSearchWht().sendKeys(whtTemp.toLowerCase());
                sleep(500);
                editVendorObject.checkboxWhtDynamic(wht[countWht]).click();
            }
            editVendorObject.buttonSaveWht().click();
            sleep(500);
        }
        scrollToTop();
        editVendorObject.divTaxInformation().click();
    }

    public void updatePaymentInformation(String[][] bankAccounts) {
        editVendorObject.divPaymentInformation().click();
        wait.until(ExpectedConditions.visibilityOf(editVendorObject.buttonAddBankAccount()));

        // Update bank account
        int totalBankAccount = editVendorObject.tableBankAccount().size();
        for (int countBankAccount = 0; countBankAccount < bankAccounts.length; countBankAccount++) {
            editVendorObject.buttonAddBankAccount().click();
            totalBankAccount++;
            scrollRightOnElement(editVendorObject.buttonEditBankAccount(totalBankAccount));
            editVendorObject.buttonEditBankAccount(totalBankAccount).click();
            sleep(500);
            editVendorObject.comboBoxBankName().click();
            editVendorObject.selectBankNameDynamic(bankAccounts[countBankAccount][0]).click();
            editVendorObject.inputBranch().sendKeys(bankAccounts[countBankAccount][1]);
            editVendorObject.comboBoxCurrency().click();
            editVendorObject.selectCurrencyDynamic(bankAccounts[countBankAccount][2]).click();
            editVendorObject.inputAccountNumber().sendKeys(bankAccounts[countBankAccount][3]);
            editVendorObject.inputAccountName().sendKeys(bankAccounts[countBankAccount][4]);
            editVendorObject.uploadHeaderRekening().sendKeys(bankAccounts[countBankAccount][5]);
            editVendorObject.uploadBankInformation().sendKeys(bankAccounts[countBankAccount][6]);
            editVendorObject.uploadFinanceConfirmation().sendKeys(bankAccounts[countBankAccount][7]);
            editVendorObject.buttonSaveBankAccount().click();
            sleep(500);
        }

        scrollToTop();
        editVendorObject.divPaymentInformation().click();
    }

    public void updateVendorCategory() {

    }

    public void updateComplianceEnhancement(String transactionValue, String[][] descAndRemarks, String dueDilNumber,
            String dueDillAttachment, String mitigationPlan, String expiredDate) {
        editVendorObject.divComplianceEnhancements().click();
        wait.until(ExpectedConditions.visibilityOf(editVendorObject.inputTransactionValue()));

        // Update compliance enchancement

        scrollToTop();
        editVendorObject.divComplianceEnhancements().click();
    }

    public void submitUpdateVendor() {
        // Submit vendor
        editVendorObject.buttonSubmitVendor().click();
        sleep(500);
        editVendorObject.buttonConfirmSubmitVendor().click();
        sleep(1000);
    }

}
