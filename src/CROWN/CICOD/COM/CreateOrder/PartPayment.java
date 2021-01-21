package CROWN.CICOD.COM.CreateOrder;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

@Epic("Part Payment")
@Story("Test Part Payment Module..")
@Listeners(InvokedMethodListeners.class)
public class PartPayment extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
    protected RavePay ravePay = new RavePay(driver);
    protected DatePicker datePicker = new DatePicker(driver);

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
        assertion.DoAssertContainsWhenReady(driver,"AssertSearchByName_XPATH","cot_TEXT","searpass_TEXT","searfail_TEXT",20);
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

    @Description("Test Apply Discount Module")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void ApplyDiscount() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Applydiscount_XPATH", 30);
        excelUtil.DoSendKeysWhenReady(driver,"DiscountByPercent_XPATH", "10_TEXT", 30);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"OkDiscount_XPATH", 30);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ConfirmOKDiscount_XPATH", 30);
    }

    @Description("Test Discount Module")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void SelectRegion() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"jjregion_XPATH", 30);
        excelUtil.DoSelectValuesByIndex(driver,"SelectRegion_XPATH", 2, 20);
    }

    @Description("Select Payment Option")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void PaymentOption() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"PaymentOptions_XPATH", "PaymentOPT_TEXT", 50);
        utility.DoclickWhenReady(driver,"NewPayAccount_XPATH", "Payno_TEXT", 40);
    }

    @Description("Test Select Part Payment Option")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void PartPayment() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"PartPayment_XPATH", "MakePayment_TEXT", 40);
    }

    @Description("Payment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void Payment() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"MakePayment_XPATH", "MakePayment_TEXT", 40);
    }

    @Description("Pay Amount for Part Payment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void PayAmount() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("PartPaymentAmount_XPATH"))).sendKeys(Utility.fetchLocator("pamt_TEXT"));
    }

    @Description("Select Payment Date")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 17)
    public void SelectPaymentDate() throws IOException {
        datePicker.DatePickerJE(driver,"PartPaymentDate_XPATH","10/10/2020");
    }

    @Description("Proceed To Make Part Payment")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 18)
    public void MakePartPayment() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("PayNowBTN_XPATH"))).click();
    }

    @Description("Select PayOnline")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 19)
    public void AssertPayOnline() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"PayOnline_XPATH", "PAyOnline_TEXT", 40);
        utility.DoswitchtoframeWhenReady(driver,0, 13000);
    }

    @Description("Rave Pay")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 20)
    public void RavePay() throws Exception {
        ravePay.RavePay3(driver);
    }
}
