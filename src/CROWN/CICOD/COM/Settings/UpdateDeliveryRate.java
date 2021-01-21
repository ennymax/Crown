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
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;
import java.security.SecureRandom;

@Listeners(InvokedMethodListeners.class)
public class UpdateDeliveryRate  extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);

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

    @Description("Update Delivery Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void UpdateDeliveryRate() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"UpdateDeliveryRt_XPATH", 20);
    }

    @Description("Mini Delivery Charge")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void MiniDeliveryCharge() throws IOException, InterruptedException {
        excelUtil.DosendKeysRandomNumberWhenReady(driver,"MiniDeliveryCharge_XPATH", 10000, 20);
    }

    @Description("Delivery Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void DeliverySave() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"DeliverySavebtn_XPATH", 20);
    }

    @Description("Assert Delivery Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void AssertDeliverySave() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"as_XPATH","ass1_TEXT","assPass1_TEXT","assFail1_TEXT",20);
    }
}
