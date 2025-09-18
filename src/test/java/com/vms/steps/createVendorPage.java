package com.vms.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.vms.common.BasePage;
import com.vms.objects.createVendorObject;

public class createVendorPage extends BasePage {
    private createVendorObject createVendorObject;
    public boolean isTrade, isNonTrade;

    public createVendorPage(WebDriver driver) {
        super(driver);
        this.createVendorObject = new createVendorObject(driver);
    }

    public void fillGeneralInformation(String[] vendorCategory, String[] businessArea,
            String type, String entity, String vendorName, String tradingName, String[][] contact, String scopeOfWork,
            String detailScopeOfWork, String dueDilType, String compliance, String[][] businessCategory)
            throws InterruptedException {
        sleep(1000);
        try {
            // Open General Information
            createVendorObject.divGeneralInformation().click();
            sleep(1000);

            // Select Category (Trade / Non-Trade)
            for (String category : vendorCategory) {
                if (category.equals("trade")) {
                    isTrade = true;
                }
                if (category.equalsIgnoreCase("nontrade") || category.equals("non-trade")) {
                    isNonTrade = true;
                }
            }
            if (isTrade) {
                createVendorObject.checkboxTrade().click();
            }
            if (isNonTrade) {
                createVendorObject.checkboxNonTrade().click();
            }
            if (!isTrade && !isNonTrade) {
                throw new IllegalArgumentException("Category Tidak Ada");
            }

            // Select Business Area
            if (isTrade) {
                sleep(500);
                createVendorObject.buttonBusinessArea().click();
                sleep(500);
                for (int count = 0; count < businessArea.length; count++) {
                    createVendorObject.checkBoxBusinessAreaDyanmic(businessArea[count]).click();
                }
                createVendorObject.buttonSaveBusinessArea().click();
            }

            // Select Type (Company/Professional)
            if (type.equalsIgnoreCase("company")) {
                createVendorObject.radioButtonTypeCompany().click();
            } else if (type.equalsIgnoreCase("professional")) {
                createVendorObject.radioButtonTypeProfessional().click();
                ;
            } else {
                throw new IllegalArgumentException("Type Tidak Ada");
            }

            // Select Entity (CV/PT/Blank)
            if (entity.equals("CV") || entity.equals("PT") || entity.equals("Blank")) {
                createVendorObject.dropdownBusinessEntityDynamic(entity).click();
            } else {
                throw new IllegalArgumentException("Entity Tidak Ada");
            }

            // Fill Vendor Name & Trading Name
            createVendorObject.inputVendorName().sendKeys(vendorName);
            createVendorObject.inputTradingName().sendKeys(tradingName);

            // Fill PIC
            for (int count = 0; count < 2; count++) {
                createVendorObject.inputContactNameDynamic(count + 1).sendKeys(contact[count][0]);
                if (contact[count][1] != "") {
                    createVendorObject.inputContactPositionDynamic(count + 1).clear();
                    createVendorObject.inputContactPositionDynamic(count + 1).sendKeys(contact[count][1]);
                }
                createVendorObject.inputContactPhoneDynamic(count + 1).sendKeys(contact[count][2]);
                createVendorObject.inputContactEmailDynamic(count + 1).sendKeys(contact[count][3]);
                createVendorObject.inputContactNIKDynamic(count + 1).sendKeys(contact[count][4]);
            }

            // Add More PIC
            if (contact.length > 2) {
                for (int countContactMore = 3; countContactMore <= contact.length; countContactMore++) {
                    createVendorObject.buttonAddContact().click();
                    createVendorObject.inputContactNameDynamic(countContactMore)
                            .sendKeys(contact[countContactMore - 1][0]);
                    createVendorObject.inputContactPositionDynamic(countContactMore)
                            .sendKeys(contact[countContactMore - 1][1]);
                    createVendorObject.inputContactPhoneDynamic(countContactMore)
                            .sendKeys(contact[countContactMore - 1][2]);
                    createVendorObject.inputContactEmailDynamic(countContactMore)
                            .sendKeys(contact[countContactMore - 1][3]);
                    createVendorObject.inputContactNIKDynamic(countContactMore)
                            .sendKeys(contact[countContactMore - 1][4]);
                }
            }

            // Fill scope of work & detail scope of work
            createVendorObject.inputScopeOfWork().sendKeys(scopeOfWork);
            createVendorObject.inputDetailScopeOfWork().sendKeys(detailScopeOfWork);
            // Due Diligence Type
            if (dueDilType == "Inscope") {
                createVendorObject.radioButtonInscopeDilligence().click();
            } else if (dueDilType == "Outscope") {
                createVendorObject.radioButtonOutscopeDilligence().click();
                // Complience Flow
                if (compliance == "SDL") {
                    createVendorObject.radioButtonComplianceFlowSDL().click();
                } else if (compliance == "Non SDL") {
                    createVendorObject.radioButtonComplianceFlowNonSDL().click();
                } else {
                    throw new IllegalArgumentException("Complience Flow Tidak Ada");
                }
            } else {
                throw new IllegalArgumentException("Due Diligence Type Tidak Ada");
            }

            // Add Business
            createVendorObject.buttonAddBusiness().click();
            sleep(1000);
            for (int countBusinessClassification = 0; countBusinessClassification < businessCategory.length; countBusinessClassification++) {
                createVendorObject
                        .checkboxBusinessClasificationDynamic(businessCategory[countBusinessClassification][0])
                        .click();
                sleep(1000);
                for (int countBusinessCategory = 1; countBusinessCategory < businessCategory[countBusinessClassification].length; countBusinessCategory++) {
                    createVendorObject.checkboxBusinessCategoryDynamic(
                            businessCategory[countBusinessClassification][countBusinessCategory]).click();
                }
            }
            createVendorObject.buttonSaveBusiness().click();

            // Close General Information
            scrollToTop();
            createVendorObject.divGeneralInformation().click();

        } catch (IllegalArgumentException e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
            e.printStackTrace();
            // stop program
            System.exit(1);
            // close browser
            driver.quit();
        }
    }

