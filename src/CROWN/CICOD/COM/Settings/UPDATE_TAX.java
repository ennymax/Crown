package CROWN.CICOD.COM.Settings;

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

@Listeners(InvokedMethodListeners.class)
public class UPDATE_TAX extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);

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

    @Description("Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void Setting() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Settings_XPATH", 20);
    }

    @Description("System Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SystemSetting() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SystemSettings_XPATH", 20);
    }

    @Description("Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Tax() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Vt_XPATH", 20);
    }

    @Description("Tax Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void TaxAction() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"TaxActionbtn_XPATH", 20);
    }

    @Description("Tax Update")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void TaxUpdate() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"TaxUdatebtn_XPATH", 20);
    }

    @Description("Tax Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void TaxName() throws IOException, InterruptedException {
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"TaxName_XPATH", 20);
    }

    @Description("Tax Value")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void TaxValue() throws IOException, InterruptedException {
        excelUtil.DosendKeysRandomNumberWhenReady(driver,"TaxValue_XPATH",10, 20);
    }

    @Description("Tax Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void TaxSave() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"TaxSavebtn_XPATH", 20);
    }


    @Description("Assert Tax Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AssertTaxSave() throws IOException, InterruptedException {
        assertion.DoAssertXpathPresentWhenReady(driver,"AssertUpdateTax_XPATH","TaxUpdatePass_TEXT","TaxUpdateFail_TEXT",20);
    }
}
