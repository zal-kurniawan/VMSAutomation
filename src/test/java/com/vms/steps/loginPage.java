package com.vms.steps;

import org.openqa.selenium.WebDriver;
import com.vms.objects.loginObject;
import com.vms.utils.BasePage;
import com.vms.utils.Helper;

public class loginPage extends BasePage {
    private loginObject loginObject;

    public loginPage(WebDriver driver) {
        super(driver);
        this.loginObject = new loginObject(driver);
    }

    public void loginVMS() throws InterruptedException {
        waitElement(loginObject.inputUsername());
        loginObject.inputUsername().sendKeys(Helper.getKey("username"));
        loginObject.inputPassword().sendKeys(Helper.getKey("password"));
        loginObject.buttonLogin().click();
    }
}