    public void fillLegalityDocuments(String address, String city, String country, String postalCode,
            String[][] functionaryOfCompany, String[][] numberAndPathDocument) throws InterruptedException {
        sleep(1000);
        createVendorObject.divLegalityDocuments().click();
        scrollToTop();

        // Fill Address, City, Country, & Postal Code
        createVendorObject.inputAddress().sendKeys(address);
        createVendorObject.inputCity().sendKeys(city);
        sleep(500);
        createVendorObject.comboBoxCountry().click();
        createVendorObject.selectCountryDynamic(country).click();
        if (postalCode != "") {
            createVendorObject.inputPostalCode().sendKeys(postalCode);
        }

        // Fill Functionary Of Company
        for (int count = 1; count <= functionaryOfCompany[0].length; count++) {
            createVendorObject.inputFunctionaryOfCompanyDynamic(1, count + 1)
                    .sendKeys(functionaryOfCompany[0][count - 1]);
        }
        if (functionaryOfCompany.length >= 2) {
            for (int count = 2; count <= functionaryOfCompany.length; count++) {
                createVendorObject.buttonAddFunctionaryOfCompany().click();
                for (int count2 = 1; count2 <= functionaryOfCompany[count - 1].length; count2++) {
                    createVendorObject.inputFunctionaryOfCompanyDynamic(count, count2 + 1)
                            .sendKeys(functionaryOfCompany[count - 1][count2 - 1]);
                }
            }
        }

        // Fill & Upload Supporting Document
        for (int count = 0; count < numberAndPathDocument.length; count++) {
            createVendorObject.inputDocumentNumberDynamic(numberAndPathDocument[count][0])
                    .sendKeys(numberAndPathDocument[count][1]);
            createVendorObject.uploadLegalityDocumentsDynamic(numberAndPathDocument[count][0])
                    .sendKeys(numberAndPathDocument[count][2]);
        }

        // Close Legality Documents
        scrollToTop();
        createVendorObject.divLegalityDocuments().click();
    }

