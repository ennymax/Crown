package CROWN.CICOD.COM.Settings;

import CROWN.Base.TestBase;
import CROWN.utility.Assertion;
import CROWN.utility.ExcelUtil;
import CROWN.utility.Login;
import CROWN.utility.Utility;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import java.io.IOException;

public class UPDATE_TAX extends TestBase {

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

    @Description("Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void Setting() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Settings_XPATH", 20);
    }

    @Description("System Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SystemSetting() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("SystemSettings_XPATH", 20);
    }

    @Description("Tax")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Tax() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Vt_XPATH", 20);
    }

    @Description("Tax Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void TaxAction() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("TaxActionbtn_XPATH", 20);
    }

    @Description("Tax Update")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void TaxUpdate() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("TaxUdatebtn_XPATH", 20);
    }

    @Description("Tax Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void TaxName() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomListwordsWhenReady("TaxName_XPATH", 20);
    }

    @Description("Tax Value")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void TaxValue() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomNumberWhenReady("TaxValue_XPATH",10, 20);
    }

    @Description("Tax Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void TaxSave() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady("TaxSavebtn_XPATH", 20);
    }


    @Description("Assert Tax Save ")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void AssertTaxSave() throws IOException, InterruptedException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertXpathPresentWhenReady("AssertUpdateTax_XPATH","TaxUpdatePass_TEXT","TaxUpdateFail_TEXT",20);
    }
}
