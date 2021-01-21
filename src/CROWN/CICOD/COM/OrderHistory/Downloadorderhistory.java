package CROWN.CICOD.COM.OrderHistory;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Listeners(InvokedMethodListeners.class)
public class Downloadorderhistory extends TestBase {

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

    @Description("Order History")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void OrderHistory() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"OrderHistorybtn_XPATH", 30);
    }

    @Description("Download Order History")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void DownloadOrderHistory() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"DownloadOrderHistorybtn_XPATH", 30);
    }
}