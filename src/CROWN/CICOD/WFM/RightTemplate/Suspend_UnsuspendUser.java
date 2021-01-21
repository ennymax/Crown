package CROWN.CICOD.WFM.RightTemplate;
import CROWN.Base.TestBase;
import CROWN.utility.*;
import org.testng.annotations.Test;
import java.io.IOException;

public class Suspend_UnsuspendUser extends TestBase {
    @Test
    public void Suspend_UnsuspendUser() throws IOException, InterruptedException {
        Login login = new Login(driver);
        Utility utility = new Utility(driver);
        ExcelUtil excelUtil = new ExcelUtil(driver);
        JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
        Assertion assertion = new Assertion(driver);

        login.LoginNexus(driver);

        utility.DoclickWhenReady(driver,"Wfm_XPATH", "wfm_TEXT", 50);
        utility.DoclickWhenReady(driver,"UserManagement_XPATH", "Usermgt_TEXT", 50);
        utility.DoclickWhenReady(driver,"Usr_XPATH", "UsersBTN_TEXT", 50);
        //Thread.sleep(999999999);
        utility.DoclickWhenReady(driver,"UserActionBTNN_XPATH", "ActionBBTN_TEXT", 50);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"SuspendUserrr_XPATH", "SuspendUserrr_TEXT", 40);
        utility.DowaitandAcceptAlerwhenReady(driver,20);
        assertion.DoAssertContainsWhenReady(driver,"Userpasscont_XPATH", "suss_TEXT", "usersusPass_TEXT", "usersusFail_TEXT", 30);
        excelUtil.DoclickWhenReady(driver,"Okbtnnn_XPATH",20);

        utility.DoclickWhenReady(driver,"UserActionBTNN_XPATH", "ActionBBTN_TEXT", 50);
        javaScriptUtil.DoscrolltoViewClickWhenReady(driver,"UserUnsus_XPATH", "UnSuspendUserrr_TEXT", 40);
        utility.DowaitandAcceptAlerwhenReady(driver,20);
        assertion.DoAssertContainsWhenReady(driver,"Userpasscont_XPATH", "unsuss_TEXT", "userUnsusPass_TEXT", "userUnsusFail_TEXT", 30);
        excelUtil.DoclickWhenReady(driver,"Okbtnnn_XPATH",20);
    }
}
