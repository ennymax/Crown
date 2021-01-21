package CROWN.CICOD.COM.CreateOrder;

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

import java.io.IOException;
import java.security.SecureRandom;

@Listeners(InvokedMethodListeners.class)
public class ApplyDiscount extends TestBase {

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

    @Description("Create Order")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void CreateOrder() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Createorderbtn_XPATH", 30);
    }

    @Description("Search Customer By Name")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SearchCustomerByName() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SearchByName_XPATH", 30);
        excelUtil.DoSendKeysWhenReady(driver,"SeaerchInput_XPATH", "CustomerName_TEXT", 20);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Searchbtn_XPATH", 30);
    }

    @Description("View Customer Details")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void ViewCustomerDetails() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ViewDetails_XPATH", 30);
    }

    @Description("Assert View Customer Details")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void AssertViewCustomerDetails() throws IOException, InterruptedException {
        Thread.sleep(2000);
        WebElement msg1 = driver.findElement(By.xpath(Utility.fetchLocator("AssertSearchByName_XPATH")));
        String text1 = msg1.getText();
        if (msg1.isEnabled() && text1.contains("Email Address")) {
            test.log(Status.PASS, "Search By Name Success");
        } else {
            test.log(Status.FAIL, "Search By Name Failed");
        }
    }

    @Description("Search Product")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void SearchProduct() throws IOException, InterruptedException {
        excelUtil.DoSendKeysWhenReady(driver,"SearchProductinput_XPATH", "ID_TEXT", 20);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SearchProductbtnq_XPATH", 30);
    }

    @Description("Add Product to Chart")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AddProducttoChart() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"AddBTN_XPATH", 30);
    }

    @Description("Apply Discount")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void ApplyDiscount() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"Applydiscount_XPATH", 30);
        excelUtil.DoSendKeysWhenReady(driver,"DiscountByPercent_XPATH", "10_TEXT", 30);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"OkDiscount_XPATH", 30);
        excelUtil.DoscrolltoViewClickWhenReady(driver,"ConfirmOKDiscount_XPATH", 30);
    }

    @Description("Select Region")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void SelectRegion() throws IOException, InterruptedException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"jjregion_XPATH", 30);
        excelUtil.DoSelectValuesByIndex(driver,"SelectRegion_XPATH", 2, 20);
    }

    @Description("Make Payment")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void MakePayment() throws IOException, InterruptedException {
        Thread.sleep(2000);
        WebElement ti112 = driver.findElement(By.xpath(Utility.fetchLocator("MakePayment_XPATH")));
        JavascriptExecutor jse2 = (JavascriptExecutor) driver;
        jse2.executeScript("arguments[0].scrollIntoView();", ti112);
        ti112.click();

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("PayOnline_XPATH"))).click();
    }

    @Description("Rav Pay")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 12)
    public void RavPay() throws IOException, InterruptedException {
        ravePay.RavePay2(driver);
    }

    @Description("Assert Pay Online")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 13)
    public void AssertPayOnline() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"Auth_XPATH","payon_TEXT","p11_TEXT","p12_TEXT",20);
    }
}
