package CROWN.CICOD.COM.ValueChain;

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
import java.security.SecureRandom;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(InvokedMethodListeners.class)
public class PurchaseProductValueChainPayInvoice extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected RavePay ravePay = new RavePay(driver);

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        login.LoginDefault(driver);
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT", 60);
    }

    @Description("Customer management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void Customermanagment() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"Customermanagmentbtn_XPATH", "Customermanagmentbtn_XPATH", 60);
    }

    @Description("Value chain")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void Valuechain() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"ValuechainBTN_XPATH", "ValuechainBTN_XPATH", 60);
    }

    @Description("Suppliers")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Suppliers() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"Suppliers_XPATH", "Suppliers_XPATH", 60);
    }

    @Description("BuyerAction")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void BuyerAction() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"BuyerActionBTN_XPATH", "BuyerActionBTN_XPATH", 60);
    }

    @Description("Suppliers Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void SuppliersProduct() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"SuppliersProduct_XPATH", "SuppliersProduct_XPATH", 60);
    }

    @Description("Create Order from Suppler")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void CreateOrderfromSuppler() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"CreateOrderfromSuppler_XPATH", "CreateOrderfromSuppler_XPATH", 60);
    }

    @Description("Product Category Plus")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void ProductCategoryPlus() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"ProductCategoryPlus_XPATH", "ProductCategoryPlus_XPATH", 60);
    }

    @Description("Select Beverages")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void SelectBeverages() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"SelectBeverages_XPATH", "SelectBeverages_XPATH", 60);
    }

    @Description("Add Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11, invocationCount = 6)
    public void AddProduct() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH", 60);
    }

    @Description("Payment Option")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void PaymentOption() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"vpAymetnOPY_XPATH", 60);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"PayInvoiceCOM_XPATH", 60);
    }

    @Description("Generate Order ID")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void GenerateOrderID() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Gene_XPATH", 60);
    }

    @Description("Assert Pay POS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void AssertPayInvoice() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"ComfirmPOSPayment_XPATH", "fr_TEXT", "frPass_TEXT", "frFail_TEXT", 20);
    }
}
