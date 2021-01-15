package CROWN.CICOD.COM.ProductManagement;

import CROWN.Base.TestBase;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.security.SecureRandom;

public class ADD_PRODUCT extends TestBase {

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

    @Description("Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void Product() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Productbtn_XPATH", 20);
    }

    @Description("Add Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void AddProduct() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Add_Producttn_XPATH", 20);
    }

    @Description("Select Product Category")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void SelectProductCategory() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndexRandom("SelectProductCategory_XPATH", 7, 20);
    }

    @Description("Product Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void ProductName() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomListwordsWhenReady("ProductNamei_XPATH", 20);
    }

    @Description("Product Description")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void ProductDescription() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSendKeysWhenReady("ProductDiscriptioni_XPATH", "ProductDiscription_TEXT", 20);
    }

    @Description("Upload Product IMG")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void UploadProductIMG() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        FileUpload fileUpload = new FileUpload();
        excelUtil.DoclickWhenReady("UploadProductIMG_XPATH", 20);
        fileUpload.UploadFileImage3MB();
    }

    @Description("Product Code")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void ProductCode() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomNumberWhenReady("ProductCode_XPATH", 100000, 20);
    }

    @Description("Product Prize")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void ProductPrize() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomNumberWhenReady("ProductPrize_XPATH", 100000, 20);
    }

    @Description("Upload Product IMG")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void ProductDetails() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady("AddToworkshoptCheckBox_XPATH", 10);
        excelUtil.DosendKeysRandomNumberWhenReady("ReservationDays_XPATH", 100000, 20);
        excelUtil.DoclickWhenReady("NoQuantityLimitCheckBox_XPATH", 10);
        excelUtil.DoSelectValuesByIndex("Vat_XPATH", 1, 20);
    }

    @Description("Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void Save() throws IOException, InterruptedException, AWTException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("isave_XPATH"))).click();
    }

    @Description("Assert ADD PRODUCT")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void AssertADDPRODUCT() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady("AssertProductCreation_XPATH", "assUpdates_TEXT", "AddprodconPass_TEXT", "AddprodconFail_TEXT", 20);
    }
}