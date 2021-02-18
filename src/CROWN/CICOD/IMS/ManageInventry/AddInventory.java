package CROWN.CICOD.IMS.ManageInventry;

import CROWN.Base.TestBase;
import CROWN.utility.Login;
import CROWN.utility.Randomstuff;
import CROWN.utility.Utility;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.SecureRandom;

public class AddInventory extends TestBase {

    @Test
    public void ADD_INVENTORY_CATEGORY() throws IOException, InterruptedException {

        Thread.sleep(2000);
        WebElement ele1111 = driver.findElement(By.xpath(Utility.fetchLocator("CategoryAA_XPATH")));
        Select sel111 = new Select(ele1111);
        sel111.selectByIndex(2);

        Thread.sleep(1500);
        WebElement ele111d = driver.findElement(By.xpath(Utility.fetchLocator("SubCategoryA_XPATH")));
        Select sel11d = new Select(ele111d);
        sel11d.selectByIndex(2);

        driver.findElement(By.xpath(Utility.fetchLocator("IMSCODE_XPATH"))).sendKeys(Utility.fetchLocator("IMSCompanyName_TEXT") + randomWords.RandomWords());
        driver.findElement(By.xpath(Utility.fetchLocator("InventryName_XPATH"))).sendKeys(randomWords.RandomWords());
        driver.findElement(By.xpath(Utility.fetchLocator("InventryDes_XPATH"))).sendKeys(Utility.fetchLocator("Decrib_TEXT"));

        driver.findElement(By.xpath(Utility.fetchLocator("ActualUnit_XPATH"))).sendKeys("meters");
        Thread.sleep(1500);
        driver.findElement(By.xpath(Utility.fetchLocator("Group_XPATH"))).sendKeys("Drums");

        Thread.sleep(1500);
        driver.findElement(By.xpath(Utility.fetchLocator("NoinGroup_XPATH"))).sendKeys("10");
        Thread.sleep(1500);
        driver.findElement(By.xpath(Utility.fetchLocator("GeneralLedgerCode_XPATH"))).sendKeys(Utility.fetchLocator("a_TEXT") + role1 );
        Thread.sleep(1500);
        driver.findElement(By.xpath(Utility.fetchLocator("UnitPrice_XPATH"))).sendKeys("10");
        Thread.sleep(1500);
        driver.findElement(By.xpath(Utility.fetchLocator("PriceMps_XPATH"))).sendKeys("10");
        Thread.sleep(1500);
        driver.findElement(By.xpath(Utility.fetchLocator("DamilareStore_XPATH"))).sendKeys("10");
        Thread.sleep(1500);
        driver.findElement(By.xpath(Utility.fetchLocator("SubmitSubmitBTN_XPATH"))).click();

        Thread.sleep(1500);
        if (driver.findElements(By.xpath(Utility.fetchLocator("AssertManageSupplierCreation_XPATH"))).size() != 0) {
            test.log(Status.PASS, "New Inventory was Added Successfully");
        } else {
            test.log(Status.FAIL, "Inventory want Added");
        }

        driver.quit();
        System.out.println("********************ADD INVENTORY********************");
    }
}
