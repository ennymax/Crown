package CROWN.CICOD.COM.CustomerManagment;

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

import java.awt.*;
import java.io.IOException;
import java.security.SecureRandom;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(InvokedMethodListeners.class)
public class VatExemptionforCustomer extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        Login login = new Login(driver);
        login.Login(driver);
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT", 60);
    }

    @Description("Customer Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void CustomerManagement() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady(driver,"Customermanagmentbtn_XPATH", 20);
        excelUtil.DoclickWhenReady(driver,"SelectCustomerbtn_XPATH", 20);
    }

    @Description("Action Button")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void ActionButton() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ActionSuspend_XPATH", 20);
    }

    @Description("Update customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void UpdateCustomer() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"UpdateCustoo_XPATH", 20);
    }

    @Description("Enable VAT Exemption")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void EnableVatExemption() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoCheckBoxSelected(driver,"EnableVatExemption_XPATH","VatPaa_TEXT","VatPaa_TEXT",20);
    }

    @Description("Assert Free Delivery")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AssertFreeDelivery() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoCheckBoxSelected(driver,"EnableFreeDeliv_XPATH", "VatPaa_TEXT", "VatPaa_TEXT", 20);
    }

    @Description("Enable VAT Exemption")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void EnableVATExemption() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoCheckBoxSelected(driver,"EnableVatExemption_XPATH", "VatEx_TEXT", "VatEx_TEXT", 20);
    }

    @Description("House Address")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void HouseAddress() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"Houshhh_XPATH", 20);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"Strrrr_XPATH", 20);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"cLan_XPATH", 20);
    }

    @Description("Customer Delivery Details")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void CustomerDeliveryDetails() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByVisibleText(driver,"Country_XPATH", "Country_TEXT", 20);
        excelUtil.DoSelectValuesByVisibleText(driver,"Cstate_XPATH", "State_TEXT", 20);
        excelUtil.DoSelectValuesByVisibleText(driver,"Clga_XPATH", "LGA_TEXT", 20);
    }

    @Description("Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void UpdateButton() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Csave_XPATH", 20);
    }

    @Description("Assert Update Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void AssertUpdateCustomer() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady(driver,"cccg_XPATH", "mi_TEXT", "M1Pass_TEXT", "m1fail_TEXT", 20);
    }

    @Description("Update Customer Button")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void UpdateCustomerButton() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"CreatV_XPATH", 20);
    }

    @Description("Search Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 16)
    public void SearchProduct() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSendKeysWhenReady(driver,"SearchProductinput_XPATH", "ID_TEXT", 20);
    }

    @Description("Search Product Button")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 17)
    public void SearchProductButton() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady(driver,"SearchProductbtnq_XPATH", 20);
    }

    @Description("Add Product To Cart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 18)
    public void AddProductToCart() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady(driver,"AddBTN_XPATH", 20);
    }

    @Description("Select Region")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 21)
    public void SelectRegion() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady(driver,"jjregion_XPATH",20);
        excelUtil.DoSelectValuesByIndexRandom(driver,"SelectRegion_XPATH",4,20);
    }

    @Description("Make Payment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 22)
    public void MakePayment() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"MakePayment_XPATH", 20);
    }

    @Description("Pay Online")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 23)
    public void PayOnline() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"PayOnline_XPATH", 20);
    }

    @Description("Assert VAT Exemption For Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 24)
    public void Assert_VAT_Exemption_for_Customer() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        Thread.sleep(13000);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("option-payment-amount-xs")).getText());
        assertEquals("NGN188.84", driver.findElement(By.id("option-payment-amount-xs")).getText());
        test.log(Status.PASS, "Vat Exemption is confirmed");
    }
}

