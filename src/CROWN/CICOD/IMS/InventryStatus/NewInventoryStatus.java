package CROWN.CICOD.IMS.InventryStatus;

import CROWN.Base.TestBase;
import CROWN.utility.*;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewInventoryStatus extends TestBase {

    @Test
    public void NEM_INVENTORY_STATUS() throws Exception {
        test = extent.createTest("NEW INVENTORY STATUS");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.cicod.com/login");

        Login login = new Login(driver);
        Randomstuff randomWords = new Randomstuff();

        Thread.sleep(2000);
        if (driver.findElements(By.xpath(Utility.fetchLocator("AssertLogin_XPATH"))).size() != 0) {
            test.log(Status.PASS, "Login was successful");
        } else {
            test.log(Status.FAIL, "Login failed");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("IMS_XPATH"))).click();

        Thread.sleep(2000);
        WebElement element11 = driver.findElement(By.xpath(Utility.fetchLocator("InventoryStatusBTN_XPATH")));
        Actions action = new Actions(driver);
        action.moveToElement(element11).click();


        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("InventoryStatusBTN_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        Thread.sleep(500);
        if (driver.findElements(By.xpath(Utility.fetchLocator("AssertInventStatus_XPATH"))).size() != 0) {
            test.log(Status.PASS, "Inventory Status is present");
        } else {
            test.log(Status.FAIL, "Inventory Status is not present");
        }

        Thread.sleep(500);
        if (driver.findElements(By.xpath(Utility.fetchLocator("AssertInventoryStatusRule_XPATH"))).size() != 0) {
            test.log(Status.PASS, "Inventory Status rule is present");
        } else {
            test.log(Status.FAIL, "Supplier rule Not Created");
        }

        Thread.sleep(500);
        if (driver.findElements(By.xpath(Utility.fetchLocator("AssertUpdateInventoryStatus_XPATH"))).size() != 0) {
            test.log(Status.PASS, "Update Inventory Status rule is present");
        } else {
            test.log(Status.FAIL, "Update Inventory Status rule is not present");
        }

        Thread.sleep(2000);
        WebElement elementt = driver.findElement(By.xpath(Utility.fetchLocator("InVentoryStatus_XPATH")));
        JavascriptExecutor jst = (JavascriptExecutor) driver;
        jst.executeScript("arguments[0].click();", elementt);

        Thread.sleep(2000);
        WebElement elementtl = driver.findElement(By.xpath(Utility.fetchLocator("AddNNewInventryStatus_XPATH")));
        JavascriptExecutor jstl = (JavascriptExecutor) driver;
        jstl.executeScript("arguments[0].click();", elementtl);

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("StatusName_XPATH"))).sendKeys(Utility.fetchLocator("CompanyNameTest_TEXT") + randomWords.RandomWords());

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("StatusDescription_XPATH"))).sendKeys(Utility.fetchLocator("Decrib_TEXT") + randomWords.RandomWords());

        driver.findElement(By.xpath(Utility.fetchLocator("NewStatusSubmitBTN_XPATH"))).click();

        Thread.sleep(500);
        if (driver.findElements(By.xpath(Utility.fetchLocator("AssertNewStatusCreation_XPATH"))).size() != 0) {
            test.log(Status.PASS, "New Status Created Successfully");
        } else {
            test.log(Status.FAIL, "New Status Cant br created");
        }

        driver.quit();
        System.out.println("********************NEW INVENTORY STATUS********************");
    }
}
