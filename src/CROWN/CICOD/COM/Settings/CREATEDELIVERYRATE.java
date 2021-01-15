package CROWN.CICOD.COM.Settings;

import CROWN.Base.TestBase;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.SecureRandom;

public class CREATEDELIVERYRATE extends TestBase {

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

    @Description("Delivery Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void DeliveryRate() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("DeliveryRatebtn_XPATH", 20);
    }

    @Description("Add Delivery Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void AddDeliveryRate() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("DelAdd_XPATH", 20);
    }

    @Description("marchant Location")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void marchantLocation() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndexRandom("marchantLocation_XPATH", 1, 20);
    }

    @Description("Select Country")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void SelectCountry() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndex("SelectCountry_XPATH", 3, 20);
    }

    @Description("Merchant State")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void MerchantState() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndexRandom("MarchantState_XPATH", 35, 20);
    }

    @Description("Merchant LGA")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void MerchantLGA() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndexRandom("MarchantLGA_XPATH", 7, 20);
    }

    @Description("Mini Delivery Charge")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void MiniDeliveryCharge() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomNumberWhenReady("MiniDeliveryCharge_XPATH", 10000, 20);
    }

    @Description("Percent Delivery Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void PercentDeliveryRate() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomNumberWhenReady("PercentDeliveryRate_XPATH", 10, 20);
    }

    @Description("Free Delivery Price")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void FreeDeliveryPrice() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSendKeysWhenReady("FreeDeliveryPrice_XPATH", "FreeeDeliveryPrice_TEXT", 20);
    }

    @Description("Delivery Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void DeliverySave() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady("DeliverySavebtn_XPATH", 20);
    }

    @Description("Assert Delivery Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void AssertDeliverySave() throws IOException, InterruptedException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady("as_XPATH","ass_TEXT","assPass_TEXT","assFail_TEXT",20);
    }
}
