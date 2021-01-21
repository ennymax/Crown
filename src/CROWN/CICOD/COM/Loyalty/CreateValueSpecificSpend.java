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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.security.SecureRandom;

@Listeners(InvokedMethodListeners.class)
public class CreateValueSpecificSpend extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 1)
    public void  login() throws IOException, InterruptedException {
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

    @Description("Value Specific Spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void ValueSpecificSpend() throws IOException, InterruptedException {
        ExcelUtil util = new ExcelUtil(driver);
        util.DoscrolltoViewClickWhenReady(driver,"ValueSpecificSpendBTN_XPATH", 30);
    }

    @Description("Create Value Specific Spend")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void CreateValueSpeificSpend() throws IOException, InterruptedException {
        ExcelUtil util = new ExcelUtil(driver);
        util.DoscrolltoViewClickWhenReady(driver,"CreateProductSpecificValue_XPATH", 30);
    }

    @Description("Amount")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void Amount() throws IOException, InterruptedException {
        ExcelUtil util = new ExcelUtil(driver);
        util.DoSendKeysWhenReady(driver,"A_XPATH", "Amount_TEXT", 20);
    }

    @Description("Point")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void Point() throws IOException, InterruptedException {
        Thread.sleep(2000);
        (new WebDriverWait(driver, 20)).until(ExpectedConditions.elementToBeClickable(By.name("ValueSpecificSpend[point]"))).sendKeys("45");
    }

    @Description("Period")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void Period() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndex(driver,"Period_XPATH", 1, 20);
    }

    @Description("CREATE VALUE SPECIFIC SPEND")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void CREATE_VALUE_SPECIFIC_SPEND() throws IOException, InterruptedException, AWTException {
        ExcelUtil util = new ExcelUtil(driver);
        util.DoscrolltoViewClickWhenReady(driver,"SaveProductSpecificEnd_XPATH", 30);
    }
}
