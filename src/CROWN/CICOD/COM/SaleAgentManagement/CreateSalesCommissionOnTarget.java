package CROWN.CICOD.COM.SaleAgentManagement;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;
import java.security.SecureRandom;

@Listeners(InvokedMethodListeners.class)
public class CreateSalesCommissionOnTarget extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

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

    @Description("Credit Limit")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void SalesManagement() throws IOException, InterruptedException {
        utility.DoclickFluentWait(driver,"SaleManagementBTN_XPATH", "SaleManagementBTN_XPATH", 60);
    }

    @Description("Sale Commission")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SaleCommission() throws IOException, InterruptedException {
        utility.DoclickFluentWait(driver,"SaleCommissionBTN_XPATH", "SaleCommissionBTN_XPATH", 60);
    }

    @Description("Create Sale Commission")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void CreateSaleCommission() throws IOException, InterruptedException {
        utility.DoclickFluentWait(driver,"CreateSaleCommissiontBTN_XPATH", "CreateSaleCommissiontBTN_XPATH", 60);
    }

    @Description("Commission Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void CommissionName() throws IOException, InterruptedException {
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"ComissionName_XPATH", 20);
    }

    @Description("EE")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void EE() throws IOException, InterruptedException {
        excelUtil.DoSelectValuesByIndex(driver,"ccc_XPATH", 2, 20);
        excelUtil.DoSelectValuesByIndex(driver,"vb_XPATH", 1, 20);
    }

    @Description("Actual Value")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void ActualValue() throws IOException, InterruptedException {
        excelUtil.DoSendKeysWhenReady(driver,"ActualValue_XPATH", "45_TEXT", 20);
    }

    @Description("AA")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AA() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"AAAA_XPATH", 20);
        Thread.sleep(6000);
    }

    @Description("Assert Create Sales Commission")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void AssertCreateSalesCommission() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"mct_XPATH", "Commissioncont_TEXT", "comOPass_TEXT", "comOFail_TEXT", 20);
    }
}
