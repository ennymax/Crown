package CROWN.CICOD.WFM.QueueTypeManagement;

import CROWN.Base.TestBase;
import CROWN.utility.Login;
import CROWN.utility.Utility;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.security.SecureRandom;

public class AddStatusToQueueType extends TestBase {

    @Test
    public void ADD_STATUSES_TO_QUEUE_TYPE() throws IOException, InterruptedException {
        Login login = new Login(driver);
        SecureRandom rn = new SecureRandom();
        int tom = rn.nextInt(15) + 1;

        login.LoginPremium(driver);

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("Wfm_XPATH"))).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("WorkOrderManager_XPATH"))).click();

        Thread.sleep(1500);
        driver.findElement(By.xpath(Utility.fetchLocator("Manage_Queue_XPATH"))).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("QueTypeUpdateActionBtn_XPATH"))).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("LinkSt_XPATH"))).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("AsDdStatusBTN_XPATH"))).click();

        Thread.sleep(2000);
        WebElement ele111 = driver.findElement(By.xpath(Utility.fetchLocator("WorkOrderStatus_XPATH")));
        Select sel11 = new Select(ele111);
        sel11.selectByIndex(tom);

        Thread.sleep(2000);
        WebElement mcj = driver.findElement(By.xpath(Utility.fetchLocator("WorkOrederPriority_XPATH")));
        mcj.clear();
        mcj.sendKeys(Utility.fetchLocator("High_TEXT") + tom);

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("CreateNewStatusa_XPATH"))).click();

        Thread.sleep(2000);
        WebElement msg =(new WebDriverWait(driver, 25)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Utility.fetchLocator("aaaaa_XPATH"))));
        String text = msg.getText();
        if (msg.isEnabled() && text.contains("Successful")) {
            test.log(Status.PASS, "New Status Added Successfully");
        } else {
            test.log(Status.FAIL, "Add Status Failed");
        }

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("OKBTN1_XPATH"))).click();
    }
}