    public void fillTaxInformation(String npwp, String npwpNumber, String npwpName, String npwpAddress, String npwpCity,
            String npwpCountry, String npwpPostalCode, String copyOfNpwp, String skt, String eFaktur, String pkp,
            String sppkp, String sppkpNumber,
            String nonPkp, String hasSkb, String skb, String[] vat, String[] wht) throws InterruptedException {
        sleep(1000);
        createVendorObject.divTaxInformation().click();
        scrollToTop();

        // Fill Tax Information
        createVendorObject.comboBoxNpwp().click();
        createVendorObject.selectNpwpDynamic(npwp.toLowerCase()).click();
        createVendorObject.inputNpwpNumber().sendKeys(npwpNumber);
        createVendorObject.inputNpwpName().clear();
        createVendorObject.inputNpwpName().sendKeys(npwpName);
        createVendorObject.inputNpwpAddress().sendKeys(npwpAddress);
        createVendorObject.inputNpwpCity().sendKeys(npwpCity);
        sleep(500);
        createVendorObject.comboBoxNpwpCountry().click();
        createVendorObject.selectNpwpCountryDynamic(npwpCountry).click();
        createVendorObject.inputNpwpPostalCode().sendKeys(npwpPostalCode);
        createVendorObject.uploadCopyOfNpwp().sendKeys(copyOfNpwp);
        createVendorObject.uploadSkt().sendKeys(skt);
        createVendorObject.comboBoxEfaktur().click();
        createVendorObject.selectEfakturDynamic(eFaktur.toLowerCase()).click();
        createVendorObject.comboBoxPkp().click();
        sleep(500);
        createVendorObject.selectPkpDynamic(pkp.toLowerCase()).click();

        if (pkp.equalsIgnoreCase("yes")) {
            createVendorObject.uploadSppkp().sendKeys(sppkp);
            createVendorObject.inputSppkpNumber().sendKeys(sppkpNumber);
        } else if (pkp.equalsIgnoreCase("no")) {
            createVendorObject.uploadNonPkp().sendKeys(nonPkp);
        }
        sleep(500);
        createVendorObject.comboBoxSkb().click();
        createVendorObject.selectSkbDynamic(hasSkb.toLowerCase());
        if (hasSkb.equalsIgnoreCase("yes")) {
            createVendorObject.uploadSkb().sendKeys(skb);
        }

        // VAT
        if (pkp.equalsIgnoreCase("yes")) {
            createVendorObject.buttonAddVat().click();
            sleep(500);
            for (int count = 0; count < vat.length; count++) {
                String vatTemp = vat[count].replaceFirst("^(\\w+).*", "$1");
                createVendorObject.inputSearchVat().clear();
                createVendorObject.inputSearchVat().sendKeys(vatTemp.toLowerCase());
                sleep(1000);
                createVendorObject.checkBoxVatDynamic(vat[count]).click();
            }
            createVendorObject.buttonSaveVat().click();
            sleep(500);
        }

        // WHT
        createVendorObject.buttonAddWht().click();
        sleep(500);
        for (int count = 0; count < wht.length; count++) {
            String whtTemp = wht[count].replaceFirst("^(\\w+).*", "$1");
            createVendorObject.inputSearchWht().clear();
            createVendorObject.inputSearchWht().sendKeys(whtTemp);
            sleep(1000);
            createVendorObject.checkBoxWhtDynamic(wht[count]).click();
        }
        createVendorObject.buttonSaveWht().click();
        sleep(500);

        // Close Tax Information
        scrollToTop();
        createVendorObject.divTaxInformation().click();
    }

    public void fillPaymentInformation(String[][] bankAccount) throws InterruptedException {
        sleep(500);
        scrollToTop();
        createVendorObject.divPaymentInformation().click();

        // Add Bank Account
        WebElement table = createVendorObject.tableBankAccount();
        scrollRightOnElement(table);
        for (int count = 0; count < bankAccount.length; count++) {
            sleep(500);
            createVendorObject.buttonAddNewBankDynamic(count + 1).click();
            sleep(500);
            createVendorObject.comboBoxBankName().click();
            createVendorObject.selectBankNameDynamic(bankAccount[count][0]).click();
            createVendorObject.inputBranch().sendKeys(bankAccount[count][1]);
            createVendorObject.comboBoxCurrency().click();
            createVendorObject.selectCurrencyDynamic(bankAccount[count][2]).click();
            createVendorObject.inputAccountNumber().sendKeys(bankAccount[count][3]);
            createVendorObject.inputAccountName().sendKeys(bankAccount[count][4]);
            createVendorObject.uploadHeaderRekening().sendKeys(bankAccount[count][5]);
            createVendorObject.uploadBankInformation().sendKeys(bankAccount[count][6]);
            createVendorObject.uploadFinanceConfirmation().sendKeys(bankAccount[count][7]);
            createVendorObject.buttonSaveBankAccount().click();
            sleep(500);
            if (count < bankAccount.length - 1) {
                createVendorObject.buttonAddBankTable().click();
            } else {
                break;
            }
        }

        // Close Payment Information
        scrollToTop();
        createVendorObject.divPaymentInformation().click();
    }

