package CROWN.CICOD.COM.WorkShopConfiguration;

import CROWN.Base.TestBase;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.context.annotation.Description;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class CarouselBanner extends TestBase {

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

    @Description("WorkShop Configuration")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 3)
    public void WorkShopConfiguration() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady("WorkShopConfiguration_XPATH", "WorkShopConfiguration_XPATH", 60);
    }

    @Description("Carousel Banner")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 4)
    public void CarouselBanner() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady("CarouselBanner_XPATH", "CarouselBanner_XPATH", 60);
    }

    @Description("Add Corusel Banner")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 5)
    public void AddCoruselBanner() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DoclickWhenReady("AddCoruselBanner_XPATH", "AddCoruselBanner_XPATH", 60);
    }

    @Description("Caption")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 6)
    public void Caption() throws IOException, InterruptedException {
        Utility utility = new Utility(driver);
        utility.DosendKeysRandomListwordsWhenReady("Caption_XPATH", "Caption_XPATH", 60);
    }

    @Description("Display Location")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 7)
    public void DisplayLocation() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSelectValuesByIndex("DisplayLocation_XPATH", 1, 20);
    }

    @Description("Order Of Preference")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void OrderOfPreference() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSendKeysWhenReady("OrderOfAppearance_XPATH", "OrderOfPreference_TEXT", 20);
    }

    @Description("Action Url")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 9)
    public void ActionUrl() throws IOException, InterruptedException {
        ExcelUtil excelUtil = new ExcelUtil(driver);
        excelUtil.DoSendKeysWhenReady("ActiUERL_XPATH", "ActionUrl_TEXT", 20);
    }

    @Description("CAROUSEL_BANNER")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 10)
    public void CAROUSEL_BANNER() throws IOException, InterruptedException, AWTException {
        FileUpload fileUpload = new FileUpload();

        Thread.sleep(2000);
        WebElement ti11 = driver.findElement(By.xpath("//input[@type='file']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", ti11);

        Thread.sleep(2000);
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("//input[@type='file']"))).click().build().perform();

        Thread.sleep(4000);
        fileUpload.UploadFileImage3MB();

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("CarouselSaveBtn_XPATH"))).click();
    }

    @Description("Assert CAROUSEL BANNER")
    @Severity(SeverityLevel.CRITICAL)
    @Test(priority = 11)
    public void Assert_CAROUSEL_BANNER() throws IOException, InterruptedException {
        Assertion assertion = new Assertion(driver);
        assertion.DoAssertEqualWhenReady("AssertBanner_XPATH", "BannerAssertin_TEXT", "BannerAssertinPass_TEXT", "BannerAssertinFail_TEXT", 20);
    }
}
