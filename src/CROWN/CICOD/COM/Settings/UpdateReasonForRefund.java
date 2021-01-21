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

import static org.testng.AssertJUnit.assertEquals;

@Listeners(InvokedMethodListeners.class)
public class UpdateReasonForRefund extends TestBase {

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

    @Description("Reason for Redund")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void ReasonforRefund() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ReasonforRedund_XPATH", 20);
    }

    @Description("Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void Action() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"rActionBTN_XPATH","Act_TEXT",60);
    }

    @Description("Enter Reason for Refund")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void EnterReason4Refund() throws IOException, InterruptedException {
        excelUtil.DoSendKeysWhenReady(driver,"NewR_XPAT","dec_TEXT", 20);
    }

    @Description("Create Reason for Refund")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void CreateReason() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"NewSave_XPATH", 20);
    }

    @Description("Assert Create Reason for Refund")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AssertCreateReason() throws IOException, InterruptedException {
        assertion.DoAssertEqualWhenReady(driver,"","uprea_TEXT","upreaPass_TEXT","upreaFail_TEXT",20);
    }
}