package CROWN.CICOD.COM.ValueChain;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class Set_Spend_and_Assert_Minimum_Spend extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        login.Loginlupin(driver);
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver, "com_XPATH", "comm_TEXT", 60);
    }

    @Description("Customer management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void Customermanagment() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver, "Customermanagmentbtn_XPATH", "Customermanagmentbtn_XPATH", 60);
    }

    @Description("Value chain")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void Valuechain() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver, "ValuechainBTN_XPATH", "ValuechainBTN_XPATH", 60);
    }

    @Description("Value chain Buyer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void ValuechainBuyer() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady(driver, "ValuechainByers_XPATH", "Buyersbtn_TEXT", 60);
    }

    @Description("Buyers Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void BuyersA() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver, "Buyer_XPATH", "Buyer_XPATH", 60);
    }

    @Description("Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void Action() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver, "BuyerActionBTN_XPATH", "BuyerActbtn_TEXT", 60);
    }

    @Description("Set minimum spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void Setminimumspend() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "SetminimumspendBTN_XPATH", "mimiSpedn_TEXT", 60);
    }

    @Description("input minimum spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void inputminimumspend() throws IOException, InterruptedException {
        utility.DoSendKeysWhenReady(driver, "InputMiniSp_XPATH", "SpenAMt_TEXT", "SpenAMt_TEXT", 60);
    }

    @Description("Save minimum spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void Saveminimumspend() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "SaveMiniSpend_XPATH", "Savem_TEXT", 60);
    }

    @Description("Assert Save minimum spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AssertSaveminimumspend() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver, "Assertminispendalert_XPATH", "Conty_TEXT", "minispendasspass_TEXT", "minispendassertfail_TEXT", 60);
    }

    @Description("GET")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void GET() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://www.cicod.com/login");
        login.LoginDefault(driver);
        this.CustomerOrderManagement();
        this.Customermanagment();
        this.Valuechain();
    }

    @Description("Supplier")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void Supplier() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver, "Suppliers_XPATH", "Suppliers_XPATH", 60);
    }

    @Description("Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void Action2() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "BuyerActionBTN_XPATH", "But_TEXT", 60);
    }

    @Description("Supplier Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void SupplierProduct() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "SuppliersProduct_XPATH", "Supplbu_TEXT", 60);
    }

    @Description("Create Order Supplier Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 16)
    public void CreateOrderSupplierProduct() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "CreateOrderfromSuppler_XPATH", "CretOrer_TEXT", 60);
    }

    @Description("Assert Minimum spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 17)
    public void AssertMinimumspend() throws IOException, InterruptedException {
        assertion.DoAssertEqualWhenReady(driver, "AssertMinimuspend_XPATH", "1,000.00", "Aminspass_TEXT", "Aminsfail_TEXT", 60);
    }

    @Description("Product Category")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 18)
    public void ProductCategory() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "ProductCategoryPlus_XPATH", "ProductCa_TEXT", 60);
    }

    @Description("Select Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 19)
    public void SelectProduct() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "SelectBeverages_XPATH", "SelectBeve_TEXT", 60);
    }

    @Description("Add Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 20, invocationCount = 5)
    public void AddProduct() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "AddProduct_XPATH", "Addpro_TEXT", 60);
    }

    @Description("Make Payment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 21)
    public void MakePayment() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "MakePayment_XPATH", "Makepa_TEXT", 60);
    }

    @Description("PayOnline")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 22)
    public void PayOnline() throws IOException, InterruptedException {
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver, "PayOnline_XPATH", "Payoo_TEXT", 60);
    }

    @Description("Assert PayOnline")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 23)
    public void AssertPayOnline() throws IOException, InterruptedException {
        utility.DoswitchtoframeWhenReady(driver, 0, 13000);
        assertion.DoAssertEqualWhenReady(driver, "ASSenable_XPATH", "NGN1,522.50", "Aminspedpass_TEXT", "AminspedFaled_TEXT", 90);
    }

    @Description("GET")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 24)
    public void GET1() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://www.cicod.com/login");
        login.Login(driver);
        this.CustomerOrderManagement();
        this.Customermanagment();
        this.Valuechain();
        this.ValuechainBuyer();
    }

    @Description("Reset Minimum Spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 25)
    public void ResetMinimumSpend() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"BuyerActionBTN_XPATH", "BuyerActbtn_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SetminimumspendBTN_XPATH","mimiSpedn_TEXT",60);
        driver.findElement(By.xpath(Utility.fetchLocator("InputMiniSp_XPATH"))).clear();
        driver.findElement(By.xpath(Utility.fetchLocator("InputMiniSp_XPATH"))).sendKeys("1");
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SaveMiniSpend_XPATH","Savem_TEXT",60);
    }
}
