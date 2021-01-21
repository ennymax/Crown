package CROWN.CICOD.COM.CustomerManagment;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.poi.hssf.record.PageBreakRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.security.SecureRandom;

import static org.testng.AssertJUnit.assertEquals;

@Listeners(InvokedMethodListeners.class)
public class Lodgment extends TestBase {

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

    @Description("View Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void ViewCustomer() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"VIEWCustomer_XPATH", 20);
    }

    @Description("Assert View Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void AssertViewCustomer() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady(driver,"AssertViewCustomer_XPATH", "as_TEXT", "asPass_TEXT", "asfailed_TEXT", 20);
    }

    @Description("Update Lodgment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void UpdateLodgment() throws IOException, InterruptedException, AWTException {
        Thread.sleep(2000);
        Actions builder = new Actions(driver);
        WebElement element1 = driver.findElement(By.xpath(Utility.fetchLocator("Lodg_XPATH")));
        builder.moveToElement(element1).build().perform();

        if ((driver.findElement(By.xpath(Utility.fetchLocator("ADDLOG_XPATH")))).isDisplayed()) {
            ExcelUtil excelUtil = new ExcelUtil(driver);
            excelUtil.DoclickWhenReady(driver,"ADDLOG_XPATH", 20);
        }

        if ((driver.findElement(By.xpath(Utility.fetchLocator("UpateLodgenebt_XPATH")))).isDisplayed()) {
            Thread.sleep(2000);
            driver.findElement(By.xpath(Utility.fetchLocator("UpateLodgenebt_XPATH"))).click();
            Thread.sleep(2000);
            WebElement fg = driver.findElement(By.xpath(Utility.fetchLocator("Up_XPATH")));
            fg.clear();
            fg.sendKeys("1000000");

            Thread.sleep(2000);
            driver.findElement(By.xpath(Utility.fetchLocator("UpdateBTNLOdgement_XPATH"))).click();
            Assertion assertion = new Assertion(driver);
            assertion.DoAssertEqualWhenReady(driver,"AssertLodgment_XPATH", "ContLogment_TEXT", "contLodgmentpass_TEXT", "contLodgmentFail_TEXT", 20);

        }
    }

    @Description("Add Lodgment Amount")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AddLodgmentAmount() throws IOException, InterruptedException, AWTException {
        Utility utility = new Utility(driver);
        utility.DosendKeysRandomNumberWhenReady(driver,"LodgementAmount_XPATH", 100000, 20);
    }

    @Description("Lodgment Date")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void LodgmentDate() throws IOException, InterruptedException, AWTException {
        DatePicker datePicker = new DatePicker(driver);
        datePicker.DatePickerJE(driver,"EnterDate_XPATH", "2020-10-1");
    }

    @Description("Save Lodgment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void SaveLodgment() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady(driver,"SaveLodgement_XPATH", 20);
    }

    @Description("Assert Lodgment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AssertLodgment() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertXpathPresentWhenReady(driver,"AssertLogement_XPATH", "Loggnepass_TEXT", "LodgmentFailed_TEXT", 20);
    }
}
