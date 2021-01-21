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

import static org.testng.AssertJUnit.assertEquals;

@Listeners(InvokedMethodListeners.class)
public class PurchaseProductValuechainPayNow extends TestBase {

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
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH", 60);
    }

    @Description("Make Payment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void MakePayment() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"MakePayment_XPATH", 60);
    }

    @Description("Pay Online")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void PayOnline() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"PayOnline_XPATH", 60);
    }

    @Description("Assert Pay Online")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void AssertPayOnline() throws IOException, InterruptedException {
        Thread.sleep(13000);
        driver.switchTo().frame(0);

        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("option-payment-amount-xs")).getText());

        Thread.sleep(8000);
        assertEquals("NGN1,827.00", driver.findElement(By.id("option-payment-amount-xs")).getText());
    }

    @Description("GET")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void Get() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.get("https://emaxkemiyop.cicod.com/cuorma/web/value-chain/order?id=10147");
    }


    @Description("Product Category Plus POS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 16)
    public void ProductCategoryPlusPOS() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"ProductCategoryPlus_XPATH", "ProductCategoryPlus_XPATH", 60);
    }

    @Description("Select Beverages POS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 17)
    public void SelectBeveragesPOS() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"SelectBeverages_XPATH", "SelectBeverages_XPATH", 60);
    }

    @Description("Add Product POS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 18, invocationCount = 6)
    public void AddProductPOS() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH", 60);
    }

    @Description("Make Payment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 19)
    public void MakePaymentPOS() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"MakePayment_XPATH", 60);
    }

    @Description("Pay POS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 20)
    public void PayPOS() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"POS_XPATH", 60);
    }

    @Description("Confirm Pay POS")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 21)
    public void ConfirmPayPOS() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ConfirmPAymantPOS_XPATH", 60);
    }

    @Description("GET")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 22)
    public void GetUSSD() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.get("https://emaxkemiyop.cicod.com/cuorma/web/value-chain/order?id=10147");
    }

    @Description("Product Category Plus USSD")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 23)
    public void ProductCategoryPlusUSSD() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"ProductCategoryPlus_XPATH", "ProductCategoryPlus_XPATH", 60);
    }

    @Description("Select Beverages USSD")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 24)
    public void SelectBeveragesUSSD() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"SelectBeverages_XPATH", "SelectBeverages_XPATH", 60);
    }

    @Description("Add Product USSD")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 25, invocationCount = 6)
    public void AddProductUSSD() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH", 60);
    }

    @Description("Make Payment USSD")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 26)
    public void MakePaymentUSSD() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"MakePayment_XPATH", 60);
    }

    @Description("USSD")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 27)
    public void USSD() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ValueChainPayUSSD_XPATH", 60);
    }

    @Description("Assert USSD")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 28)
    public void AssertUSSD() throws IOException, InterruptedException {
        assertion.DoAssertXpathPresentWhenReady(driver,"con1_XPATH", "UssdPass_TEXT", "UssdFail_TEXT", 30);
    }
}
