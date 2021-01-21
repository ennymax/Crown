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
public class SuspendUnsuspendDeliveryRate extends TestBase {

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

    @Description("Delivery Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void DeliveryRate() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"DeliveryRatebtn_XPATH", 20);
    }

    @Description("Delivery Rate Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void DeliveryRateAction() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"delveryRateActionBNT_XPATH", 20);
    }

    @Description("Suspend Delivery Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void SuspendDeliveryRate() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SuspendDe_XPATH", 20);
    }

    @Description("AcceptAlert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AcceptAlert() throws IOException, InterruptedException {
        Thread.sleep(1400);
        driver.switchTo().alert().accept();
    }

    @Description("Delivery Rate Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void DeliveryRateAction1() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"delveryRateActionBNT_XPATH", 20);
    }

    @Description("Unsuspend Delivery Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void UnsuspendDeliveryRate() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"UnsuspendDe_XPATH", 20);
    }

    @Description("AcceptAlert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AcceptAlert1() throws IOException, InterruptedException {
        Thread.sleep(1400);
        driver.switchTo().alert().accept();
    }
}
