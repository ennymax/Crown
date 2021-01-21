package CROWN.CICOD.COM.Settings;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class SUSPEND_UNSUSPEND_TAX extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        login.Login(driver);
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT", 60);
    }

    @Description("Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void Setting() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Settings_XPATH", 20);
    }

    @Description("System Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SystemSetting() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SystemSettings_XPATH", 20);
    }

    @Description("Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Tax() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Vt_XPATH", 20);
    }

    @Description("Tax Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void TaxAction() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"TaxActionbtn_XPATH", 20);
    }

    @Description("Suspend Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void SUSPENDTax() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"sUSPENDTax_XPATH", 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AcceptAlert() throws IOException, InterruptedException {
        driver.switchTo().alert().accept();
    }

    @Description("Assert Suspend Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AssertSuspendTax() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"as_XPATH", "taxsus_TEXT", "taxsus_TEXT", "taxsusFail_TEXT", 20);
    }

    @Description("Tax Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void TaxAction1() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"TaxActionbtn_XPATH", 20);
    }

    @Description("UNSuspend Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void UNSUSPENDTax() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"UnsuspendTax_XPATH", 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void AcceptAlert1() throws IOException, InterruptedException {
        driver.switchTo().alert().accept();
    }

    @Description("Assert Unsuspend Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void AssertUnsuspendTax() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"as_XPATH", "taxsus1_TEXT", "taxsus1_TEXT", "taxsusFail1_TEXT", 20);
    }
}
