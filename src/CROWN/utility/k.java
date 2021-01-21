package CROWN.utility;

import CROWN.Base.TestBase;

public class k extends TestBase {

    public Login login = new Login(driver);
    protected Utility utility = new Utility(driver);
    protected ExcelUtil excelUtil = new ExcelUtil(driver);
    protected Assertion assertion = new Assertion(driver);
    protected JavaScriptUtil javaScriptUtil = new JavaScriptUtil(driver);
    protected ClickAll clickAll = new ClickAll(driver);
    protected ScreenShot screenShot = new ScreenShot(driver);

    // create an interface
    interface Language {
        void getName(String name);
    }
}
