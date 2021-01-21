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
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.SecureRandom;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(InvokedMethodListeners.class)
public class PayNow extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
    protected RavePay ravePay = new RavePay(driver);

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

    @Description("Create Order")
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

    @Description("View Customer Details")
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

    @Description("Search Product")
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
    }

    @Description("Add Product to Chart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void ViewFreebies() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ViewFreebies_XPATH", 30);
    }

    @Description("Add Product to Chart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void Check_Offer_AddOffer() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"quiCheck_XPATH", 30);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddQui_XPATH", 30);
    }

    @Description("Add Product to Chart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void SelectOffer() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Offer1_XPATH", 30);
    }

    @Description("Assert Product Offer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void AssertProductOffer() throws IOException, InterruptedException {
        assertion.DoAssertXpathPresentWhenReady(driver,"assFreebies_XPATH", "assfrepass_TEXT", "assfreefail_TEXT", 20);
    }

    @Description("Assert Product Offer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void Assert_Product_Offer_Price() throws IOException, InterruptedException {
        assertion.DoAssertEqualWhenReady(driver,"Assertfreebies_XPATH", "asserStriTEXT", "assfrepass1_TEXT", "assfreefail1_TEXT", 20);
    }


    @Description("Select Region")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void SelectRegion() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"jjregion_XPATH", 30);
        excelUtil.DoSelectValuesByIndex(driver,"SelectRegion_XPATH", 2, 20);
    }

    @Description("Make Payment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void MakePayment() throws IOException, InterruptedException {
        Thread.sleep(2000);
        WebElement ti112 = driver.findElement(By.xpath(Utility.fetchLocator("MakePayment_XPATH")));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView();", ti112);
        ti112.click();
    }

    @Description("Pay POS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void PayPOS() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"PayPoS_XPATH",20);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ConfirmPAymantPOS_XPATH",20 );
    }

    @Description("Assert Pay POS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 16)
    public void AssertPayPOS() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"ComfirmPOSPayment_XPATH", "fr_TEXT", "frPass_TEXT", "frFail_TEXT", 20);
    }
}
