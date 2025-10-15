package com.vms.utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofMillis(40000));
    }

    // Method untuk menunggu selama beberapa milidetik
    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void waitElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Scroll ke atas halaman
    public void scrollToTop() {
        if (driver instanceof org.openqa.selenium.JavascriptExecutor) {
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
        }
    }

    // Scroll ke kiri pada elemen tertentu
    public void scrollRightOnElement(org.openqa.selenium.WebElement element) {
        if (driver instanceof org.openqa.selenium.JavascriptExecutor) {
            ((org.openqa.selenium.JavascriptExecutor) driver)
                    .executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;", element);
        }
    }
}