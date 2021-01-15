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
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import java.io.IOException;

public class THEME_AND_CONFIG extends TestBase {

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

    @Description("Webshop Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void WebshopSettings() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("WebshopSettings_XPATH", 20);
    }

    @Description("WorkShop Configuration")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void WorkShopConfiguration() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("WorkShopConfiguration_XPATH", 20);
    }

    @Description("Update Theme")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void UpdateTheme() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("UpdateTheme_XPATH", 20);
    }

    @Description("Store Location")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void StoreLocation() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndex("StoreLocation_XPATH", 1, 20);
    }

    @Description("Theme Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void ThemeSave() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("ThemeSaveBTN_XPATH", 20);
    }

    @Description("Assert Theme Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AssertThemeSave() throws IOException, InterruptedException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertXpathPresentWhenReady("assertThemeUpdate_XPATH", "ThemePass_TEXT", "ThemeFail_TEXT", 20);
    }

}
