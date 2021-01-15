package CROWN.CICOD.COM.Settings;

import CROWN.Base.TestBase;
import CROWN.utility.Assertion;
import CROWN.utility.ExcelUtil;
import CROWN.utility.Login;
import CROWN.utility.Utility;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import java.io.IOException;

public class SUSPEND_UNSUSPEND_TAX extends TestBase {

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        Login login = new Login(driver);
        login.Login();
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady("com_XPATH", "comm_TEXT", 60);
    }

    @Description("Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void Setting() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Settings_XPATH", 20);
    }

    @Description("System Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SystemSetting() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("SystemSettings_XPATH", 20);
    }

    @Description("Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Tax() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Vt_XPATH", 20);
    }

    @Description("Tax Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void TaxAction() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("TaxActionbtn_XPATH", 20);
    }

    @Description("Suspend Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void SUSPENDTax() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("sUSPENDTax_XPATH", 20);
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
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady("as_XPATH", "taxsus_TEXT", "taxsus_TEXT", "taxsusFail_TEXT", 20);
    }

    @Description("Tax Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void TaxAction1() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("TaxActionbtn_XPATH", 20);
    }

    @Description("UNSuspend Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void UNSUSPENDTax() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("UnsuspendTax_XPATH", 20);
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
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady("as_XPATH", "taxsus1_TEXT", "taxsus1_TEXT", "taxsusFail1_TEXT", 20);
    }
}
