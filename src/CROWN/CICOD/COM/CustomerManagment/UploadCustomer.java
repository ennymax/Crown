package CROWN.CICOD.COM.CustomerManagment;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class UploadCustomer extends TestBase {

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

    @Description("Select Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SelectCustomer() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady(driver,"SelectCustomerbtn_XPATH", 20);
    }

    @Description("Upload Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void UploadCustomer() throws IOException, InterruptedException, AWTException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"uPLAODcUSTOMER_XPATH", 20);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ChooseFille_XPATH", 20);
    }

    @Description("File Upload")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void FileUpload() throws IOException, InterruptedException, AWTException {
        FileUpload fileUpload = new FileUpload();
        fileUpload.UploadXLSX1(driver);
    }

    @Description("Assert File Upload")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void AssertFileUpload() throws IOException, InterruptedException, AWTException {
      Assertion assertion = new Assertion(driver);
        assertion.DoAssertContainsWhenReady(driver,"AsserfileUp_XPATH", "Assertfileupstr_TEXT", "Assertionpp_TEXT", "Assertionpf_TEXT", 20);
    }
}
