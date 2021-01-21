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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class Suspend_UnSuspendBuyer extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);

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

    @Description("Value chain Buyer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void ValuechainBuyer() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady(driver,"ValuechainByers_XPATH", "Buyersbtn_TEXT", 60);
    }

    @Description("Buyers Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void BuyersAction() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"Buyer_XPATH", "Buyer_XPATH", 60);
        utility.DoclickWhenReady(driver,"BuyerActionBTN_XPATH", "BuyerActbtn_TEXT", 60);
    }

    @Description("Product Available for Buy")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void ProductAvailableforBuy() throws IOException, InterruptedException {
        this.BuyersAction();
        utility.DoclickWhenReady(driver,"ProductAvailableForBuy_XPATH", "Productav_TEXT", 60);
    }

    @Description("Assert Product Code")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void AssertProductCode() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"AssertProductCode_XPATH", "cont_TEXT", "vpass_TEXT", "vfail_TEXT", 60);
        driver.navigate().back();
        this.BuyersAction();
    }

    @Description("Suspend Buyer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void SuspendBuyer() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"SuspendBuyer_XPATH", "SuspendBuyer_XPATH", 60);
    }

    @Description("GET")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
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
    @Test(priority = 10)
    public void Supplier() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"Suppliers_XPATH", "Suppliers_XPATH", 60);
    }

    @Description("Assert Suspend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AssertSuspend() throws IOException, InterruptedException {
        Thread.sleep(1000);
        WebElement msgoomm = (new WebDriverWait(driver, 12)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchLocator("AssertSuspended_XPATH"))));
        String textoomm = msgoomm.getText();
        if (msgoomm.isEnabled() && textoomm.contains("Access Suspended")) {
            test.log(Status.PASS, "Access Suspended was Successful");
        } else {
            test.log(Status.FAIL, "Suspension Failed");
        }
    }

    @Description("Buyer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void Buyer() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://www.cicod.com/login");
        this.login();
        this.CustomerOrderManagement();
        this.Customermanagment();
        this.Valuechain();
        this.ValuechainBuyer();
        this.BuyersAction();
        this.ProductAvailableforBuy();
        driver.navigate().back();
        this.BuyersAction();
    }

    @Description("Unsuspend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void Unsuspend() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"UnsuspendBuyer_XPATH", 20);
    }

    @Description("Assert Unsuspend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void AssertUnsuspend() throws IOException, InterruptedException {
        Thread.sleep(1000);
        WebElement msgoommm = (new WebDriverWait(driver, 12)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchLocator("AssertUnsuspension_XPATH"))));
        String textoommm = msgoommm.getText();
        if (msgoommm.isEnabled() && textoommm.contains("Unsuspended Merchant Successfully.")) {
            test.log(Status.PASS, "Unsuspension was Successful");
        } else {
            test.log(Status.FAIL, "UnSuspension Failed");
        }
    }

    @Description("Redo Get")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void RedoGet() throws IOException, InterruptedException {
        this.GET();
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Suppliers_XPATH", 20);
    }
}
