package CROWN.CICOD.COM.ProductManagement;

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

import java.awt.*;
import java.io.IOException;

public class UPDATE_PRODUCT extends TestBase {

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

    @Description("Action")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Action() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("ActionSuspendbtn_XPATH", 20);
    }

    @Description("Update")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void Update() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady("Updatebtn_XPATH", 20);
    }

    @Description("Product Description")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void ProductDescription() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSendKeysWhenReady("ProductDiscriptioni_XPATH", "ProductDiscription_TEXT", 20);
    }

    @Description("Save")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void Save() throws IOException, InterruptedException, AWTException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("isave_XPATH"))).click();
    }

    @Description("Assert ADD PRODUCT")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void AssertADDPRODUCT() throws IOException, InterruptedException, AWTException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady("AssertProductCreation_XPATH", "Addprodcon_TEXT", "assUpdatesPass_TEXT", "assUpdatesFail_TEXT", 20);
    }
}