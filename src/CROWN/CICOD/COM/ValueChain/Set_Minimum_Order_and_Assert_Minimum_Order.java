package CROWN.CICOD.COM.ValueChain;

import CROWN.Base.TestBase;
import CROWN.Listeners.InvokedMethodListeners;
import CROWN.utility.*;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.io.IOException;

@Listeners(InvokedMethodListeners.class)
public class Set_Minimum_Order_and_Assert_Minimum_Order extends TestBase {

    protected Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected Assertion assertion = new Assertion(driver);
    protected RavePay ravePay = new RavePay(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);


    @Test
    public void Set_Minimum_Order_and_Assert_Minimum_Order() throws IOException, InterruptedException {

        login.Login(driver);

        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainBTN_XPATH", "VChainbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainByers_XPATH", "Buyersbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"BuyerActionBTN_XPATH", "BuyerActbtn_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"setminimumOrderBTN_XPATH","mii_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"updatemini_XPATH","updatemini_TEXT",60);
        utility.DoSendKeysWhenReady(driver,"enterminiOre_XPATH","inputmim_TEXT","tt_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"saveminiOrder_XPATH","SaveMiniOrder_TEXT",60);

        Thread.sleep(2000);
        driver.navigate().to("https://www.cicod.com/login");

        login.LoginDefault(driver);

        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainBTN_XPATH", "VChainbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"Suppliers_XPATH", "VChainbtn_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"BuyerActionBTN_XPATH","But_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SuppliersProduct_XPATH","Supplbu_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"CreateOrderfromSuppler_XPATH","CretOrer_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"ProductCategoryPlus_XPATH","ProductCa_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SelectBeverages_XPATH","SelectBeve_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);

        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"AddProduct_XPATH","Addpro_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"MakePayment_XPATH","Makepa_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"PayOnline_XPATH","Payoo_TEXT",60);
        utility.DoswitchtoframeWhenReady(driver,0,13000);
        assertion.DoAssertEqualWhenReady(driver,"ASSenable_XPATH","NGN304.50","AmimPass_TEXT","AminiFail_TEXT",90);

        Thread.sleep(2000);
        driver.navigate().to("https://www.cicod.com/login");

        login.Login(driver);

        utility.DoclickWhenReady(driver,"com_XPATH", "comm_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainBTN_XPATH", "VChainbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"ValuechainByers_XPATH", "Buyersbtn_TEXT",60);
        utility.DoclickWhenReady(driver,"BuyerActionBTN_XPATH", "BuyerActbtn_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"setminimumOrderBTN_XPATH","mii_TEXT",60);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"updatemini_XPATH","updatemini_TEXT",60);
        driver.findElement(By.xpath(Utility.fetchLocator("enterminiOre_XPATH"))).clear();
        driver.findElement(By.xpath(Utility.fetchLocator("enterminiOre_XPATH"))).sendKeys("1");
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"saveminiOrder_XPATH","SaveMiniOrder_TEXT",60);
    }
}
