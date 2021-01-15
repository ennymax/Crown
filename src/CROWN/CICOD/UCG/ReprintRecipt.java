package CROWN.CICOD.UCG;

import CROWN.Base.TestBase;
import CROWN.utility.Login;
import CROWN.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.io.IOException;

public class ReprintRecipt extends TestBase {

    @Test
    public void REPRINT_RECEIPT() throws IOException, InterruptedException {
        Login login = new Login(driver);

        login.LoginCorrectDetails();

        Thread.sleep(1200);
        driver.findElement(By.xpath(Utility.fetchLocator("UcgBTN_XPATH"))).click();

        Thread.sleep(1200);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("CollectionBTN_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        Thread.sleep(1200);
        WebElement element1 = driver.findElement(By.xpath(Utility.fetchLocator("AllCollectionBTN_XPATH")));
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].click();", element1);

        //SEARCH WITH INVOICE NUMBER
        Thread.sleep(1200);
        WebElement ele11p = driver.findElement(By.xpath(Utility.fetchLocator("DropDown_XPATH")));
        Select sel1p = new Select(ele11p);
        sel1p.selectByVisibleText("TRANSACTION ID");

        Thread.sleep(1200);
        WebElement jjla = driver.findElement(By.xpath(Utility.fetchLocator("SearchCollectionInputBox_XPATH")));
        jjla.clear();
        jjla.sendKeys(Utility.fetchLocator("TransactionID_TEXT"));

        Thread.sleep(1200);
        WebElement elementPPO = driver.findElement(By.xpath(Utility.fetchLocator("jj_XPATH")));
        JavascriptExecutor jsPPO = (JavascriptExecutor) driver;
        jsPPO.executeScript("arguments[0].click();", elementPPO);

        Thread.sleep(2000);
        WebElement Elementlb = driver.findElement(By.xpath(Utility.fetchLocator("SearchBTN_XPATH")));
        JavascriptExecutor jsklb = (JavascriptExecutor) driver;
        jsklb.executeScript("arguments[0].scrollIntoView();", Elementlb);

        Thread.sleep(3000);
        WebElement elementPPOw = driver.findElement(By.xpath(Utility.fetchLocator("ReprintBTN_XPATH")));
        JavascriptExecutor jsPPOw = (JavascriptExecutor) driver;
        jsPPOw.executeScript("arguments[0].click();", elementPPOw);

        Thread.sleep(3000);

        /*
        WebElement elementPPOwk = driver.findElement(By.xpath(Utility.fetchLocator("PrintBTN_XPATH")));
        JavascriptExecutor jsPPOwk = (JavascriptExecutor) driver;
        jsPPOwk.executeScript("arguments[0].click();", elementPPOwk);
        */
    }
}