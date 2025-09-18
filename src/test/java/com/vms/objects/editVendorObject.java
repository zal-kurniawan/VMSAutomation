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
                "//*//div[@class = 'editdata']//ul[@id = 'select2-npwpCountry-results']//li[contains(text(), '" + text
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

    public WebElement buttonSubmitVendor() {
        return driver.findElement(By.xpath("//*//button[@id = 'btnSubmit']"));
    }

    public WebElement buttonConfirmSubmitVendor() {
        return driver.findElement(By.xpath("//*//div[@id = 'ConfirmEditModal']//button[text() = 'Yes']"));
    }

}
