package com.vms.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected static WebDriver driver;
    protected static boolean individualRun;

    @BeforeSuite(alwaysRun = true)
    public static void setupSuite() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // Mengabaikan sertifikat tidak aman
        options.addArguments("--ignore-certificate-errors"); // Mengabaikan error sertifikat
        options.addArguments("--disable-web-security"); // Abaikan keamanan web
        options.addArguments("--allow-insecure-localhost"); // Izinkan localhost tidak aman
        options.addArguments("--disable-extensions"); // Nonaktifkan ekstensi
        options.addArguments("--start-maximized"); // Buka dalam mode full screen
        options.addArguments("--disable-popup-blocking");
        // options.addArguments("--headless=new");
        driver = new ChromeDriver(options);
        driver.get(Helper.getKey("url"));

        // Cek apakah test dijalankan secara individual
        String testFilter = System.getProperty("test");
        if (testFilter != null && testFilter.contains("#")) {
            individualRun = true;
        } else {
            individualRun = false;
        }
    }

    @AfterSuite(alwaysRun = true)
    public static void teardownSuite() {
        if (driver != null) {
            driver.quit(); // Menutup browser setelah setiap test
        }
    }

}
