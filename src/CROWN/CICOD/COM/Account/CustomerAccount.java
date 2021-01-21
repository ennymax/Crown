package CROWN.CICOD.COM.Account;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import com.google.api.client.util.Lists;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

@Listeners(InvokedMethodListeners.class)
public class CustomerAccount extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority=1)
    public void login() throws IOException, InterruptedException {
        login.Login(driver);
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority=2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("com_XPATH"))).click();
    }

    @Description("Account Button")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority=3)
    public void AccountButton() throws IOException, InterruptedException {
        Thread.sleep(2000);
        (new WebDriverWait(driver, 45)).until(ExpectedConditions.elementToBeClickable(By.xpath(Utility.fetchLocator("AccountBTN_XPATH")))).click();
    }

    @Description("Customer Account Button")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority=4)
    public void CustomerAccountButton() throws IOException, InterruptedException {
        Thread.sleep(2000);
        (new WebDriverWait(driver, 45)).until(ExpectedConditions.elementToBeClickable(By.xpath(Utility.fetchLocator("CustomerAccount_XPATH")))).click();
    }

    @Description("Assert Customer Account")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority=5)
    public void AssertCustomerAccount() throws IOException, InterruptedException {
        Thread.sleep(1000);
        if (driver.findElements(By.xpath(Utility.fetchLocator("AssertValueOfAccountInCredit_XPATH"))).size() != 0) {
            test.log(Status.PASS, "Value of Account in Debit is displayed and enabled");
        } else {
            test.log(Status.FAIL, "Value of Account in Debit is not displayed and enabled");
        }
    }

    @Description("Assert Value of Customer Account")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority=6)
    public void AssertValueofCustomerAccount() throws IOException, InterruptedException {
        Thread.sleep(1000);
        if (driver.findElements(By.xpath(Utility.fetchLocator("AssertValueOfAccountInCredit_XPATH"))).size() != 0) {
            test.log(Status.PASS, "Value of Account in Credit is displayed and enabled");
        } else {
            test.log(Status.FAIL, "Value of Account in Credit is not displayed and enabled");
        }
    }
}
