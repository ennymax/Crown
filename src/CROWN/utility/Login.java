package CROWN.utility;

import org.openqa.selenium.*;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Login {

    WebDriver driver;
    Utility utility1 = new Utility(driver);
    ActionsClass utility = new ActionsClass(driver);

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void AcceptAlert(WebDriver driver) throws IOException, InterruptedException {
        if (driver.switchTo().alert() != null) {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        }
    }

    public void AlertDismis(WebDriver driver) throws IOException, InterruptedException {
        if (driver.switchTo().alert() != null) {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        }
    }

    public void LoginDef1(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "DefShopName_TEXT", "DefShopName_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "DefEmail_TEXT", "DefEmail_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "DefPassword_TEXT", "DefPassword_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginNexus(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "NexusDomainName1_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "NexusEmail1_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "NexusPassword1_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginPremium(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "PshopName_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "Pemail_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "Ppassword_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginWrongDomainName(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "DefaultShopName_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "UcgEmail1_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "UcgPassword1_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginWrongEmail(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "UcgDomainName1_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "DefaultEmail_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "UcgPassword1_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginWrongPassWord(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "UcgDomainName1_TEXT", "UcgDomainName1_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "UcgEmail1_TEXT", "UcgEmail1_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "DefaultPassWord_TEXT", "UcgPassword1_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginCorrectDetails(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "UcgDomainName1_TEXT", "UcgDomainName1_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "UcgEmail1_TEXT", "UcgEmail1_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "UcgPassword1_TEXT", "UcgPassword1_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginDefault(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "DefaultShop_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "Defem_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "defpass_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void Loginlupin(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "lupinDomainName_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "lupinEmail_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "lupinPass_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void Login1(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "NexusDomainName1_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "NexusEmail1_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "NexusPassword1_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void Login(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "NexusDomainName1_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "NexusEmail1_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "NexusPassword1_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginExpiredAccount(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "Cshopname_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "Cemail_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "Cpassword_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginUpgrade(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "TestShopName_XPATH", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "TestEmail_XPATH", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "UpPassword_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginTestAccount(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "Shopname_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "Email_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "Password_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }

    public void LoginTestAccountSetUp(WebDriver driver) throws IOException, InterruptedException {
        driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) Utility.fetchProperty("implicit.wait")), TimeUnit.SECONDS);
        utility.DoSendKeysByActionClassWhenReady(driver, "DomainName_XPATH", "Ashop_TEXT", "DOma_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Email_XPATH", "Aemail_TEXT", "Emailf_TEXT", 20);
        utility.DoSendKeysByActionClassWhenReady(driver, "Password_XPATH", "Apassword_TEXT", "Passw_TEXT", 20);
        utility1.DoclickWhenReady(driver, "LoginBTN_XPATH", "Logi_TEXT", 30);
    }


    public void LoginMultipleAccountEKEDC(WebDriver driver) throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("Loginbtn_XPATH"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("Lemail_XPATH"))).sendKeys(Utility.fetchLocator("MultiEMail_TEXT"));
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("Lpassword_XPATH"))).sendKeys(Utility.fetchLocator("MultiPassword_TEXT"));

        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("Lcheckbox_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("ActualRegisterBTN_XPATH"))).click();
    }

    public void LoginEKEDC(WebDriver driver) throws IOException, InterruptedException {

        driver.findElement(By.xpath(Utility.fetchLocator("Loginbtn_XPATH"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(Utility.fetchLocator("Lemail_XPATH"))).sendKeys(Utility.fetchLocator("ExistEmail_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("Lpassword_XPATH"))).sendKeys(Utility.fetchLocator("password_TEXT"));

        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("Lcheckbox_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        driver.findElement(By.xpath(Utility.fetchLocator("ActualRegisterBTN_XPATH"))).click();
    }


    public void Login_with_RegEmailEKEDC(WebDriver driver) throws IOException {

        driver.findElement(By.xpath(Utility.fetchLocator("Loginbtn_XPATH"))).click();
        driver.findElement(By.xpath(Utility.fetchLocator("Lemail_XPATH"))).sendKeys(Utility.fetchLocator("ExistEmail_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("Lpassword_XPATH"))).sendKeys(Utility.fetchLocator("password_TEXT"));

        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("Lcheckbox_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        driver.findElement(By.xpath(Utility.fetchLocator("ActualRegisterBTN_XPATH"))).click();

    }

    public void Login_with_Wrong_EmailEKEDC(WebDriver driver) throws IOException {

        driver.findElement(By.xpath(Utility.fetchLocator("Loginbtn_XPATH"))).click();
        driver.findElement(By.xpath(Utility.fetchLocator("Lemail_XPATH"))).sendKeys(Utility.fetchLocator("WrongEmail_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("Lpassword_XPATH"))).sendKeys(Utility.fetchLocator("RegNumber_TEXT"));

        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("Lcheckbox_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        driver.findElement(By.xpath(Utility.fetchLocator("ActualRegisterBTN_XPATH"))).click();

    }

    public void Login_with_Wrong_PasswordEKEDC(WebDriver driver) throws IOException {

        driver.findElement(By.xpath(Utility.fetchLocator("Loginbtn_XPATH"))).click();
        driver.findElement(By.xpath(Utility.fetchLocator("Lemail_XPATH"))).sendKeys(Utility.fetchLocator("WrongEmail_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("Lpassword_XPATH"))).sendKeys(Utility.fetchLocator("WrongPassword_TEXT"));

        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("Lcheckbox_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        driver.findElement(By.xpath(Utility.fetchLocator("ActualRegisterBTN_XPATH"))).click();

    }


    public void Login_PostPaidLandlordEKEDC(WebDriver driver) throws IOException {

        driver.findElement(By.xpath(Utility.fetchLocator("Loginbtn_XPATH"))).click();
        driver.findElement(By.xpath(Utility.fetchLocator("Lemail_XPATH"))).sendKeys(Utility.fetchLocator("EEmail_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("Lpassword_XPATH"))).sendKeys(Utility.fetchLocator("EPassword_TEXT"));

        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("Lcheckbox_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        driver.findElement(By.xpath(Utility.fetchLocator("ActualRegisterBTN_XPATH"))).click();
    }

    public void LoginPrePaidEKEDC(WebDriver driver) throws IOException {

        driver.findElement(By.xpath(Utility.fetchLocator("Loginbtn_XPATH"))).click();
        driver.findElement(By.xpath(Utility.fetchLocator("Lemail_XPATH"))).sendKeys(Utility.fetchLocator("PreEmail_TEXT"));
        driver.findElement(By.xpath(Utility.fetchLocator("Lpassword_XPATH"))).sendKeys(Utility.fetchLocator("PrePassword_TEXT"));

        WebElement element = driver.findElement(By.xpath(Utility.fetchLocator("Lcheckbox_XPATH")));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

        driver.findElement(By.xpath(Utility.fetchLocator("ActualRegisterBTN_XPATH"))).click();
    }
}
