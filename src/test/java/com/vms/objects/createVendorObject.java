package com.vms.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createVendorObject {
    private WebDriver driver;

    public createVendorObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement divGeneralInformation() {
        return driver.findElement(By.xpath("//*//button[contains(text(), 'General')]"));
    }

    public WebElement divLegalityDocuments() {
        return driver.findElement(By.xpath("//*//button[contains(text(), 'Legality')]"));
    }

    public WebElement divTaxInformation() {
        return driver.findElement(By.xpath("//*//button[contains(text(), 'Tax')]"));
    }

    public WebElement divPaymentInformation() {
        return driver.findElement(By.xpath("//*//button[contains(text(), 'Payment')]"));
    }

    public WebElement divVendorCategory() {
        return driver.findElement(By.xpath("//*//button[contains(text(), 'Vendor')]"));
    }

    public WebElement divComplianceEnhancements() {
        return driver.findElement(By.xpath("//*//button[contains(text(), 'Compliance')]"));
    }

    public WebElement checkboxTrade() {
        return driver.findElement(By.xpath("//*//input[@id = 'trade']"));
    }

    public WebElement checkboxNonTrade() {
        return driver.findElement(By.xpath("//*//input[@id = 'non-trade']"));
    }

    public WebElement buttonBusinessArea() {
        return driver.findElement(By.xpath("//div[@id = 'div-business-area']//button[@id = 'openModalBtn']"));
    }

    public WebElement checkBoxBusinessAreaDyanmic(String text) {
        return driver.findElement(By.xpath("//div[@id = 'BusinessAreaModal'][1]//label[text() = ' " + text + "']"));
    }

    public WebElement buttonSaveBusinessArea() {
        return driver.findElement(By.xpath("//div[@id = 'BusinessAreaModal'][1]//button[text() = 'Save']"));
    }

    public WebElement radioButtonTypeCompany() {
        return driver.findElement(By.xpath("//*//input[@type = 'radio' and @id = 'company']"));
    }

    public WebElement radioButtonTypeProfessional() {
        return driver.findElement(By.xpath("//*//input[@type = 'radio' and @id = 'professional']"));
    }

    public WebElement inputVendorName() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'vendor-name-textbox']"));
    }

    public WebElement dropdownBusinessEntityDynamic(String text) {
        return driver
                .findElement(By.xpath("//*//select[@id = 'vendor-name-ddl']/option[contains(text(), '" + text + "')]"));
    }

    public WebElement inputTradingName() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'trading-name']"));
    }

    public WebElement buttonAddContact() {
        return driver.findElement(By.xpath("//*//button[@data-table-id ='contact-person-table']"));
    }

    public WebElement inputContactNameDynamic(int count) {
        return driver.findElement(By.xpath("//*//tr[" + count + "]//textarea[contains(@class, 'contact-name')]"));
    }

    public WebElement inputContactPositionDynamic(int count) {
        return driver.findElement(By.xpath("//*//tr[" + count + "]//textarea[contains(@class, 'contact-position')]"));
    }

    public WebElement inputContactPhoneDynamic(int count) {
        return driver.findElement(By.xpath("//*//tr[" + count + "]//textarea[contains(@class, 'contact-phone')]"));
    }

    public WebElement inputContactEmailDynamic(int count) {
        return driver.findElement(By.xpath("//*//tr[" + count + "]//textarea[contains(@class, 'contact-email')]"));
    }

    public WebElement inputContactNIKDynamic(int count) {
        return driver.findElement(By.xpath("//*//tr[" + count + "]//textarea[contains(@class, 'contact-nik')]"));
    }

    public WebElement inputCompanyPhone1() {
        return driver.findElement(By.xpath("//*//input[@id = 'company-phone-1']"));
    }

    public WebElement inputCompanyPhone2() {
        return driver.findElement(By.xpath("//*//input[@id = 'company-phone-2']"));
    }

    public WebElement inputScopeOfWork() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'scope-of-work']"));
    }

    public WebElement inputDetailScopeOfWork() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'detail-scope-of-work']"));
    }

    public WebElement radioButtonInscopeDilligence() {
        return driver.findElement(By.xpath("//*//input[contains(@id, 'Inscope Due')]"));
    }

    public WebElement radioButtonOutscopeDilligence() {
        return driver.findElement(By.xpath("//*//input[contains(@id, 'Outscope Due')]"));
    }

    public WebElement radioButtonComplianceFlowSDL() {
        return driver.findElement(By.xpath("//*//input[contains(@id, 'flow-SDL')]"));
    }

    public WebElement radioButtonComplianceFlowNonSDL() {
        return driver.findElement(By.xpath("//*//input[contains(@id, 'flow-Non_SDL')]"));
    }

    public WebElement buttonAddBusiness() {
        return driver.findElement(By.xpath("//*//button[@id = 'addBusinessButton']"));
    }

    public WebElement checkboxBusinessClasificationDynamic(String text) {
        return driver.findElement(By.xpath(
                "//*//div[@id = 'inputBusinessModal']//div[contains(@class, 'modal-body')]/div[1]//label[contains(., '"
                        + text + "')]/input"));
    }

    public WebElement checkboxBusinessCategoryDynamic(String text) {
        return driver.findElement(By.xpath(
                "//*//div[@id = 'inputBusinessModal']//div[contains(@class, 'modal-body')]/div[2]//label[contains(., '"
                        + text + "')]/input"));
    }

    public WebElement buttonSaveBusiness() {
        return driver.findElement(By.xpath("//*//button[@id = 'saveBussinessData']"));
    }

    public WebElement inputAddress() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'address']"));
    }

    public WebElement inputCity() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'city']"));
    }

    public WebElement inputPostalCode() {
        return driver.findElement(By.xpath("//*//input[@id = 'postalcode']"));
    }

    public WebElement comboBoxCountry() {
        return driver.findElement(
                By.xpath("//*//select[contains(@id, 'country')]/following-sibling::span//span[@role = 'combobox']"));
    }

    public WebElement selectCountryDynamic(String text) {
        return driver
                .findElement(By.xpath("//*//span[contains(@class, \"select2-result\")]//li[text() = '" + text + "']"));
    }

    public WebElement inputFunctionaryOfCompanyDynamic(int count1, int count2) {
        return driver
                .findElement(By.xpath(
                        "//*//table[@id = 'functionary-table']//tr[" + count1 + "]/td[" + count2 + "]//textarea"));
    }

    public WebElement buttonAddFunctionaryOfCompany() {
        return driver.findElement(By.xpath("//*//button[@data-table-id = 'functionary-table']"));
    }

    public WebElement inputDocumentNumberDynamic(String text) {
        return driver
                .findElement(By.xpath("//*//td[contains(text(), '" + text + "')]//following-sibling::td[1]//textarea"));
    }

    public WebElement uploadLegalityDocumentsDynamic(String text) {
        return driver
                .findElement(By.xpath("//*//td[contains(text(), '" + text + "')]//following-sibling::td[3]//input"));
    }

    public WebElement comboBoxNpwp() {
        return driver.findElement(By.xpath("//*//select[@id = 'npwpSelection']"));
    }

    public WebElement selectNpwpDynamic(String text) {
        return driver.findElement(By.xpath("//*//select[@id = 'npwpSelection']/option[@value = '" + text + "']"));
    }

    public WebElement inputNpwpNumber() {
        return driver.findElement(By.xpath("//*//input[@id = 'npwpNumber']"));
    }

    public WebElement inputNpwpName() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'npwpHolderName']"));
    }

    public WebElement inputNpwpAddress() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'npwpAddress']"));
    }

    public WebElement inputNpwpCity() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'npwpCity']"));
    }

    public WebElement comboBoxNpwpCountry() {
        return driver.findElement(By.xpath("//*//span[@id = 'select2-npwpCountry-container']/.."));
    }

    public WebElement selectNpwpCountryDynamic(String text) {
        return driver.findElement(By.xpath("//*//ul[@id = 'select2-npwpCountry-results']/li[text() = '" + text + "']"));
    }

    public WebElement inputNpwpPostalCode() {
        return driver.findElement(By.xpath("//*//input[@id = 'npwpPostalCode']"));
    }

    public WebElement uploadCopyOfNpwp() {
        return driver.findElement(By.xpath("//*/label[text() = 'Copy of NPWP']/..//input"));
    }

    public WebElement uploadSkt() {
        return driver.findElement(By.xpath("//*/label[text() = 'SKT']/following-sibling::div[1]/input"));
    }

    public WebElement comboBoxEfaktur() {
        return driver.findElement(By.xpath("//*//select[@id = 'efaktur']"));
    }

    public WebElement selectEfakturDynamic(String text) {
        return driver.findElement(By.xpath("//*//select[@id = 'efaktur']/option[@value = '" + text + "']"));
    }

    public WebElement comboBoxPkp() {
        return driver.findElement(By.xpath("//*//select[@id = 'pkp']"));
    }

    public WebElement selectPkpDynamic(String text) {
        return driver.findElement(By.xpath("//*//select[@id = 'pkp']/option[@value = '" + text + "']"));
    }

    public WebElement uploadSppkp() {
        return driver.findElement(By.xpath("//*/label[text() = 'SPPKP']/following-sibling::div[1]/input"));
    }

    public WebElement inputSppkpNumber() {
        return driver.findElement(By.xpath("//*//textarea[@id = 'sppkpNum']"));
    }

    public WebElement uploadNonPkp() {
        return driver.findElement(By.xpath("//*/label[text() = 'Evidence Non PKP']/following-sibling::div[1]/input"));
    }

    public WebElement comboBoxSkb() {
        return driver.findElement(By.xpath("//*//select[@id = 'skb']"));
    }

    public WebElement selectSkbDynamic(String text) {
        return driver.findElement(By.xpath("//*//select[@id = 'skb']/option[@value = '" + text + "']"));
    }

    public WebElement uploadSkb() {
        return driver.findElement(By.xpath("//*/label[text() = 'SKB']/following-sibling::div[1]/input"));
    }

    public WebElement buttonAddVat() {
        return driver.findElement(By.xpath("//*//table[@id = 'vat-table']//button"));
    }

    public WebElement inputSearchVat() {
        return driver
                .findElement(By.xpath("//*//div[@id = 'VATGrid']//input[@aria-label = 'Transaction Type']"));
    }

    public WebElement checkBoxVatDynamic(String text) {
        return driver
                .findElement(By.xpath("//*//div[@id = 'VATGrid']//td[contains(text(), '" + text + "')]/../td/input"));
    }

    public WebElement buttonSaveVat() {
        return driver.findElement(By.xpath("//*//button[@id = 'btnSaveVAT']"));
    }

    public WebElement buttonAddWht() {
        return driver.findElement(By.xpath("//*//table[@id = 'wht-table']//button"));
    }

    public WebElement inputSearchWht() {
        return driver
                .findElement(By.xpath("//*//div[@id = 'WHTGrid']//input[@aria-label = 'Transaction Type']"));
    }

    public WebElement checkBoxWhtDynamic(String text) {
        return driver
                .findElement(By.xpath("//*//div[@id = 'WHTGrid']//td[contains(text(), '" + text + "')]/../td/input"));
    }

    public WebElement buttonSaveWht() {
        return driver.findElement(By.xpath("//*//button[@id = 'btnSaveWHT']"));
    }

    public WebElement tableBankAccount() {
        return driver.findElement(By.xpath("//*//table[@id = 'bank-account-table']"));
    }

    public WebElement buttonAddNewBankDynamic(int count) {
        return driver.findElement(
                By.xpath("//*//table[@id = 'bank-account-table']//tr[" + count + "]//button[@class = 'edit-row']"));
    }

    public WebElement buttonAddBankTable() {
        return driver.findElement(By.xpath("//*//button[@data-table-id = 'bank-account-table']"));
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

    public WebElement comboBoxGLTrade() {
        return driver.findElement(By.xpath("//*//div[@id = 'vendor-category-trade']//tr[1]//select"));
    }

    public WebElement comboBoxMultiGLTradeDynamic(int count) {
        return driver.findElement(By.xpath("//*//div[@id = 'vendor-category-trade']//tr[" + count + "]//select"));
    }

    public WebElement selectGLTradeDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//div[@id = 'vendor-category-trade']//tr[1]//select/option[@data-description = '" + text
                        + "']"));
    }

    public WebElement selectMultiGLTradeDynamic(int count, String text) {
        return driver.findElement(
                By.xpath("//*//div[@id = 'vendor-category-trade']//tr[" + count
                        + "]//select/option[@data-description = '" + text + "']"));
    }

    public WebElement comboBoxGLNonTrade() {
        return driver.findElement(By.xpath("//*//div[@id = 'vendor-category-non-trade']//tr[1]//select"));
    }

    public WebElement comboBoxMultiGLNonTradeDynamic(int count) {
        return driver.findElement(By.xpath("//*//div[@id = 'vendor-category-non-trade']//tr[" + count + "]//select"));
    }

    public WebElement selectGLNonTradeDynamic(String text) {
        return driver.findElement(
                By.xpath(
                        "//*//div[@id = 'vendor-category-non-trade']//tr[1]//select/option[@data-description = '" + text
                                + "']"));
    }

    public WebElement selectMultiGLNonTradeDynamic(int count, String text) {
        return driver.findElement(
                By.xpath("//*//div[@id = 'vendor-category-non-trade']//tr[" + count
                        + "]//select/option[@data-description = '" + text
                        + "']"));
    }

    public WebElement buttonAddGLTrade() {
        return driver.findElement(
                By.xpath("//*//div[@id = 'vendor-category-trade']//button[@data-table-id = 'trade-vendor-table']"));
    }

    public WebElement buttonAddGLNonTrade() {
        return driver.findElement(
                By.xpath(
                        "//*//div[@id = 'vendor-category-non-trade']//button[@data-table-id = 'non-trade-vendor-table']"));
    }

    public WebElement inputSearchTermTrade() {
        return driver.findElement(By.xpath("//textarea[@id = 'trade-search-term']"));
    }

    public WebElement inputSearchTermNonTrade() {
        return driver.findElement(By.xpath("//input[@id = 'non-trade-search-term']"));
    }

    public WebElement inputTransactionValue() {
        return driver.findElement(
                By.xpath("//*//input[@id = 'estimasi_nilai_trx']"));
    }

    public WebElement inputDescAndRemarksDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//textarea[contains(text(), '" + text + "')]/../following-sibling::td[1]/textarea"));
    }

    public WebElement inputDueDillNumber() {
        return driver.findElement(
                By.xpath("//*//textarea[@name = 'due-diligence-number']"));
    }

    public WebElement uploadDueDillAttachment() {
        return driver.findElement(
                By.xpath("//*//input[@id = 'due-diligence-attachment']"));
    }

    public WebElement inputMitigationPlan() {
        return driver.findElement(
                By.xpath("//*//textarea[@name = 'mitigation-plan']"));
    }

    public WebElement radioButtonExpiredDateDynamic(String text) {
        return driver.findElement(
                By.xpath("//*//div[contains(text(), '" + text + "')]/../div[@class = 'color-box']"));
    }

    public WebElement buttonSubmitVendor() {
        return driver.findElement(
                By.xpath("//*//button[@id = 'btnSubmit']"));
    }

    public WebElement inputRemarksRegister() {
        return driver
                .findElement(By.xpath("//*//div[@id = 'ConfirmSubmitModal']//textarea[@id = 'remarks_general_1']"));
    }

    public WebElement buttonConfirm() {
        return driver.findElement(By.xpath("//*//div[@id = 'ConfirmSubmitModal']//button[text() = 'Yes']"));
    }

    public WebElement buttonSaveAsDraftVendor() {
        return driver.findElement(
                By.xpath("//*//button[@id = 'btnSaveAsDraft']"));
    }

    public WebElement buttonConfirmSaveAsDraft() {
        return driver.findElement(By.xpath("//*//div[@id = 'ConfirmSaveDraftModal']//button[text() = 'Yes']"));
    }

}
