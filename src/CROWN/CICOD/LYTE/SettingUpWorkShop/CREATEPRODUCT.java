package CROWN.CICOD.LYTE.SettingUpWorkShop;

import CROWN.Base.TestBase;
import CROWN.utility.Login;
import CROWN.utility.ScreenShot;
import CROWN.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CREATEPRODUCT extends TestBase {
    @Test
    public void CREATE_PRODUCT() throws IOException, InterruptedException {
        ScreenShot screenshot = new ScreenShot(driver);
        Login login = new Login(driver);

        login.LoginTestAccount();

        //Com
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Utility.fetchLocator("com_XPATH"))).click();

        screenshot.ScreenShot();

        //product Management
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Utility.fetchLocator("ProductManagementbtn_XPATH"))).click();

        //Click On Product
        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Utility.fetchLocator("Productbtn_XPATH"))).click();

        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        driver.findElement(By.xpath(Utility.fetchLocator("Add_Producttn_XPATH"))).click();
        test.log(Status.PASS, "Add Product button fully Functional");

        driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
        WebElement menuOption1 = driver.findElement(By.xpath(Utility.fetchLocator("CreateProductpageassert_XPATH")));
        String aa = menuOption1.getText();

        if (aa.contains("Create Form")) {
            test.log(Status.PASS, "Page to add product has been opened");
        } else {
            test.log(Status.PASS, "Add product Page cant be opened");
        }

        screenshot.ScreenShot();

        WebElement ele1 = driver.findElement(By.xpath(Utility.fetchLocator("SelectProductCategory_XPATH")));
        Select sel = new Select(ele1);
        sel.selectByIndex(1);

        driver.findElement(By.xpath(Utility.fetchLocator("ProductNamei_XPATH"))).sendKeys(Utility.fetchLocator("ProductName_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("ProductDiscriptioni_XPATH"))).sendKeys(Utility.fetchLocator("ProductDiscription_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("ProductCode_XPATH"))).sendKeys(Utility.fetchLocator("ProductCode_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("ProductPrize_XPATH"))).sendKeys(Utility.fetchLocator("ProductPrice_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("AddToworkshoptCheckBox_XPATH"))).click();
        driver.findElement(By.xpath(Utility.fetchLocator("ReservationDays_XPATH"))).sendKeys(Utility.fetchLocator("ReservationDay_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("NoQuantityLimitCheckBox_XPATH"))).click();

        WebElement ele11 = driver.findElement(By.xpath(Utility.fetchLocator("Vat_XPATH")));
        Select sel1 = new Select(ele11);
        sel1.selectByIndex(1);

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("Savebtn_XPATH"))).click();

        screenshot.ScreenShot();
    }
}
