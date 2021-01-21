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

@Listeners(InvokedMethodListeners.class)
public class VIEW_ORDER_HISTORY extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

    @Test(priority = 1)
    public void loginAsAdmin() throws IOException, InterruptedException {
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

    @Description("Order Record")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void OrderRecord() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("ClickOnOrderRecordsbtn_XPATH"))).click();
    }

    @Description("Assert ORDER History")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Assert_ORDER_history() throws IOException, InterruptedException {
        assertion.DoAssertXpathPresentWhenReady(driver,"AssertRecord_XPATH", "OrderPass_TEXT", "OrderFail_TEXT", 20);
    }
}
