package CROWN.CICOD.COM.ValueChain;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class RequestValueChainUser extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected RavePay ravePay = new RavePay(driver);

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

    @Description("Customer management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void Customermanagment() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"Customermanagmentbtn_XPATH", "Customermanagmentbtn_XPATH", 60);
    }

    @Description("Value chain")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void Valuechain() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"ValuechainBTN_XPATH", "ValuechainBTN_XPATH", 60);
    }

    @Description("Request")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void Request() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"RequestBTN_XPATH", 60);
    }

    @Description("Input Search Merchant")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void InputSearchMerchant() throws IOException, InterruptedException {
        excelUtil.DoSendKeysWhenReady(driver,"InputSearchMarchant_XPATH", "ShopSearch_TEXT", 60);
    }

    @Description("Search Merchant")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void Searchmerchant() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"SearchBTNMACHANT_XPATH", 60);
    }

    @Description("Assert Search Merchant")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AssertSearchmerchant() throws IOException, InterruptedException {
        Thread.sleep(1000);
        WebElement msgl = (new WebDriverWait(driver, 45)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchLocator("MerchantName_XPATH"))));
        String textl = msgl.getText();
        if (msgl.isEnabled() && textl.contains("emaxkemi")) {
            test.log(Status.PASS, "Merchant name was displayed");
        } else {
            test.log(Status.FAIL, "Failed to display Merchant Name");
        }

        Thread.sleep(1000);
        WebElement msgk = (new WebDriverWait(driver, 45)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchLocator("MerchantID_XPATH"))));
        String textk = msgk.getText();
        if (msgk.isEnabled() && textk.contains("emaxkemi")) {
            test.log(Status.PASS, "Merchant ID was displayed");
        } else {
            test.log(Status.FAIL, "Failed to display Merchant ID");
        }

        Thread.sleep(2000);
        WebElement msg = (new WebDriverWait(driver, 45)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchLocator("BizzSext_XPATH"))));
        String text = msg.getText();
        if (msg.isEnabled() && text.contains("Others")) {
            test.log(Status.PASS, "Merchant Business Sector was displayed");
        } else {
            test.log(Status.FAIL, "Failed to display Merchant Business Sector");
        }
    }

    @Description("Send Request")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void SendRequest() throws IOException, InterruptedException {
        excelUtil.DoclickWhenReady(driver,"SendRequestBTN_XPATH", 60);
    }

    @Description("Assert Send Request")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void AssertSendRequest() throws IOException, InterruptedException {
        Thread.sleep(1000);
        WebElement msgm = (new WebDriverWait(driver, 25)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchLocator("AssertRequestSent_XPATH"))));
        String textm = msgm.getText();
        if (msgm.isEnabled() && textm.contains("Request Sent")) {
            test.log(Status.PASS, "Request was sent Successfully");
        } else {
            test.log(Status.FAIL, "Failed to send Request");
        }
    }

    @Description("GET")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void GET() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://www.cicod.com/login");

        Thread.sleep(2000);
        Login login = new Login(driver);
        login.LoginDefault(driver);
        this.CustomerOrderManagement();
        this.Customermanagment();
        this.Valuechain();
        this.Request();
    }

    @Description("Action Button")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void ActionButton() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ReActionBTN_XPATH", 60);
    }

    @Description("Reject Request")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void RejectRequest() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"RejectActionBTN_XPATH", 60);
    }

    @Description("Reason for reject Request")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 14)
    public void ReasonforrejectRequest() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DosendKeysRandomListwordsWhenReady(driver,"ReasonForReject_XPATH", 60);
    }

    @Description("Decline")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 15)
    public void Decline() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoclickWhenReady(driver,"DeclineBTN_XPATH", 60);
    }

    @Description("Assert Decline")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 16)
    public void AssertDecline() throws IOException, InterruptedException {
        Thread.sleep(1000);
        WebElement msgo = (new WebDriverWait(driver, 45)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchLocator("AssertDecline_XPATH"))));
        String texto = msgo.getText();
        if (msgo.isEnabled() && texto.contains("Declined Successfully")) {
            test.log(Status.PASS, "Decline was successful");
        } else {
            test.log(Status.FAIL, "Decline Failed");
        }
    }
}
