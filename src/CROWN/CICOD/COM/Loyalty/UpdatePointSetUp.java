package CROWN.CICOD.COM.Loyalty;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.security.SecureRandom;

@Listeners(InvokedMethodListeners.class)
public class UpdatePointSetUp extends TestBase {

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

    @Description("Loyalty")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void Loyalty() throws IOException, InterruptedException {
        ExcelUtil util = new ExcelUtil(driver);
        util.DoscrolltoViewClickWhenReady(driver,"LoyaltyBTN_XPATH", 30);
    }

    @Description("Point SetUp")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void PointSetUp() throws IOException, InterruptedException {
        ExcelUtil util = new ExcelUtil(driver);
        util.DoscrolltoViewClickWhenReady(driver,"PointSetup_XPATH", 30);
    }

    @Description("Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Action() throws IOException, InterruptedException {
        ExcelUtil util = new ExcelUtil(driver);
        util.DoscrolltoViewClickWhenReady(driver,"ActionPointSetUp_XPATH", 30);
    }

    @Description("Update Point")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void UpdatePoint() throws IOException, InterruptedException {
        ExcelUtil util = new ExcelUtil(driver);
        util.DoclickWhenReady(driver,"UpdateActionPoint_XPATH", 30);
    }

    @Description("EE")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void ProductSpendA() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomNumberWhenReady(driver,"spendU_XPATH", 50,20);
    }

    @Description("Save Product Specific Spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void SaveProductSpecificSpend() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Uddd_XPATH", 20);
    }

    @Description("Assert Update Point SetUp")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AssertUpdatePointSetUp() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady(driver,"AssertProductCate_XPATH", "contP_TEXT", "ContP_TEXT", "ContF_TEXT", 20);
    }
}
