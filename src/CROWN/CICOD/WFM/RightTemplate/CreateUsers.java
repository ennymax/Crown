package CROWN.CICOD.WFM.RightTemplate;

import CROWN.Base.TestBase;
import CROWN.utility.*;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;
import java.security.SecureRandom;

public class CreateUsers extends TestBase {
    @Test
    public void CREATE_USER() throws IOException, InterruptedException, AWTException {
        Login login = new Login(driver);
        FileUpload fileUpload = new FileUpload();
        Utility utility = new Utility(driver);
        ExcelUtil excelUtil = new ExcelUtil(driver);
        Assertion assertion = new Assertion(driver);

        SecureRandom rn = new SecureRandom();
        int resourcetype = rn.nextInt(3) + 1;

        login.LoginNexus(driver);

        utility.DoclickWhenReady(driver,"Wfm_XPATH", "wfm_TEXT",50);
        utility.DoclickWhenReady(driver,"UserManagement_XPATH", "Usermgt_TEXT",50);
        utility.DoclickWhenReady(driver,"Usr_XPATH", "UsersBTN_TEXT",50);
        utility.DoclickWhenReady(driver,"RightTemplateUser_XPATH", "RightT_TEXT",50);
        utility.DosendKeysRandomListwordsWhenReady(driver,"NewUserFname_XPATH", "NewUser_TEXT",50);
        utility.DosendKeysRandomListwordsWhenReady(driver,"NewUserLastName_XPATH", "FirstNa_TEXT",50);
        utility.DosendKeysRandomEmailsWhenReady(driver,"NewUserEmail_XPATH", "LastNameField_TEXT",50 );
        utility.DosendKeyRRWhenReady(driver,"NewUserPhone_XPATH", "ContactPhoneNumber_TEXT", "Ph_TEXT",20);
        utility.DoSelectValuesByIndex(driver,"NewUserRightTemplate_XPATH", "ResourceT_TEXT",resourcetype, 20);
        utility.DoclickWhenReady(driver,"NewUserDepartment_XPATH", "Seler_TEXT",50);
        utility.DoclickWhenReady(driver,"NewUserA1_XPATH", "A_TEXT",50);
        utility.DoclickWhenReady(driver,"NewUserA2_XPATH", "A_TEXT",50);
        excelUtil.DoclickWhenReady(driver,"Cll_XPATH",60);
        utility.DoFileUpWhenReady(driver,"FileUpload_XPATH", "3mb_TEXT",50);
        fileUpload.UploadFileImage3MB(driver);
        utility.DosendKeysRandomNumberWhenReady(driver,"NewUserStaffID_XPATH",500000 , 60);
        utility.DosendKeysRandomListwordsWhenReady(driver,"NewserJobTittle_XPATH", "JobT_TEXT",50);
        excelUtil.DoclickWhenReady(driver,"Cll_XPATH",60);
        utility.DoclickWhenReady(driver,"NewUserRegion_XPATH", "U1_TEXT",50);
        utility.DoclickWhenReady(driver,"Newq11_XPATH", "u2_TEXT",50);
        excelUtil.DoclickWhenReady(driver,"Cll_XPATH",60);
        utility.DoclickWhenReady(driver,"CreateNewUser_XPATH", "Creta_TEXT",50);
        assertion.DoAssertContainsWhenReady(driver,"AssertNewUserCreation_XPATH","Su_TEXT" ,"DplPass_XPATH", "DplFail_XPATH",30);
        utility.DoclickWhenReady(driver,"NewUserOKBTN_XPATH","Ok_TEXT",40);
    }
}
