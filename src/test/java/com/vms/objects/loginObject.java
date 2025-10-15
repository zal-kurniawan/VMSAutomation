package com.vms.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginObject {
    private WebDriver driver;

    public loginObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement inputUsername() {
        return driver.findElement(By.xpath("//*//input[@id='username']"));
    }

    public WebElement inputPassword() {
        return driver.findElement(By.xpath("//*//input[@id='password']"));
    }

    public WebElement buttonLogin() {
        return driver.findElement(By.xpath("//*//button[text() = 'LOGIN']"));
    }
}
