package CROWN.CICOD.COM.ValueChain;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.Assertion;
import CROWN.utility.JavaScriptUtil;
import CROWN.utility.Login;
import CROWN.utility.Utility;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class Set_Spend_and_Assert_Minimum_Spend extends TestBase {
    @Test
    public void Set_Spend_and_Assert_Minimum_Spend() throws IOException, InterruptedException {
        Login login = new Login(driver);
        Utility utility = new Utility(driver);
        JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
        Assertion assertion = new Assertion(driver);


        login.Login(driver);

        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainBTN_XPATH", "VChainbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainByers_XPATH", "Buyersbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"BuyerActionBTN_XPATH", "BuyerActbtn_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SetminimumspendBTN_XPATH","mimiSpedn_TEXT",60);
        utility.DoSendKeysWhenReady(driver,"InputMiniSp_XPATH","SpenAMt_TEXT","SpenAMt_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SaveMiniSpend_XPATH","Savem_TEXT",60);
        assertion.DoAssertContainsWhenReady(driver,"Assertminispendalert_XPATH","Conty_TEXT","minispendasspass_TEXT","minispendassertfail_TEXT",60);

        Thread.sleep(2000);
        driver.navigate().to("https://www.cicod.com/login");

        login.LoginDefault(driver);

        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainBTN_XPATH", "VChainbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"Suppliers_XPATH", "VChainbtn_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"BuyerActionBTN_XPATH","But_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SuppliersProduct_XPATH","Supplbu_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"CreateOrderfromSuppler_XPATH","CretOrer_TEXT",60);
        assertion.DoAssertEqualWhenReady(driver,"AssertMinimuspend_XPATH","1,000.00","Aminspass_TEXT","Aminsfail_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"ProductCategoryPlus_XPATH","ProductCa_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SelectBeverages_XPATH","SelectBeve_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"MakePayment_XPATH","Makepa_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"PayOnline_XPATH","Payoo_TEXT",60);
        utility.DoswitchtoframeWhenReady(driver,0,13000);
        assertion.DoAssertEqualWhenReady(driver,"ASSenable_XPATH","NGN1,522.50","Aminspedpass_TEXT","AminspedFaled_TEXT",90);

        Thread.sleep(2000);
        driver.navigate().to("https://www.cicod.com/login");

        login.Login(driver);

        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainBTN_XPATH", "VChainbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainByers_XPATH", "Buyersbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"BuyerActionBTN_XPATH", "BuyerActbtn_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SetminimumspendBTN_XPATH","mimiSpedn_TEXT",60);
        driver.findElement(By.xpath(Utility.fetchLocator("InputMiniSp_XPATH"))).clear();
        driver.findElement(By.xpath(Utility.fetchLocator("InputMiniSp_XPATH"))).sendKeys("1");
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SaveMiniSpend_XPATH","Savem_TEXT",60);
    }
}
