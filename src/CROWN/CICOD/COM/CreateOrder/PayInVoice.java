package CROWN.CICOD.COM.CreateOrder;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.SecureRandom;

@Listeners(InvokedMethodListeners.class)
public class PayInVoice extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
    protected RavePay ravePay = new RavePay(driver);

    @Description("Login")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        login.Login(driver);
    }

    @Description("Access COM")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT", 60);
    }

    @Description("Create Order Button")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 3)
    public void CreateOrder() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Createorderbtn_XPATH", 30);
    }

    @Description("Search Customer By Name")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 4)
    public void SearchCustomerByName() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SearchByName_XPATH", 30);
        excelUtil.DoSendKeysWhenReady(driver,"SeaerchInput_XPATH", "CustomerName_TEXT", 20);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Searchbtn_XPATH", 30);
    }

    @Description("View Customer Details")
    @Severity(SeverityLevel.NORMAL)
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

    @Description("Search Product")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 7)
    public void SearchProduct() throws IOException, InterruptedException {
        excelUtil.DoSendKeysWhenReady(driver,"SearchProductinput_XPATH", "ID_TEXT", 20);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SearchProductbtnq_XPATH", 30);
    }

    @Description("Add Product to chart")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 8)
    public void AddProducttoChart() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddBTN_XPATH", 30);
    }

    @Description("Test Apply Discount Functionality")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 9)
    public void ApplyDiscount() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Applydiscount_XPATH", 30);
        excelUtil.DoSendKeysWhenReady(driver,"DiscountByPercent_XPATH", "10_TEXT", 30);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"OkDiscount_XPATH", 30);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ConfirmOKDiscount_XPATH", 30);
    }

    @Description("Select region")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 10)
    public void SelectRegion() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"jjregion_XPATH", 30);
        excelUtil.DoSelectValuesByIndex(driver,"SelectRegion_XPATH", 2, 20);
    }

    @Description("Select Payment Option")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 11)
    public void PaymentOption() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"PaymentOptions_XPATH", "PaymentOPT_TEXT", 50);
        utility.DoclickWhenReady(driver,"NewPayAccount_XPATH", "Payno_TEXT", 40);
    }

    @Description("Pay Invoice")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 12)
    public void PayInvoice() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"PayInVoice_XPATH", 20);
    }

    @Description("Generate Order Code")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 13)
    public void GenerateOrderCode() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"GenerateOrderCode_XPATH", "GenerateOrderCode_XPATH", 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 14)
    public void AcceptAlert() throws IOException, InterruptedException {
        utility.DowaitandAcceptAlerwhenReady(driver,20);
    }

    @Description("Assert Order Code Generation")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 15)
    public void AssertOrderCodeGeneration() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"SendOrderConfirmation_XPATH", "sss_TEXT", "OrderCodePass_TEXT", "OrderCodeFailed_TEXT", 20);
    }

    @Description("Send Order Confirmation")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 15)
    public void SendOrderConfirmation() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"SendOrderConfirmation_XPATH", 20);
    }

    @Description("Pay Now Pay Account")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 17)
    public void PayNowPayAccount() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"PayNowPayAccount_XPATH", 20);
    }

    @Description("Pay from Account")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 18)
    public void PayfromAccount() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"PayfromAccount_XPATH", 20);
    }

    @Description("Accept Alert Pay Account")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 19)
    public void AcceptAlertPayAccount() throws IOException, InterruptedException {
        utility.DowaitandAcceptAlerwhenReady(driver,20);
    }
}
