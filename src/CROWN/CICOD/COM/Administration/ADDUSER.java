package CROWN.CICOD.COM.Administration;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class ADDUSER extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);

    @Description("login")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 1)
    public void login() throws IOException, InterruptedException {
        login.Login(driver);
    }

    @Description("Customer Order Management")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 2)
    public void CustomerOrderManagement() throws IOException, InterruptedException {
        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT", 60);
    }

    @Description("Administration Module")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 3)
    public void AdministrationModule() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("Adminbtn_XPATH"))).click();
    }

    @Description("User Management Button")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 4)
    public void UserManagementButton() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("UserManagementbtn_XPATH"))).click();
    }

    @Description("AddUser Button")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 5)
    public void AddUserButton() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("AddUserbtn_XPATH"))).click();
    }

    @Description("Selecting Role")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 6)
    public void SelectingRole() throws IOException, InterruptedException {
        Thread.sleep(1000);
        WebElement ele111c = driver.findElement(By.xpath(Utility.fetchLocator("Role_XPATH")));
        Select sel11c = new Select(ele111c);
        sel11c.selectByIndex(1);
    }

    @Description("Selecting Region")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 7)
    public void SelectingRegion() throws IOException, InterruptedException {
        Thread.sleep(1000);
        WebElement ele111ca = driver.findElement(By.xpath(Utility.fetchLocator("Region_XPATH")));
        Select sel11ca = new Select(ele111ca);
        sel11ca.selectByIndex(1);
    }

    @Description("First Name")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 8)
    public void FirstName() throws IOException, InterruptedException {
        Thread.sleep(2000);
        Randomstuff randomstuff = new Randomstuff();
        driver.findElement(By.xpath(Utility.fetchLocator("RFirsteName_XPATH"))).sendKeys(randomstuff.ListRandom());
    }

    @Description("Last Name")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 9)
    public void LastName() throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.findElement(By.xpath(Utility.fetchLocator("RLastName_XPATH"))).sendKeys(Utility.fetchLocator("CustomerLastName_TEXT"));
    }

    @Description("Phone Number")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 10)
    public void PhoneNumber() throws IOException, InterruptedException {
        Thread.sleep(1200);
        driver.findElement(By.xpath(Utility.fetchLocator("RPhoneNumber_XPATH"))).sendKeys(Utility.fetchLocator("CustomerPhoneNumber_TEXT"));
    }

    @Description("Email")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 11)
    public void Email() throws IOException, InterruptedException {
        Thread.sleep(2000);
        Randomstuff randomstuff = new Randomstuff();
        driver.findElement(By.xpath(Utility.fetchLocator("REmail_XPATH"))).sendKeys(randomstuff.ListRandom() + "@gmail.com");
    }

    @Description("ADD USER")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 12)
    public void ADD_USER() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("CreateUserSaveBTN_XPATH"))).click();
    }

    @Description("Assert Add User")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 13)
    public void AssertAddUser() throws IOException, InterruptedException {
        assertion.DoAssertContainsWhenReady(driver,"AssertAddUser_XPATH", "containUser_TEXT", "ContainUserPass_TEXT","ContainUserFail_TEXT",20);
    }
}

