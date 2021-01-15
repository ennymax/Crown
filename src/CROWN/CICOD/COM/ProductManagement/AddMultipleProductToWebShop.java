package CROWN.CICOD.COM.ProductManagement;

import CROWN.Base.TestBase;
import CROWN.utility.Assertion;
import CROWN.utility.ExcelUtil;
import CROWN.utility.Login;
import CROWN.utility.Utility;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;
import java.awt.*;
import java.io.IOException;

public class AddMultipleProductToWebShop extends TestBase {

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        Login login = new Login(driver);
        login.Login();
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady("com_XPATH", "comm_TEXT", 60);
    }

    @Description("Product Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void ProductManagement() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady("ProductManagementbtn_XPATH", "ProductManagementbtn_XPATH", 60);
    }

    @Description("product Category")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void productCategory() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("productCategory_XPATH", 20);
    }

    @Description("Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Product() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Ch_XPATH", 20);
    }

    @Description("Bulk Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void BulkAction() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndex("BulkActionBTN_XPATH",1, 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void AcceptAlert() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DowaitandAcceptAlerwhenReady(20);
    }

    @Description("Assert Add Multiple Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AssertAddMultiple() throws IOException, InterruptedException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady("catassert_XPATH", "asscon_TEXT", "assconPass_TEXT","assconFail_TEXT",20);
    }

    @Description("Bulk Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void BulkAction1() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Ch_XPATH", 20);
        excelUtil.DoSelectValuesByIndex("BulkActionBTN_XPATH",2, 20);
    }

    @Description("Accept Alert")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void AcceptAlert2() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DowaitandAcceptAlerwhenReady(20);
        Thread.sleep(999999999);
    }

    @Description("Assert Remove Multiple Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AssertRemoveMultiple() throws IOException, InterruptedException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady("catassert_XPATH", "asscon1_TEXT", "assconPass1_TEXT","assconFail1_TEXT",20);
    }

}
