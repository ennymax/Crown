package CROWN.CICOD.COM.Administration;

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
public class UPDATE_ROLE extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected ClickAll clickAll = new ClickAll(driver);

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

    @Description("Role Management Button")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 4)
    public void RoleManagementButton() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("Rolemanagementbtn_XPATH"))).click();
    }

    @Description("Update Role")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 5)
    public void UpdateRole() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("RoleActionbtn_XPATH"))).click();

        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("RoleUpdatebtn_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    @Description("Click All Role")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 6)
    public void ClickAllRole() throws IOException, InterruptedException, AWTException {
        clickAll.ClickAll(driver,"aa_CLASS");
    }

    @Description("Save Role")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 7)
    public void SaveRole() throws IOException, InterruptedException, AWTException {
        excelUtil.DoscrolltoViewClickWhenReady(driver,"SaveRole1_XPATH",20);
    }

    @Description("Assert Unsuspend Role")
    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 8)
    public void AssertUpdateRole() throws IOException, InterruptedException, AWTException {
        Thread.sleep(2000);
        if (driver.findElements(By.xpath(Utility.fetchLocator("assertUpdateRole_XPATH"))).size() != 0) {
            test.log(Status.PASS, "Role was successfully Updated");
        } else {
            test.log(Status.FAIL, "Role cant be update");
        }
    }
}
