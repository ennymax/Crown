package CROWN.utility;

import CROWN.Base.TestBase;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RavePay extends TestBase {

    WebDriver driver;

    public RavePay(WebDriver driver) {
        this.driver = driver;
    }

    Utility utility = new Utility(driver);
    ActionsClass actionsClass = new ActionsClass(driver);

    public void RavePay3(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);

        utility.DoSendKeysWhenReady(driver, "RavePayCardnumber_XPATH", "Ca_TEXT", "CardNumber_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavePayValidTill_XPATH", "ValidTm_TEXT", "e1_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "RavePayValidTill_XPATH", "e2_TEXT", "V_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavPayCVV_XPATH", "CVVd_TEXT", "CVV_TEXT", 60);
        utility.DoclickWhenReady(driver, "fg_XPATH", "P_TEXT", 60);
    }


    public void RavePay2(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(13000);
        driver.switchTo().frame(0);

        utility.DoSendKeysWhenReady(driver, "RavePayCardnumber_XPATH", "Ca_TEXT", "CardNumber_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavePayValidTill_XPATH", "ValidTm_TEXT", "e1_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "RavePayValidTill_XPATH", "e2_TEXT", "V_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavPayCVV_XPATH", "CVVd_TEXT", "CVV_TEXT", 60);
        utility.DoclickWhenReady(driver, "fg_XPATH", "P_TEXT", 60);
        Thread.sleep(3000);
    }


    public void RavePay(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(13000);
        driver.switchTo().frame(0);

        utility.DoSendKeysWhenReady(driver, "RavePayCardnumber_XPATH", "Ca_TEXT", "CardNumber_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavePayValidTill_XPATH", "ValidTm_TEXT", "e1_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "RavePayValidTill_XPATH", "e2_TEXT", "V_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavPayCVV_XPATH", "CVVd_TEXT", "CVV_TEXT", 60);
        utility.DoclickWhenReady(driver, "fg_XPATH", "P_TEXT", 60);

        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a1_XPATH", "a11_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a2_XPATH", "a21_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a3_XPATH", "a31_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a4_XPATH", "a41_TEXT", "E_TEXT", 60);
    }

    public void RavePay1(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        Thread.sleep(13000);
        driver.switchTo().frame(0);

        utility.DoSendKeysWhenReady(driver, "RavePayCardnumber_XPATH", "Ca_TEXT", "CardNumber_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavePayValidTill_XPATH", "ValidTm_TEXT", "e1_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "RavePayValidTill_XPATH", "e2_TEXT", "V_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavPayCVV_XPATH", "CVVd_TEXT", "CVV_TEXT", 60);
        utility.DoclickWhenReady(driver, "fg_XPATH", "P_TEXT", 60);

        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a1_XPATH", "a11_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a2_XPATH", "a21_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a3_XPATH", "a31_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a4_XPATH", "a41_TEXT", "E_TEXT", 60);
    }

    public void RavePayWorkShop(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        driver.switchTo().frame("checkout");

        utility.DoSendKeysWhenReady(driver, "RavePayCardnumber_XPATH", "Ca_TEXT", "CardNumber_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavePayValidTill_XPATH", "ValidTm_TEXT", "e1_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "RavePayValidTill_XPATH", "e2_TEXT", "V_TEXT", 60);
        utility.DoSendKeysWhenReady(driver, "RavPayCVV_XPATH", "CVVd_TEXT", "CVV_TEXT", 60);
        utility.DoclickWhenReady(driver, "fg_XPATH", "P_TEXT", 60);

        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a1_XPATH", "a11_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a2_XPATH", "a21_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a3_XPATH", "a31_TEXT", "E_TEXT", 60);
        actionsClass.DoSendKeysByActionClassWhenReady(driver, "a4_XPATH", "a41_TEXT", "E_TEXT", 60);

        actionsClass.DoSendKeysByActionClassWhenReady(driver, "OTP_XPATH", "otp_TEXT", "otp_TEXT", 60);

        utility.DoclickWhenReady(driver, "AuthorizePaymentBTN_XPATH", "Authorize_TEXT", 60);
    }
}
