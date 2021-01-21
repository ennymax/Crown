package CROWN.CICOD.COM.ProductManagement;

import CROWN.Base.TestBase;
import CROWN.Listeners.ExtenReport;
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

@Listeners(InvokedMethodListeners.class)
public class AddMultipleProductToWebShop extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        this.login.Login1(driver);
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT", 60);
    }

    @Description("Product Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void ProductManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"ProductManagementbtn_XPATH", "ProductManagementbtn_XPATH", 60);
    }

    @Description("product Category")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void productCategory() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"productCategory_XPATH", 20);
    }

    @Description("Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Product() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Ch_XPATH", 20);
    }

    @Description("Bulk Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void BulkAction() throws IOException, InterruptedException {
        excelUtil.DoSelectValuesByIndex(driver,"BulkActionBTN_XPATH", 1, 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void AcceptAlert() throws IOException, InterruptedException {
        utility.DowaitandAcceptAlerwhenReady(driver,20);
    }

    @Description("Assert Add Multiple Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AssertAddMultiple() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"catassert_XPATH", "asscon_TEXT", "assconPass_TEXT", "assconFail_TEXT", 20);
    }

    @Description("Bulk Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void BulkAction1() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Ch_XPATH", 20);
        excelUtil.DoSelectValuesByIndex(driver,"BulkActionBTN_XPATH", 2, 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void AcceptAlert2() throws IOException, InterruptedException {
        utility.DowaitandAcceptAlerwhenReady(driver,20);
    }

    @Description("Assert Remove Multiple Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AssertRemoveMultiple() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"catassert_XPATH", "asscon1_TEXT", "assconPass1_TEXT", "assconFail1_TEXT", 20);
    }
}
