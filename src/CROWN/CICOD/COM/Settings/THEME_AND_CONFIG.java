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
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class THEME_AND_CONFIG extends TestBase {

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

    @Description("Webshop Settings")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void WebshopSettings() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"WebshopSettings_XPATH", 20);
    }

    @Description("WorkShop Configuration")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void WorkShopConfiguration() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"WorkShopConfiguration_XPATH", 20);
    }

    @Description("Update Theme")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void UpdateTheme() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"UpdateTheme_XPATH", 20);
    }

    @Description("Store Location")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void StoreLocation() throws IOException, InterruptedException {
        excelUtil.DoSelectValuesByIndex(driver,"StoreLocation_XPATH", 1, 20);
    }

    @Description("Theme Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void ThemeSave() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ThemeSaveBTN_XPATH", 20);
    }

    @Description("Assert Theme Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AssertThemeSave() throws IOException, InterruptedException {
        assertion.DoAssertXpathPresentWhenReady(driver,"assertThemeUpdate_XPATH", "ThemePass_TEXT", "ThemeFail_TEXT", 20);
    }
}
