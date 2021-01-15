package CROWN.CICOD.COM.ProductManagement;

import CROWN.Base.TestBase;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class PRODUCT_CATEGORY extends TestBase {

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
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady("productCategory_XPATH", "productCategory_XPATH", 60);
    }

    @Description("Add Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void AddProduct() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady("AddProductbtn_XPATH", "AddProductbtn_XPATH", 60);
    }

    @Description("Product Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void ProductName() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomListwordsWhenReady("ProductName_XPATH", 20);
    }

    @Description("Product Discription")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void ProductDiscription() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSendKeysWhenReady("ProductDiscription_XPATH", "ProductDiscription_TEXT", 20);
    }

    @Description("IMG")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void IMG() throws IOException, InterruptedException, AWTException {
        FileUpload fileUpload = new FileUpload();
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();

        Thread.sleep(4000);
        fileUpload.UploadFileImage3MB();
    }

    @Description("Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void Save() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady("savvbtn_XPATH", 20);
    }

    @Description("Assert Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void AssertSave() throws IOException, InterruptedException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady("AssertProductCate_XPATH", "catsacant_TEXT", "catsacantPass_TEXT", "catsacantFail_TEXT", 20);
    }
}