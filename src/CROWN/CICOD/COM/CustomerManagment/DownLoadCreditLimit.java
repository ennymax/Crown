package CROWN.CICOD.COM.CustomerManagment;

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
import java.awt.*;
import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class DownLoadCreditLimit extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

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

    @Description("Credit Limit")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void CreditLimit() throws IOException, InterruptedException {
        utility.DoclickFluentWait(driver,"Customermanagmentbtn_XPATH", "Customermanagmentbtn_XPATH", 60);
        utility.DoclickFluentWait(driver,"CreditLimi_XPATH", "creditlimit_TEXT", 60);
    }

    @Description("Assert Credit Limit")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void AssertCreditLimit() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"AssertViewCreditLimi_XPATH","assertcredit_TEXT","creditpass_TEXT","creditfail_TEXT",60);
    }

    @Description("DOWNLOAD CREDIT HISTORY")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void DOWNLOAD_CREDIT_HISTORY() throws IOException, InterruptedException, AWTException {
        excelUtil.DoclickWhenReady(driver,"DownloadCreditHistory_XPATH",20);
    }
}
