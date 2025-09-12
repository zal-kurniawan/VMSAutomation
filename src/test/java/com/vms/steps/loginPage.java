package com.vms.steps;

import org.openqa.selenium.WebDriver;

import com.vms.common.BasePage;
import com.vms.objects.loginObject;

public class loginPage extends BasePage {

    private loginObject loginObject;

    public loginPage(WebDriver driver) {
        super(driver);
        this.loginObject = new loginObject(driver);
    }

    public void loginVMS(String username, String password) throws InterruptedException {
        sleep(1000);
        loginObject.inputUsername().isDisplayed();
        loginObject.inputUsername().sendKeys(username);
        loginObject.inputPassword().isDisplayed();
        loginObject.inputPassword().sendKeys(password);
        loginObject.buttonLogin().isDisplayed();
        loginObject.buttonLogin().click();
    }
}
