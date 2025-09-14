# ⚙️ VMSAutomation: Vendor Management System Automation Project

This project contains a set of automated testing scripts for the **Vendor Management System (VMS)** web application. The main goal is to validate core functionalities, especially the **New Vendor Registration workflow**.

The project is built using **Java** with the **Selenium WebDriver** framework and follows the **Page Object Model (POM)** design pattern to ensure clean, structured, and maintainable code.

---

## 🚀 Prerequisites

Before running the project, make sure your environment meets the following requirements:

| Technology   | Version / Notes            |
| ------------ | -------------------------- |
| Java (JDK)   | 11 or higher               |
| Apache Maven | 3.6 or higher              |
| Browser      | Google Chrome              |
| VMS Account  | Valid credentials to login |

---

## 🛠️ Technologies & Dependencies

This project is powered by modern technologies and libraries for web automation testing.

| Category          | Name               | Description                             |
| ----------------- | ------------------ | --------------------------------------- |
| Language          | Java               | Main programming language.              |
| Core Framework    | Selenium WebDriver | Automates browser interactions.         |
| Test Framework    | JUnit 5 (Jupiter)  | Runs and manages test lifecycle.        |
| Driver Management | WebDriverManager   | Automatically manages ChromeDriver.     |
| Build Tool        | Maven              | Manages dependencies and build process. |

---

## 📂 Project Structure

The project follows the **Page Object Model (POM)** design pattern to separate concerns clearly.

```
src/test/java/com/vms/
├── common # Base classes (BaseTest, BasePage) for setup & teardown
├── objects # Web element definitions (locators) for each page
├── steps # Actions or interactions performed on each page
└── tests # Test scenarios executing the workflows
```

---

## ▶️ How to Run Tests

Follow the steps below to execute the automation scripts.

### 1. Clone the Repository

Use the following command to download the project locally. Ensure you have configured your SSH key with GitHub.

```
git clone git@github.com:zal-kurniawan/VMSAutomation.git
cd VMSAutomation
```

### 2. Update Test Data (Optional)

If needed, you can update the main test data (e.g., vendor name, documents, etc.) in:

`src/test/java/com/vms/tests/CreateVendor.java`

### 3. Run Tests via Maven

Open a terminal in the project's root directory and run the command below. Maven will automatically download all required dependencies and execute the tests.

```
mvn clean test
```
