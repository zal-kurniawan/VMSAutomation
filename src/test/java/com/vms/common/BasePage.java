package com.vms.common;

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    // Method untuk menunggu selama beberapa milidetik
    public void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
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