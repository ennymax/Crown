package CROWN.CICOD.COM.ProductManagement;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
public class CreateOfferSettings extends TestBase {

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

    @Description("Product Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void ProductManagement() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady(driver,"ProductManagementbtn_XPATH", "ProductManagementbtn_XPATH", 60);
    }

    @Description("Offers")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void Offers() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"OffersBTN_XPATH", 20);
    }

    @Description("Add Product Offer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void AddProductOffer() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddProductOfferBTN_XPATH", 20);
    }

    @Description("COffer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void cOffer() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"cOffer_XPATH", 20);
    }

    @Description("Offer Details")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void OfferDetails() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"OferNAME_XPATH", 20);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"OfferDesc_XPATH", 20);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"OfferCode_XPATH", 20);
        excelUtil.DosendKeysRandomNumberWhenReady(driver,"Offerquanti_XPATH", 100, 20);
    }

    @Description("Save Offer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void SaveOffer() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady(driver,"Offersave_XPATH", 20);
    }

    @Description("Assert Save Offer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AssertSaveOffer() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady(driver,"m_XPATH", "Offersave_TEXT", "OffersavePass_TEXT", "OffersaveFail_TEXT", 20);
    }
}
