package CROWN.CICOD.COM.CreateOrder;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.SecureRandom;

@Listeners(InvokedMethodListeners.class)
public class SelectDeliveryDetails extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
    protected RavePay ravePay = new RavePay(driver);

    @Description("Login")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1)
    public void login() throws Exception {
        login.Login(driver);
    }

    @Description("COM")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT", 60);
    }

    @Description("Test Create Order")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void CreateOrder() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Createorderbtn_XPATH", 30);
    }

    @Description("Search Customer By Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SearchCustomerByName() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SearchByName_XPATH", 30);
        excelUtil.DoSendKeysWhenReady(driver,"SeaerchInput_XPATH", "CustomerName_TEXT", 20);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Searchbtn_XPATH", 30);
    }

    @Description("View Customer By Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void ViewCustomerDetails() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ViewDetails_XPATH", 30);
    }

    @Description("Assert View Customer Details")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void AssertViewCustomerDetails() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"AssertSearchByName_XPATH", "cot_TEXT", "searpass_TEXT", "searfail_TEXT", 20);
    }

    @Description("Search Product By Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void SearchProduct() throws IOException, InterruptedException {
        excelUtil.DoSendKeysWhenReady(driver,"SearchProductinput_XPATH", "ID_TEXT", 20);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SearchProductbtnq_XPATH", 30);
    }

    @Description("Add Product to Chart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AddProducttoChart() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddBTN_XPATH", 30);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddBTN_XPATH", 30);
    }

    @Description("Delivery Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void DeliveryRate() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"DeliveryDetails_XPATH", 30);
    }

    @Description("Add Rate")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void AddRate() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"AddDeliveryRate_XPATH", 30);
        excelUtil.DoclickWhenReady(driver,"AddAdd_XPATH", 30);
    }

    @Description("Delivery Details")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void DeliveryDetails() throws IOException, InterruptedException {
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"DliveryName_XPATH", 30);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"DeliveryStreet_XPATH", 30);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"DeliveryLandMark_XPATH", 30);
    }

    @Description("Country")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void Country() throws IOException, InterruptedException {
        excelUtil.DoSelectValuesByIndex(driver,"DeliveryCountry_XPATH", 3, 20);
    }

    @Description("LGA")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void State() throws IOException, InterruptedException {
        excelUtil.DoSelectValuesByIndexRandom(driver,"DeliveryState_XPATH", 36, 20);
    }

    @Description("Add Product to Chart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void LGA() throws IOException, InterruptedException {
        excelUtil.DoSelectValuesByIndexRandom(driver,"DeliveryLGA_XPATH", 6, 20);
    }

    @Description("Save Delivery Address")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 16)
    public void SaveDeliveryAddress() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"SAveDeiveryAddress_XPATH", 20);
    }

    @Description("Assert Save Delivery")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 17)
    public void AssertSaveDelivery() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"as_XPATH", "CotnTest_TEXT", "DeliveryCreatedPass_TEXT", "DeliveryCreatedFailed_TEXT", 20);
    }
}