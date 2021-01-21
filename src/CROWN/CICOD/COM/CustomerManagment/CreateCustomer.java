package CROWN.CICOD.COM.CustomerManagment;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import io.qameta.allure.Epic;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.SecureRandom;

@Epic("Create Customer")
@Story("Create Customer...")
@Listeners(InvokedMethodListeners.class)
public class CreateCustomer extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
    protected RavePay ravePay = new RavePay(driver);

    @Description("Login")
    @Severity(SeverityLevel.NORMAL)
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

    @Description("Customer Management")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void CustomerManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"Customermanagmentbtn_XPATH", "Customermanagmentbtn_XPATH", 60);
    }

    @Description("Select Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void SelectCustomer() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"SelectCustomerbtn_XPATH", "SelectCustomerbtn_XPATH", 60);
    }

    @Description("Add Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void AddCustomer() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"AdddCustomer_XPATH", "AdddCustomer_XPATH", 60);
    }

    @Description("Customer Details")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void CustomerDetails() throws IOException, InterruptedException {
        Randomstuff randomstuff = new Randomstuff();
        SecureRandom rn = new SecureRandom();
        int st = rn.nextInt(1000000) + 1;

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("FirstName_XPATH"))).sendKeys(randomstuff.ListRandom());

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("LastName_XPATH"))).sendKeys(randomstuff.ListRandom());

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("CustomerCode_XPATH"))).sendKeys("12" + st);

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("CustomerEmail_XPATH"))).sendKeys(randomstuff.ListRandom() + "@gmail.com");

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("PhoneNumber_XPATH"))).sendKeys(Utility.fetchLocator("CustomerPhoneNumber_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("HouseNumber_XPATH"))).sendKeys(Utility.fetchLocator("CustomerHouseNo_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("Street_XPATH"))).sendKeys(Utility.fetchLocator("CustomerStreet_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("LandMark_XPATH"))).sendKeys(Utility.fetchLocator("CustomerLandMark_TEXT"));

        Thread.sleep(1500);
        WebElement ele111 = driver.findElement(By.xpath(Utility.fetchLocator("CustomerState_XPATH")));
        Select sel11 = new Select(ele111);
        sel11.selectByIndex(25);

        Thread.sleep(1500);
        WebElement ele112 = driver.findElement(By.xpath(Utility.fetchLocator("CustomerLGA_XPATH")));
        Select sel12 = new Select(ele112);
        sel12.selectByIndex(15);

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("SameAddressAsCustomer_XPATH"))).click();
    }

    @Description("Save Customer")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void SaveCustomer() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"CussstomersaveBTN_XPATH", "CussstomersaveBTN_XPATH", 60);
    }

    @Description("Assert Customer Creation")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 8)
    public void AssertCustomerCreation() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"AssertCreateCustomer_XPATH","cont1_TEXT","Cuspass_TEXT","Cusfail_Text",20);
    }
}