    public void fillVendorCategory(String[] glTrade, String[] glNonTrade, String searchTermTrade,
            String searchTermNonTrade) throws InterruptedException {
        sleep(500);
        scrollToTop();
        createVendorObject.divVendorCategory().click();

        // Select GL Account & Search Term
        sleep(500);
        if (isTrade) {
            // GL Account
            createVendorObject.comboBoxGLTrade().click();
            sleep(500);
            createVendorObject.selectGLTradeDynamic(glTrade[0]).click();
            if (glTrade.length > 1) {
                for (int count = 1; count < glTrade.length; count++) {
                    createVendorObject.buttonAddGLTrade().click();
                    createVendorObject.comboBoxMultiGLTradeDynamic(count + 1).click();
                    sleep(500);
                    createVendorObject.selectMultiGLTradeDynamic(count + 1,
                            glTrade[count]).click();
                }
            }
            // Search Term
            createVendorObject.inputSearchTermTrade().sendKeys(searchTermTrade);
        }
        if (isNonTrade) {
            // GL Account
            createVendorObject.comboBoxGLNonTrade().click();
            sleep(500);
            createVendorObject.selectGLNonTradeDynamic(glNonTrade[0]).click();
            if (glNonTrade.length > 1) {
                for (int count = 1; count < glNonTrade.length; count++) {
                    createVendorObject.buttonAddGLNonTrade().click();
                    createVendorObject.comboBoxMultiGLNonTradeDynamic(count + 1).click();
                    sleep(500);
                    createVendorObject.selectMultiGLNonTradeDynamic(count + 1,
                            glNonTrade[count]).click();
                }
            }
            // Search Term
            createVendorObject.inputSearchTermNonTrade().sendKeys(searchTermNonTrade);
        }
        // Close Vendor Cateogry
        scrollToTop();
        createVendorObject.divVendorCategory().click();
    }

    public void fillComplianceEnhancements(String transactionValue, String[][] descAndRemarks, String dueDillNumber,
            String dueDillAttachment, String mitigationPlan, String expiredDate) throws InterruptedException {
        sleep(500);
        scrollToTop();
        createVendorObject.divComplianceEnhancements().click();

        // Fill Compliance Enhancements
        createVendorObject.inputTransactionValue().sendKeys(transactionValue);
        for (int count = 0; count < descAndRemarks.length; count++) {
            createVendorObject.inputDescAndRemarksDynamic(descAndRemarks[count][0]).sendKeys(descAndRemarks[count][1]);
        }

        // Fill Initial Risk Assessment Identified
        createVendorObject.inputDueDillNumber().sendKeys(dueDillNumber);
        createVendorObject.uploadDueDillAttachment().sendKeys(dueDillAttachment);
        createVendorObject.inputMitigationPlan().sendKeys(mitigationPlan);
        if (expiredDate.contains("1")) {
            createVendorObject.radioButtonExpiredDateDynamic("Every 1 year").click();
        } else if (expiredDate.contains("2")) {
            createVendorObject.radioButtonExpiredDateDynamic("Every 2 year").click();
        } else if (expiredDate.contains("3")) {
            createVendorObject.radioButtonExpiredDateDynamic("Every 3 year").click();
        }

        // Close Compliance Enhancements
        scrollToTop();
        createVendorObject.divComplianceEnhancements().click();
    }

    public void submitVendor(String remarks) throws InterruptedException {
        sleep(1000);
        createVendorObject.buttonSubmitVendor().click();
        sleep(500);
        createVendorObject.inputRemarksRegister().sendKeys(remarks);
        createVendorObject.buttonConfirm().click();
        sleep(10000);
    }

    public void saveAsDraftVendor() throws InterruptedException {
        sleep(1000);
        createVendorObject.buttonSaveAsDraftVendor().click();
        sleep(500000);
        createVendorObject.buttonConfirmSaveAsDraft().click();
        sleep(10000);
    }
}
