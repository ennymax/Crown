package CROWN.CICOD.COM.Settings;

import CROWN.Base.TestBase;
import CROWN.utility.ExcelUtil;
import CROWN.utility.JavaScriptUtil;
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

public class SuspendUnsuspendReasonforRefund extends TestBase {

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

    @Description("Reason for Redund")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void ReasonforRefund() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady("ReasonforRedund_XPATH", 20);
    }

    @Description("Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void Action() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady("rActionBTN_XPATH", 20);
    }

    @Description("SuspendReason for Refund")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void SuspendReasonforRefund() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("rsusend_XPATH", 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AcceptAlert1() throws IOException, InterruptedException {
        driver.switchTo().alert().accept();
    }

    @Description("Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void Action1() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady("rActionBTN_XPATH", 20);
    }

    @Description("Create New Reason")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void CreateNewReason() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("rUnsuspend_XPATH", 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AcceptAlert() throws IOException, InterruptedException {
        driver.switchTo().alert().accept();
    }
}
