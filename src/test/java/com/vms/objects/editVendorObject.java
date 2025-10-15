package com.vms.objects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class editVendorObject {
    private WebDriver driver;

    public editVendorObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement divGeneralInformation() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-stage = '1']"));
    }

    public WebElement divCompanyLegality() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-stage = '2']"));
    }

    public WebElement divTaxInformation() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-stage = '3']"));
    }

    public WebElement divPaymentInformation() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-stage = '4']"));
    }

    public WebElement divVendorCategory() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-stage = '5']"));
    }

    public WebElement divComplianceEnhancements() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-stage = '6']"));
    }

    public WebElement buttonAddBusinessArea() {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//label[text() = 'Business Area']/following-sibling::div/button"));
    }

    public WebElement checkboxBusinessAreaDynamic(String text) {
        return driver
                .findElement(By.xpath("//div[@id = 'BusinessAreaModal'][1]//label[contains(.,'" + text + "')]/input"));
    }

    public WebElement buttonSaveBusinessArea() {
        return driver.findElement(
                By.xpath("//div[@id = 'BusinessAreaModal'][1]//button[@id = 'btnSaveCreateBusinessCategory']"));
    }

    public WebElement inputTradingName() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@id = 'trading-name']"));
    }

    public List<WebElement> tablerowContactPerson() {
        return driver.findElements(
                By.xpath("//*//div[@class = 'editdata']//table[@id = 'contact-person-table']//tbody//tr"));
    }

    public WebElement buttonAddContactPerson() {
        return driver.findElement(
                By.xpath("//*//div[@class = 'editdata']//button[@data-table-id = 'contact-person-table']"));
    }

    public WebElement inputContactPersonNameDynamic(int count) {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'contact-person-table']//tr[" + count
                        + "]//textarea[contains(@class, 'contact-name')]"));
    }

    public WebElement inputContactPositionDynamic(int count) {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'contact-person-table']//tr[" + count
                        + "]//textarea[contains(@class, 'contact-position')]"));
    }

    public WebElement inputContactPhoneDynamic(int count) {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'contact-person-table']//tr[" + count
                        + "]//textarea[contains(@class, 'contact-phone')]"));
    }

    public WebElement inputContactEmailDynamic(int count) {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'contact-person-table']//tr[" + count
                        + "]//textarea[contains(@class, 'contact-email')]"));
    }

    public WebElement inputContactNikDynamic(int count) {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'contact-person-table']//tr[" + count
                        + "]//textarea[contains(@class, 'contact-nik')]"));
    }

    public WebElement inputCompanyPhone1() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'company-phone-1']"));
    }

    public WebElement inputCompanyPhone2() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'company-phone-2']"));
    }

    public WebElement inputScopeOfWork() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@id = 'scope-of-work']"));
    }

    public WebElement inputDetailScopeOfWork() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@id = 'detail-scope-of-work']"));
    }

    public WebElement buttonAddBusinessCategory() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@id = 'addBusinessButton']"));
    }

    public WebElement checkboxBusinessClasificationDynamic(String text) {
        return driver.findElement(By.xpath(
                "//div[@id = 'inputBusinessModal']//div[contains(@class, 'modal-body')]/div[1]//label[contains(., '"
                        + text + "')]/input"));
    }

    public WebElement checkboxBusinessCategoryDynamic(String text) {
        return driver.findElement(By.xpath(
                "//div[@id = 'inputBusinessModal']//div[contains(@class, 'modal-body')]/div[2]//label[contains(., '"
                        + text + "')]/input"));
    }

    public WebElement buttonSaveBusinessCategory() {
        return driver.findElement(By.xpath("//div[@id = 'inputBusinessModal']//button[@id = 'saveBussinessData']"));
    }

    public WebElement inputAddress() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@id = 'address']"));
    }

    public WebElement inputCity() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@id = 'city']"));
    }

    public WebElement comboboxCoutry() {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//select[contains(@id, 'country')]/following-sibling::span//span[@role = 'combobox']"));
    }

    public WebElement selectCountryDynamic(String text) {
        return driver.findElement(By.xpath(
                "//*//ul[@id = 'select2-country-company-domicile-results']//li[contains(., '" + text + "')]"));
    }

    public WebElement inputPostalCode() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'postalcode']"));
    }

    public List<WebElement> tablerowFunctionaryOfCompany() {
        return driver.findElements(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'functionary-table']/tbody/tr"));
    }

    public WebElement buttonAddFunctionaryOfCompany() {
        return driver.findElement(
                By.xpath("//*//div[@class = 'editdata']//button[@data-table-id = 'functionary-table']"));
    }

    public WebElement inputFunctionaryNameDynamic(int count) {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'functionary-table']//tr[" + count
                        + "]//td[2]//textarea"));
    }

    public WebElement inputFunctionaryPositionDynamic(int count) {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'functionary-table']//tr[" + count
                        + "]//td[3]/textarea"));
    }

    public WebElement inputFunctionaryEmailDynamic(int count) {
        return driver.findElement(By
                .xpath("//*//div[@class = 'editdata']//table[@id = 'functionary-table']//tr[" + count
                        + "]//td[4]/textarea"));
    }

    public WebElement inputDocumentRemarksDynamic(String text) {
        return driver
                .findElement(By.xpath("//*//div[@class = 'editdata']//td[contains(text(), '" + text
                        + "')]//following-sibling::td[1]//textarea"));
    }

    public WebElement uploadDocumentDynamic(String text) {
        return driver
                .findElement(By.xpath("//*//div[@class = 'editdata']//td[contains(text(), '" + text
                        + "')]//following-sibling::td[3]//input[@type = 'file']"));
    }

    public WebElement comboboxNpwp() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//select[@id = 'npwpSelection']"));
    }

    public WebElement selectNpwpDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//div[@class = 'editdata']//select[@id = 'npwpSelection']/option[contains(., '" + text
                        + "')]"));
    }

    public WebElement inputNpwpNumber() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'npwpNumber']"));
    }

    public WebElement inputNpwpName() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@id = 'npwpHolderName']"));
    }

    public WebElement inputNpwpAddress() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@id = 'npwpAddress']"));
    }

    public WebElement inputNpwpCity() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@id = 'npwpCity']"));
    }

    public WebElement comboboxNpwpCountry() {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//*//span[@id = 'select2-npwpCountry-container']/.."));
    }

    public WebElement selectNpwpCountryDynamic(String text) {
        return driver.findElement(By.xpath(
                "//*//ul[@id = 'select2-npwpCountry-results']//li[contains(text(), '" + text
                        + "')]"));
    }

    public WebElement inputNpwpPostalCode() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'npwpPostalCode']"));
    }

    public WebElement buttonDeleteCopyOfNpwp() {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//label[text() = 'Copy of NPWP']/following-sibling::button[contains(@class, 'btn-delete')]"));
    }

    public WebElement uploadCopyOfNpwp() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'npwpFileUpload']"));
    }

    public WebElement buttonDeleteSkt() {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//label[text() = 'SKT']/following-sibling::button[contains(@class, 'btn-delete')]"));
    }

    public WebElement uploadSkt() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'sktFileUpload']"));
    }

    public WebElement comboboxEFaktur() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//select[@id = 'efaktur']"));
    }

    public WebElement selectEFakturDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//div[@class = 'editdata']//select[@id = 'efaktur']/option[text() = '" + text + "']"));
    }

    public WebElement comboboxPkp() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//select[@id = 'pkp']"));
    }

    public WebElement selectPkpDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//div[@class = 'editdata']//select[@id = 'pkp']/option[text() = '" + text + "']"));
    }

    public WebElement buttonDeleteSppkp() {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//label[text() = 'SPPKP']/following-sibling::button[contains(@class, 'btn-delete')]"));
    }

    public WebElement uploadSppkp() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'sppkp-upload']"));
    }

    public WebElement inputSppkpNumber() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'sppkpNum']"));
    }

    public WebElement buttonDeleteNonPkp() {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//label[text() = 'Evidence Non PKP']/following-sibling::button[contains(@class, 'btn-delete')]"));
    }

    public WebElement uploadNonPkp() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'evidence-upload']"));
    }

    public WebElement comboboxHasSkb() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//select[@id = 'skb']"));
    }

    public WebElement selectHasSkbDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//div[@class = 'editdata']//select[@id = 'skb']/option[text() = '" + text + "']"));
    }

    public WebElement buttonDeleteSkb() {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//label[text() = 'SKB']/following-sibling::button[contains(@class, 'btn-delete')]"));
    }

    public WebElement uploadSkb() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'skbDoc-upload']"));
    }

    public List<WebElement> tableVat() {
        return driver.findElements(By.xpath("//*//div[@class = 'editdata']//table[@id = 'vat-table']/tbody/tr"));
    }

    public WebElement buttonAddVat() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-table-id = 'vat-table']"));
    }

    public WebElement buttonEditVatDynamic(int count) {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//table[@id = 'vat-table']/tbody/tr[" + count
                + "]//button[@class = 'edit-row']"));
    }

    public WebElement inputSearchVat() {
        return driver
                .findElement(By.xpath("//*//div[@id = 'VATGrid']//input[@aria-label = 'Transaction Type']"));
    }

    public WebElement checkboxVatDynamic(String text) {
        return driver.findElement(By.xpath(
                "//*//div[@id = 'VATGrid']//td[contains(text(), '" + text + ")]/../td/input"));
    }

    public WebElement buttonSaveVat() {
        return driver.findElement(By.xpath("//*//div[@id = 'VATModal']//button[@id = 'btnSaveVAT']"));
    }

    public List<WebElement> tableWht() {
        return driver.findElements(By.xpath("//*//div[@class = 'editdata']//table[@id = 'wht-table']/tbody/tr"));
    }

    public WebElement buttonAddWht() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-table-id = 'wht-table']"));
    }

    public WebElement buttonEditWhtDynamic(int count) {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//table[@id = 'wht-table']/tbody/tr[" + count
                + "]//button[@class = 'edit-row']"));
    }

    public WebElement inputSearchWht() {
        return driver
                .findElement(By.xpath("//*//div[@id = 'WHTGrid']//input[@aria-label = 'Transaction Type']"));
    }

    public WebElement checkboxWhtDynamic(String text) {
        return driver.findElement(By.xpath(
                "//*//div[@id = 'WHTGrid']//td[contains(text(), '" + text + ")]/../td/input"));
    }

    public WebElement buttonSaveWht() {
        return driver.findElement(By.xpath("//*//div[@id = 'WHTModal']//button[@id = 'btnSaveWHT']"));
    }

    public List<WebElement> tableBankAccount() {
        return driver
                .findElements(By.xpath("//*//div[@class = 'editdata']//table[@id = 'bank-account-table']/tbody/tr"));
    }

    public WebElement buttonAddBankAccount() {
        return driver
                .findElement(By.xpath("//*//div[@class = 'editdata']//button[@data-table-id = 'bank-account-table']"));
    }

    public WebElement buttonEditBankAccount(int count) {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//table[@id = 'bank-account-table']/tbody/tr[" + count
                        + "]//button[@class = 'edit-row']"));
    }

    public WebElement comboBoxBankName() {
        return driver.findElement(
                By.xpath("//*//select[@id = 'bank-name']/following-sibling::span//span[@role = 'combobox']"));
    }

    public WebElement selectBankNameDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//ul[@id = 'select2-bank-name-results']/li[contains(text(), '" + text + "')]"));
    }

    public WebElement inputBranch() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'branch']"));
    }

    public WebElement comboBoxCurrency() {
        return driver.findElement(
                By.xpath("//*//select[@id = 'bank-currency']/following-sibling::span//span[@role = 'combobox']"));
    }

    public WebElement selectCurrencyDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//ul[@id = 'select2-bank-currency-results']/li[contains(text(), '" + text + "')]"));
    }

    public WebElement inputAccountNumber() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'accountNumber']"));
    }

    public WebElement inputAccountName() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'accountName']"));
    }

    public WebElement uploadHeaderRekening() {
        return driver.findElement(By.xpath("//*//input[@id = 'header-rekening-koran']"));
    }

    public WebElement uploadBankInformation() {
        return driver.findElement(By.xpath("//*//input[@id = 'bank-info-letter']"));
    }

    public WebElement uploadFinanceConfirmation() {
        return driver.findElement(By.xpath("//*//input[@id = 'finance-confirmation']"));
    }

    public WebElement buttonSaveBankAccount() {
        return driver.findElement(By.xpath("//*//button[@id = 'btnSaveCreateBankAccount']"));
    }

    public WebElement inputTransactionValue() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//input[@id = 'estimasi_nilai_trx']"));
    }

    public WebElement inputDescAndRemarksDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//div[@class = 'editdata']//table[@id = 'compliance-enhancement-table']//input[@value = '"
                        + text + "']/../following-sibling::td/textarea"));
    }

    public WebElement inputDueDilNumber() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@name = 'due-diligence-number']"));
    }

    public WebElement uploadDueDilAttachment() {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//td[text() = 'Due Diligence Attachment']/following-sibling::td//div[@class = 'file-upload']/input[@type = 'file']"));
    }

    public WebElement inputMitigationPlan() {
        return driver.findElement(By.xpath("//*//div[@class = 'editdata']//textarea[@name = 'mitigation-plan']"));
    }

    public WebElement radioButtonExpiredDateDynamic(String text) {
        return driver.findElement(By.xpath(
                "//*//div[@class = 'editdata']//div[contains(text(), '" + text + "')]/../div[@class = 'color-box']"));
    }

    public WebElement buttonSubmitVendor() {
        return driver.findElement(By.xpath("//*//button[@id = 'btnSubmit']"));
    }

    public WebElement buttonConfirmSubmitVendor() {
        return driver.findElement(By.xpath("//*//div[@id = 'ConfirmEditModal']//button[text() = 'Yes']"));
    }

}
